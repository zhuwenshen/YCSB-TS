package com.yahoo.ycsb.db;

import com.yahoo.ycsb.ByteIterator;
import com.yahoo.ycsb.StringByteIterator;

import java.sql.Timestamp;
import java.util.HashMap;
public class Test {

	public static void main(String[] args) throws Exception {

		EasyCoreClient easyCoreClient = new EasyCoreClient();
		easyCoreClient.init();

		System.out.println("insert:");
		HashMap<String, ByteIterator> tags = new HashMap<>();
		tags.put("objectId", new StringByteIterator("test_app"));
		tags.put("instanceId", new StringByteIterator("30001"));
		System.out.println("should be 1: "
				+ easyCoreClient.insert("metric1", Timestamp.valueOf("2021-04-01 12:23:42.343434"), 1.0, tags));

	}


}
