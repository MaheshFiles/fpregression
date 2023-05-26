package com.mahesh.automation.corejava;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		
	//	Map map = new TreeMap<>();
		TreeMap map = new TreeMap();
		map.put("hello", "do practice");
		map.put("java", "practice");
		map.put("abc", 456);
		map.put("selenium", "job");
		map.put("hardwork", "jobs");
	//	map.put(null, "java");
		map.put("java", null);
		
		System.out.println(map);

	}

}
