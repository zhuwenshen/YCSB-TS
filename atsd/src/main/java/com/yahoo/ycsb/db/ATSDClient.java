package com.yahoo.ycsb.db;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import javax.ws.rs.core.MultivaluedHashMap;

import org.apache.commons.pool2.impl.GenericObjectPoolConfig;

import com.axibase.tsd.client.ClientConfigurationFactory;
import com.axibase.tsd.client.DataService;
import com.axibase.tsd.client.HttpClientManager;
import com.axibase.tsd.model.data.TimeFormat;
import com.axibase.tsd.model.data.command.AddSeriesCommand;
import com.axibase.tsd.model.data.command.GetSeriesQuery;
import com.axibase.tsd.model.data.command.SimpleAggregateMatcher;
import com.axibase.tsd.model.data.series.GetSeriesResult;
import com.axibase.tsd.model.data.series.Interpolate;
import com.axibase.tsd.model.data.series.Interval;
import com.axibase.tsd.model.data.series.IntervalUnit;
import com.axibase.tsd.model.data.series.Series;
import com.axibase.tsd.model.data.series.aggregate.AggregateType;
import com.axibase.tsd.model.system.ClientConfiguration;
import com.yahoo.ycsb.ByteIterator;
import com.yahoo.ycsb.DB;
import com.yahoo.ycsb.DBException;

/**
 * ATSD client for YCSB framework.
 * 
 * @author Michael Zimmermann
 */
public class ATSDClient extends DB {

	private final int SUCCESS = 0;
	private boolean _debug = false;
	private String ip = "localhost";
	private int port = 8088;
	private String username = "admin";
	private String passwd = "adminadmin";
	private boolean test = false;
	private HttpClientManager httpClientManager;
	private DataService dataService;

	/**
	 * Initialize any state for this DB. Called once per DB instance; there is
	 * one DB instance per client thread.
	 */
	public void init() throws DBException {

		try {
			test = Boolean.parseBoolean(getProperties().getProperty("test", "false"));
			if (!getProperties().containsKey("port") && !test) {
				throw new DBException("No port given, abort.");
			}
			port = Integer.parseInt(getProperties().getProperty("port", String.valueOf(port)));
			if (!getProperties().containsKey("ip") && !test) {
				throw new DBException("No ip given, abort.");
			}
			ip = getProperties().getProperty("ip", ip);
			if (!getProperties().containsKey("username") && !test) {
				throw new DBException("No username given, abort.");
			}
			username = getProperties().getProperty("username", username);
			if (!getProperties().containsKey("passwd") && !test) {
				throw new DBException("No passwd given, abort.");
			}
			passwd = getProperties().getProperty("passwd", passwd);
			if (_debug) {
				System.out.println("The following properties are given: ");
				for (String element : getProperties().stringPropertyNames()) {
					System.out.println(element + ": " + getProperties().getProperty(element));
				}
			}

		} catch (Exception e) {
			throw new DBException(e);
		}

		ClientConfigurationFactory configurationFactory = new ClientConfigurationFactory("http", ip, port, // serverPort
				"/api/v1", "/api/v1", username, passwd, 3000, // connectTimeoutMillis
				3000, // readTimeoutMillis
				600000, // pingTimeout
				false, // ignoreSSLErrors
				false // skipStreamingControl
		);
		ClientConfiguration clientConfiguration = configurationFactory.createClientConfiguration();
		System.out.println("Connecting to ATSD: " + clientConfiguration.getMetadataUrl());
		httpClientManager = new HttpClientManager(clientConfiguration);

		GenericObjectPoolConfig objectPoolConfig = new GenericObjectPoolConfig();
		objectPoolConfig.setMaxTotal(5);
		objectPoolConfig.setMaxIdle(5);

		httpClientManager.setObjectPoolConfig(objectPoolConfig);
		httpClientManager.setBorrowMaxWaitMillis(1000);

		dataService = new DataService(httpClientManager);
	}

	public void cleanup() throws DBException {
		httpClientManager.close();
	}

	/**
	 * Read a record from the database. Each value from the result will be
	 * stored in a HashMap
	 *
	 * @param metric
	 *            The name of the metric
	 * @param timestamp
	 *            The timestamp of the record to read.
	 * @param tags
	 *            actual tags that were want to receive (can be empty)
	 * @return Zero on success, a non-zero error code on error or "not found".
	 */
	@Override
	public int read(String metric, Timestamp timestamp, HashMap<String, ArrayList<String>> tags) {
		if (metric == null || metric == "") {
			return -1;
		}
		if (timestamp == null) {
			return -1;
		}

		if (test) {
			return SUCCESS;
		}

		// Problem: You cant ask for a timestamp at TS=x, you need to give a
		// range. So: Begin: timestamp, End: timestamp + 1 ms
		// We may get more than that, but we just take the right one
		// There could also be more of them, so count
		GetSeriesQuery command = new GetSeriesQuery(metric, metric);
		command.setTags(intoMultiMap(tags));
		command.setTimeFormat(TimeFormat.MILLISECONDS);
		command.setStartTime(timestamp.getTime());
		command.setEndTime(timestamp.getTime() + 1);

		List<GetSeriesResult> seriesList = dataService.retrieveSeries(command);

		if (_debug) {
			System.out.println("Command: " + command.toString());
			for (GetSeriesResult res : seriesList) {
				System.out.println("Result: " + res.toString());
			}
		}

		if (seriesList == null || seriesList.isEmpty()) {
			System.err.println(
					"ERROR: Found no querie for metric: " + metric + " for timestamp: " + timestamp + " to read.");

			return -1;
		}
		int count = 0;
		for (GetSeriesResult res : seriesList) {
			for (Series ser : res.getData()) {
				if (ser.getTimeMillis() == timestamp.getTime())
					count++;
			}
		}

		if (count == 0) {
			System.err.println("ERROR: Found no values for metric: " + metric + " for timestamp: " + timestamp + ".");
			return -1;
		} else if (count > 1) {
			System.err.println(
					"ERROR: Found more than one value for metric: " + metric + " for timestamp: " + timestamp + ".");
			return -1;
		}

		return SUCCESS;
	}

