package com.test.json;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

public class TestJson {
	public static void main(String[] args) {
		test01();
	}

	private static void test01() {
		Map<String, Object> jsonMap1 = new HashMap<String, Object>();
		jsonMap1.put("busiDetailNo", "111");
		List<Map<String, String>> list = new ArrayList<Map<String, String>>();
		jsonMap1.put("data", list);
		Map<String, String> detialMap2 = new HashMap<String, String>();
		detialMap2.put("merchantId", "11");
		detialMap2.put("expenseType", "11");
		detialMap2.put("amount", "11");
		detialMap2.put("merchantType", "11");
		list.add(detialMap2);
		List<Map<String, Object>> jsonList = new ArrayList<Map<String, Object>>();
		jsonList.add(jsonMap1);
		System.out.println(JSONObject.toJSONString(jsonList));
		String jsonStr = JSONObject.toJSONString(jsonList);
		List<Map> result = JSON.parseArray(jsonStr, Map.class);
	}
}