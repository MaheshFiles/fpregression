package com.mahesh.automation.corejava;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		
	LinkedHashMap map = new	LinkedHashMap<>();
		
		map.put("name", "rameshsoft");
		map.put(456, "job");
		map.put('d', "job");
		map.put(456.456, "sal");
		map.put("hardwork", "jobs");
		map.put(456, "hardwork job");
		map.put(null, null);
		
        System.out.println(map);

	}

}
