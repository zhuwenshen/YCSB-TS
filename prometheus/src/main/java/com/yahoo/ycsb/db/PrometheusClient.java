package com.yahoo.ycsb.db;

import com.sun.net.ssl.internal.www.protocol.https.HttpsURLConnectionOldImpl;
import com.yahoo.ycsb.ByteIterator;
import com.yahoo.ycsb.DB;
import com.yahoo.ycsb.DBException;
import com.yahoo.ycsb.StringByteIterator;
import io.prometheus.client.CollectorRegistry;
import io.prometheus.client.Gauge;
import io.prometheus.client.exporter.PushGateway;
import org.apache.http.*;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.utils.URIUtils;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;

import org.apache.http.util.EntityUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.*;
import java.net.*;
import java.sql.Timestamp;
import java.text.*;
import java.util.*;
import java.util.concurrent.TimeUnit;


/**
 * Prometheus client for YCSB framework.
 */
public class PrometheusClient extends DB {
    private final int SUCCESS = 0;
    URL urlQuery = null;
    URL urlPut = null;
    private String ip_pushgateway = "localhost";
    private String ip_server = "localhost";
    private String putURL = "/api/put";
    private int port_pushgateway = 9091;
    private int port_server = 9090;
    private boolean _debug = false;
    private boolean filterForTags = true;
    private boolean useCount = true;
    private boolean useMs = true;
    private boolean usePlainTextFormat = true;
    private CloseableHttpClient client;
    private int retries = 3;
    private boolean test = false;

        private static final DateFormat rfc3339Format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSXXX");
    private static final String metricRegEx = "[a-zA-Z_:][a-zA-Z0-9_:]*";
    private String queryURLInfix = "/api/v1/query";

    /**
     * Initialize any state for this DB.
     * Called once per DB instance; there is one DB instance per client thread.
     */
    @Override
    public void init() throws DBException {
        try {
            test = Boolean.parseBoolean(getProperties().getProperty("test", "false"));

            if (!getProperties().containsKey("ip_server") && !test) {
                throw new DBException("No ip_server given, abort.");
            }
            ip_server = getProperties().getProperty("ip_server", ip_server);

            if (!getProperties().containsKey("port_server") && !test) {
                throw new DBException("No port_server given, abort.");
            }
            port_server = Integer.parseInt(getProperties().getProperty("port_server", String.valueOf(port_server)));

            if (!getProperties().containsKey("ip_pushgateway") && !test) {
                throw new DBException("No ip_pushgateway given, abort.");
            }
            ip_pushgateway = getProperties().getProperty("ip_pushgateway", ip_pushgateway);
            if (!getProperties().containsKey("port_pushgateway") && !test) {
                throw new DBException("No port_pushgateway given, abort.");
            }
            port_pushgateway = Integer.parseInt(getProperties().getProperty("port_pushgateway", String.valueOf(port_pushgateway)));

            if (_debug) {
                System.out.println("The following properties are given: ");
                for (String element : getProperties().stringPropertyNames()) {
                    System.out.println(element + ": " + getProperties().getProperty(element));
                }
            }
            usePlainTextFormat = Boolean.parseBoolean(getProperties().getProperty("plainTextFormat", "true"));
            filterForTags = Boolean.parseBoolean(getProperties().getProperty("filterForTags", "true"));
            useCount = Boolean.parseBoolean(getProperties().getProperty("useCount", "true"));
            useMs = Boolean.parseBoolean(getProperties().getProperty("useMs", "true"));
            RequestConfig requestConfig = RequestConfig.custom().build();
            if (!test) {
                client = HttpClientBuilder.create().setDefaultRequestConfig(requestConfig).build();
            }
        } catch (Exception e) {
            throw new DBException(e);
        }

        try {
            urlQuery = new URL("http", ip_pushgateway, port_pushgateway, queryURLInfix);
            if (_debug) {
                System.out.println("URL: " + urlQuery);
            }
            urlPut = new URL("http", ip_pushgateway, port_pushgateway, putURL);
            if (_debug) {
                System.out.println("URL: " + urlPut);
            }
        } catch (MalformedURLException e) {
            throw new DBException(e);
        }
    }

