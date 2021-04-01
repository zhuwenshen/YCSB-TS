package com.yahoo.ycsb.db;

import com.uwei.easy_tsdb.TsDataProto;
import com.uwei.easy_tsdb.ts_dataGrpc;
import com.yahoo.ycsb.ByteIterator;
import com.yahoo.ycsb.DB;
import com.yahoo.ycsb.DBException;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

public class EasyCoreClient extends DB {
//    private String coreIp = "localhost";
//    private int corePort = 8070;
    private String tsdbIp = "localhost";
    private int tsdbPort = 8205;
    private String databaseName = "12345";
    private String defaultObjectId = "test_app";
    private String defaultInstanceId = "40001";

//    private ManagedChannel easyCoreChannel;
    private ManagedChannel easyTsdbChannel;

    @Override
    public void init() throws DBException {
        databaseName = getProperties().getOrDefault("database.name", "12345").toString();
        defaultObjectId = getProperties().getOrDefault("objectId", "test_app").toString();
        defaultInstanceId = getProperties().getOrDefault("instanceId", "40001").toString();
        tsdbIp = getProperties().getOrDefault("tsdbIp", "localhost").toString();
        tsdbPort = Integer.parseInt(getProperties().getOrDefault("tsdbPort", 8205).toString());
//        easyCoreChannel = ManagedChannelBuilder.forAddress(coreIp, corePort).usePlaintext().build();
        easyTsdbChannel = ManagedChannelBuilder.forAddress(tsdbIp, tsdbPort).usePlaintext().build();
    }
    @Override
    public void cleanup() throws DBException {
        try {
//            easyCoreChannel.shutdown();
            easyTsdbChannel.shutdown();
        } catch (Exception e) {
            throw new DBException(e);
        }
    }

    @Override
    public int read(String metric, Timestamp timestamp, HashMap<String, ArrayList<String>> tags) {
        return 0;
    }

    @Override
    public int scan(String metric, Timestamp startTs, Timestamp endTs, HashMap<String, ArrayList<String>> tags, boolean avg, boolean count, boolean sum, int timeValue, TimeUnit timeUnit) {
        return 0;
    }

    @Override
    public int insert(String metric, Timestamp timestamp, double value, HashMap<String, ByteIterator> tags) {
        if (metric == null || metric.isEmpty()  || timestamp == null) {
            return -1;
        }
        ts_dataGrpc.ts_dataBlockingStub tsDataBlockingStub = ts_dataGrpc.newBlockingStub(easyTsdbChannel);
        TsDataProto.InsertRequest.Builder builder = TsDataProto.InsertRequest.newBuilder();
        TsDataProto.Record.Builder recordBuilder = builder.addRecordBuilder();
        recordBuilder.setDatabase(databaseName);
        recordBuilder.setDouble(value);
        recordBuilder.setMetricKey(metric);
        recordBuilder.setTime(timestamp.getTime());
        if (tags.containsKey("objectId")) {
            recordBuilder.setObjectId(tags.get("objectId").toString());
            tags.remove("objectId");
        }else{
            recordBuilder.setObjectId(defaultObjectId);
        }

        if (tags.containsKey("instanceId")) {
            recordBuilder.setInstanceId(tags.get("instanceId").toString());
            tags.remove("instanceId");
        }else{
            recordBuilder.setInstanceId(defaultInstanceId);
        }
        tags.forEach((key, tag_value)->{
            recordBuilder.putTags(key, tag_value.toString());
        });
        TsDataProto.InsertRequest insertRequest = builder.build();
        System.out.printf("insert req:"+ insertRequest.toString());
        TsDataProto.InsertResponse resp = null;
        try {
            resp = tsDataBlockingStub.insert(insertRequest);
        } catch (Exception e) {
            System.err.println("insert err:"+ e);
            return -1;
        }
        if (resp.getCode()!=0){
            return 0;
        }else{
            return resp.getCode();
        }

    }
}