	/**
	 * Perform a range scan for a set of records in the database. Each value
	 * from the result will be stored in a HashMap.
	 *
	 * @param metric
	 *            The name of the metric
	 * @param startTs
	 *            The timestamp of the first record to read.
	 * @param endTs
	 *            The timestamp of the last record to read.
	 * @param tags
	 *            actual tags that were want to receive (can be empty)
	 * @param avg
	 *            do averageing
	 * @param sum
	 *            do summarize
	 * @param count
	 *            do count
	 * @param timeValue
	 *            value for timeUnit for sum/count/avg
	 * @param timeUnit
	 *            timeUnit for sum/count/avg
	 * @return Zero on success, a non-zero error code on error. See this class's
	 *         description for a discussion of error codes.
	 */
	@Override
	public int scan(String metric, Timestamp startTs, Timestamp endTs, HashMap<String, ArrayList<String>> tags,
			boolean avg, boolean count, boolean sum, int timeValue, TimeUnit timeUnit) {

		if (metric == null || metric == "") {
			return -1;
		}
		if (startTs == null || endTs == null) {
			return -1;
		}

		if (test) {
			return SUCCESS;
		}

		GetSeriesQuery command = new GetSeriesQuery(metric, metric);
		command.setTags(intoMultiMap(tags));
		command.setTimeFormat(TimeFormat.MILLISECONDS);
		command.setStartTime(startTs.getTime());
		command.setEndTime(endTs.getTime());

		if (avg || sum || count) {
			// AVG;SUM;COUNT
			AggregateType aggregateType = AggregateType.DETAIL;
			if (avg) {
				aggregateType = AggregateType.AVG;
			} else if (count) {
				aggregateType = AggregateType.COUNT;
			} else if (sum) {
				aggregateType = AggregateType.SUM;
			}

			IntervalUnit intervalUnit = IntervalUnit.SECOND; // smallest unit
			if (timeUnit == TimeUnit.MINUTES) {
				intervalUnit = IntervalUnit.MINUTE;
			} else if (timeUnit == TimeUnit.HOURS) {
				intervalUnit = IntervalUnit.HOUR;
			} else if (timeUnit == TimeUnit.DAYS) {
				intervalUnit = IntervalUnit.DAY;
			}

			command.setAggregateMatcher(
					new SimpleAggregateMatcher(new Interval(timeValue, intervalUnit), Interpolate.NONE, aggregateType));
		}

		List<GetSeriesResult> seriesList = dataService.retrieveSeries(command);

		if (_debug) {
			System.out.println("Command: " + command.toString());
			for (GetSeriesResult res : seriesList) {
				System.out.println("Result: " + res.toString());
			}
		}

		return SUCCESS;

	}

	private MultivaluedHashMap<String, String> intoMultiMap(HashMap<String, ArrayList<String>> tags) {
		MultivaluedHashMap<String, String> tagsMap = new MultivaluedHashMap<String, String>();

		for (Map.Entry<String, ArrayList<String>> entry : tags.entrySet()) {
			String tagKey = entry.getKey().toString();
			for (String tagValue : (ArrayList<String>) entry.getValue()) {
				tagsMap.add(tagKey, tagValue);
			}
		}
		return tagsMap;
	}

	/**
	 * Insert a record in the database. Any tags/tagvalue pairs in the specified
	 * tags HashMap and the given value will be written into the record with the
	 * specified timestamp
	 *
	 * @param metric
	 *            The name of the metric
	 * @param timestamp
	 *            The timestamp of the record to insert.
	 * @param value
	 *            actual value to insert
	 * @param tags
	 *            A HashMap of tag/tagvalue pairs to insert as tags
	 * @return Zero on success, a non-zero error code on error. See this class's
	 *         description for a discussion of error codes.
	 */
	@Override
	public int insert(String metric, Timestamp timestamp, double value, HashMap<String, ByteIterator> tags) {
		if (metric == null || metric == "") {
			return -1;
		}
		if (timestamp == null) {
			return -1;
		}

		if (dataService.addSeries(
				AddSeriesCommand.createSingle(metric, metric, timestamp.getTime(), value, mapToArray(tags)))) {
			return SUCCESS;
		}
		return -1;
	}

	private String[] mapToArray(HashMap<String, ByteIterator> tags) {

		String[] keyValuePairs = new String[tags.size() * 2];
		int index = 0;
		for (Map.Entry<String, ByteIterator> mapEntry : tags.entrySet()) {
			keyValuePairs[index] = mapEntry.getKey().toString();
			index++;
			keyValuePairs[index] = mapEntry.getValue().toString();
			index++;
		}
		return keyValuePairs;
	}

}