    private JSONArray runQuery(URL url, String queryStr) {
        JSONArray jsonArr = new JSONArray();
        HttpResponse response = null;
        try {
            HttpPut postMethod = new HttpPut(url.toURI());

            StringEntity requestEntity = new StringEntity(
                    queryStr + "\n");
            requestEntity.setContentType("text/html; charset=UTF-8\\n; version=0.0.4;");
            postMethod.addHeader("host", ip_pushgateway);
            postMethod.addHeader("Accept", "application/json");
            postMethod.setEntity(requestEntity);

            int tries = retries + 1;
            while (true) {
                tries--;
                try {
                    response = client.execute(postMethod);
                    String inputLine = "";
                    BufferedReader br = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
                    try {
                        while ((inputLine = br.readLine()) != null) {
                            System.out.println("1" + inputLine);
                        }
                        br.close();
                    } catch (IOException e) {
                        //e.printStackTrace();
                    }
                    break;
                } catch (IOException e) {
                    if (tries < 1) {
                        System.err.print("ERROR: Connection to " + url.toString() + " failed " + retries + "times.");
                        e.printStackTrace();
                        if (response != null) {
                            EntityUtils.consumeQuietly(response.getEntity());
                        }
                        postMethod.releaseConnection();
                        return null;
                    }
                }
            }
            if (response.getStatusLine().getStatusCode() >= 200 && response.getStatusLine().getStatusCode() < 300) {
                if (response.getStatusLine().getStatusCode() == HttpURLConnection.HTTP_MOVED_PERM) {
                    System.err.println("WARNING: Query returned 301, that means 'API call has migrated or should be forwarded to another server'");
                }
                if (response.getStatusLine().getStatusCode() == HttpsURLConnectionOldImpl.HTTP_ACCEPTED) {
                    // The pushgateway does not include an entity in the response when inserting
                    if (response.getEntity().getContent().available() == 0) {
                        jsonArr = new JSONArray();
                        return jsonArr;
                    }
                }
                if (response.getStatusLine().getStatusCode() != HttpURLConnection.HTTP_NO_CONTENT) {
                    // Maybe also not HTTP_MOVED_PERM? Can't Test it right now
                    BufferedReader bis = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
                    StringBuilder builder = new StringBuilder();
                    String line;
                    while ((line = bis.readLine()) != null) {
                        builder.append(line);
                    }
                    jsonArr = new JSONArray(builder.toString());
                }
                EntityUtils.consumeQuietly(response.getEntity());
                postMethod.releaseConnection();
            }

        } catch (Exception e) {
            System.err.println("ERROR: Error while trying to query " + url.toString() + " for '" + queryStr + "'.");
            e.printStackTrace();
            if (response != null) {
                EntityUtils.consumeQuietly(response.getEntity());
            }
            return null;
        }
        return jsonArr;
    }

    /**
     * Cleanup any state for this DB.
     * Called once per DB instance; there is one DB instance per client thread.
     */
    @Override
    public void cleanup() throws DBException {
        try {
            if (!test) {
                client.close();
            }
        } catch (Exception e) {
            throw new DBException(e);
        }
    }

    /**
     * Read a record from the database. Each value from the result will be stored in a HashMap
     *
     * @param metric    The name of the metric
     * @param timestamp The timestamp of the record to read.
     * @param tags      actual tags that were want to receive (can be empty)
     * @return Zero on success, a non-zero error code on error or "not found".
     */
    @Override
    public int read(String metric, Timestamp timestamp, HashMap<String, ArrayList<String>> tags) {
        if (metric == null || metric == "" || !metric.matches(metricRegEx)) {
            return -1;
        }
        if (timestamp == null) {
            return -1;
        }
        int tries = retries + 1;
        HttpGet getMethod = null;
        String queryString = "";
        String parametrizedURI = "";
        HttpResponse response = null;
        JSONObject responseData = null;
        JSONObject metricResponseData = null;
        JSONArray valueResponseData = null;

        // Construct query

        DecimalFormatSymbols symbols = DecimalFormatSymbols.getInstance();
        symbols.setDecimalSeparator('.');
        NumberFormat timestampFormat = new DecimalFormat("###.###", symbols);

        for (Map.Entry entry : tags.entrySet()) {
            queryString += entry.getKey() + "=~\"";
            ArrayList<String> values = (ArrayList<String>) entry.getValue();
            for (int i = 0; i < values.size(); i++) {
                queryString += values.get(i)
                        + (i + 1 < (values.size()) ? "|" : "");
            }
            queryString += "\",";
        }
        queryString = "{" + queryString.substring(0, queryString.length() - 1) + "}";

        try {
            queryString = URLEncoder.encode(queryString, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            System.out.println("Oh snap!");
        }

        queryString = "?query=" + metric + queryString;
        queryString += "&time=" + rfc3339Format.format(new Date(timestamp.getTime())).replace("+", "%2B");

        if (_debug)
            System.out.println("Input Query: " + urlQuery.toString() + queryString);
        getMethod = new HttpGet(urlQuery.toString() + queryString);
        while (true) {
            // TODO really try tries-times
            tries--;
            try {
                if (test)
                    return SUCCESS;

                response = client.execute(getMethod);

                String inputLine = "";
                String content = "";
                BufferedReader br = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
                try {
                    while ((inputLine = br.readLine()) != null) {
                        content += inputLine;
                    }
                    br.close();
                } catch (IOException e) {
                    //e.printStackTrace();
                }
                responseData = new JSONObject(content);

                if (responseData.getString("status").equals("success")) {

                    try {
                        metricResponseData = responseData.getJSONObject("data").getJSONArray("result").getJSONObject(0).getJSONObject("metric");
                        valueResponseData = responseData.getJSONObject("data").getJSONArray("result").getJSONObject(0).getJSONArray("value");
                    } catch (JSONException e) {
                        // No data included in response
                        System.out.println("JSONException");
                    }

                    // metric part
                    if (metricResponseData.optString("__name__", "").equals(metric)) {
                        for (String currentTag : tags.keySet()) {
                            if (!tags.get(currentTag).contains(metricResponseData.getString(currentTag)))
                                return -1;
                        }

                        // value part
                        if (timestamp.getTime()/1000d == (Double.valueOf(valueResponseData.get(0).toString())))
                            return SUCCESS;
                    } else {
                        EntityUtils.consumeQuietly(response.getEntity());
                        getMethod.releaseConnection();
                        return -1;
                    }

                    break;
                }
            } catch (IOException e) {
                if (tries < 1) {
                    System.err.print("ERROR: Connection to " + urlQuery.toString() + " failed " + retries + "times.");
                    e.printStackTrace();
                    if (response != null) {
                        EntityUtils.consumeQuietly(response.getEntity());
                    }
                    EntityUtils.consumeQuietly(response.getEntity());
                    getMethod.releaseConnection();
                }
                return -1;
            }
        }
        return -1;
    }

    /**
     * Perform a range scan for a set of records in the database. Each value from the result will be stored in a HashMap.
     *
     * @param metric    The name of the metric
     * @param startTs   The timestamp of the first record to read.
     * @param endTs     The timestamp of the last record to read.
     * @param tags      actual tags that were want to receive (can be empty)
     * @param avg       do averaging
     * @param sum       do summarize
     * @param count     do count
     * @param timeValue value for timeUnit for sum/count/avg
     * @param timeUnit  timeUnit for sum/count/avg
     * @return Zero on success, a non-zero error code on error.  See this class's description for a discussion of error codes.
     */
    @Override
    public int scan(String metric, Timestamp startTs, Timestamp endTs, HashMap<String,
            ArrayList<String>> tags, boolean avg, boolean count, boolean sum, int timeValue, TimeUnit timeUnit) {

        if (metric == null || metric == "" || !metric.matches(metricRegEx)) {
            return -1;
        }
        if (startTs == null || endTs == null) {
            return -1;
        }

        // TODO create query


        int tries = retries + 1;
        HttpGet getMethod = null;
        String queryString = "";
        String parametrizedURI = "";
        HttpResponse response = null;
        JSONObject responseData = null;

        // Construct query

        for (Map.Entry entry : tags.entrySet()) {
            queryString += entry.getKey() + "=~\"";
            ArrayList<String> values = (ArrayList<String>) entry.getValue();
            for (int i = 0; i < values.size(); i++) {
                queryString += values.get(i)
                        + (i + 1 < (values.size()) ? "|" : "");
            }
            queryString += "\",";
        }
        queryString = "{" + queryString.substring(0, queryString.length() - 1) + "}";
        try {
            queryString = metric + URLEncoder.encode(queryString, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            System.out.println("Oh snap!");
        }

        if (filterForTags) {
            //TODO
        }

        if (!filterForTags) {
            //TODO
        }

        queryString += "&start=" + rfc3339Format.format(new Date(startTs.getTime()))
                + "&end=" + rfc3339Format.format(new Date(endTs.getTime()));

        if (avg) {
            queryString = "?query=avg_over_time(" + queryString;

        } else if (count) {
            if (useCount) {
                queryString = "?query=count_over_time(" + queryString;

            } else {
                queryString = "?query=min_over_time(" + queryString;

            }
        } else if (sum) {
            queryString = "?query=sum_over_time(" + queryString;

        } else {
            queryString = "?query=min_over_time(" + queryString;
            // When scan do 1ms resolution, use min aggr.

            //  "downsample", "1ms-min";

        }
        queryString += ")";
        // TODO send request
        return -1;
    }

    /**
     * Insert a record in the database. Any tags/tagvalue pairs in the specified tags HashMap and the given value
     * will be written into the record with the specified timestamp
     *
     * @param metric    The name of the metric
     * @param timestamp The timestamp of the record to insert.
     * @param value     actual value to insert
     * @param tags      A HashMap of tag/tagvalue pairs to insert as tags
     * @return Zero on success, a non-zero error code on error.  See this class's description for a discussion of error codes.
     */
    @Override
    public int insert(String metric, Timestamp timestamp, double value, HashMap<String, ByteIterator> tags) {
        if (metric == null || metric.isEmpty() || !metric.matches(metricRegEx) || timestamp == null) {
            return -1;
        }
        if (usePlainTextFormat) {
            String queryString = "#TYPE " + metric + " gauge\n" + metric;
            if (tags.size() > 0) {
                queryString += "{";
                for (String tagKey : tags.keySet())
                    queryString += tagKey + "=\"" +
                            (tags.get(tagKey).toString().replace("\\", "\\\\").replace("\"", "\\\"").replace("\n", "\\n")) +
                            "\",";
                queryString = queryString.substring(0, queryString.length() - 1) + "} " + value + " " + timestamp.getTime();
            } else
                queryString += " " + value + " " + timestamp.getTime();

            try {

                if (_debug) {
                    System.out.println("Timestamp: " + timestamp.getTime());
                    System.out.println("Input Query String: " + queryString);
                }
                if (test) {
                    return SUCCESS;
                }
                JSONArray jsonArr = runQuery(urlPut, queryString);
                if (_debug) {
                    System.err.println("jsonArr: " + jsonArr);
                }
                if (jsonArr == null) {
                    System.err.println("ERROR: Error in processing insert to metric: " + metric);
                    return -1;
                }
                return SUCCESS;

            } catch (Exception e) {
                System.err.println("ERROR: Error in processing insert to metric: " + metric + e);
                e.printStackTrace();
                return -1;
            }
        } else {
            // TODO use timestamp
            CollectorRegistry registry = new CollectorRegistry();
            Gauge gauge = Gauge.build().name(metric).help(timestamp.toString()).labelNames(tags.keySet().toArray(new String[]{})).create();
            Gauge.Child child = gauge.labels(tags.keySet().toArray(new String[]{}));
            child.set(value);
            gauge.register(registry);

            PushGateway gateway = new PushGateway(ip_pushgateway + ":" + port_pushgateway);
            int tries = retries;
            lel:
            while (true) {
                try {
                    tries--;
                    gateway.pushAdd(registry, "test_job");
                    return 1;
                } catch (IOException exception) {
                    if (tries > 0)
                        continue lel;
                    System.err.println(exception.toString());
                    return -1;
                }
            }
        }
    }

    public static void main(String[] args) {
        // Test client methods
        PrometheusClient client = new PrometheusClient();
        client.ip_pushgateway = "192.168.178.149";
        client.ip_server = "192.168.178.149";
        client.usePlainTextFormat = true;
        client._debug = true;
        try {
            client.urlQuery = new URL("http", client.ip_server, client.port_server, client.queryURLInfix);
            if (client._debug) {
                System.out.println("URL: " + client.urlQuery);
            }
        } catch (MalformedURLException e) {
            System.out.println("Malformed URL");
        }

        // 1. Test for insertion using pushgateway as intermediate push target
        RequestConfig requestConfig = RequestConfig.custom().build();
        client.client = HttpClientBuilder.create().setDefaultRequestConfig(requestConfig).build();
        Timestamp timestampBefore = new Timestamp(Calendar.getInstance().getTimeInMillis());
        Timestamp timestamp = new Timestamp(Calendar.getInstance().getTimeInMillis());
        Timestamp timestampAfter = new Timestamp(Calendar.getInstance().getTimeInMillis());
        HashMap<String, ByteIterator> insertTagValues = new HashMap<>();
        StringByteIterator iterator = new StringByteIterator("value1");
        StringByteIterator iterator2 = new StringByteIterator("value2");
        insertTagValues.put("entry1", iterator);
        insertTagValues.put("entry2", iterator2);

        HashMap<String, ArrayList<String>> scanTagValues = new HashMap<>();
        ArrayList<String> scanList1 = new ArrayList<>();
        ArrayList<String> scanList2 = new ArrayList<>();
        scanList1.add("value1");
        scanList1.add("lel1");
        scanList2.add("value2");
        scanList2.add("lel2");
        scanTagValues.put("entry1", scanList1);
        scanTagValues.put("entry2", scanList2);
        String metric = "test_metric";
        try {
            client.urlPut = new URL("http://" + client.ip_pushgateway + ":" + client.port_pushgateway + "/metrics/job/"
                    + metric + "_job/instance/" + metric + "_instance");
        } catch (MalformedURLException e) {
            System.out.println(e.toString());
        }
        int result = client.insert(metric, timestamp, Math.random() * 10d, insertTagValues);
        System.out.println("Insert result: " + result);

        // Wait until data was scraped from pushgateway
        try {
            Thread.sleep(5000l);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // 2. Test for reading the previously inserted data
        // TODO add tags to query via match[] and check multiple instances instead of one
        result = client.read(metric, timestamp, scanTagValues);
        System.out.println("Read result: " + result);

        // 3. Test scanning of previously inserted data
        //result = client.scan(metric, timestampBefore, timestampAfter, scanTagValues, false, false, false, 0, TimeUnit.MILLISECONDS);
        // System.out.println("Scan result: " + result);
    }
}

