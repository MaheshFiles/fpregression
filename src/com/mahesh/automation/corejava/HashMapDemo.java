package com.mahesh.automation.corejava;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
    //Map map = new HashMap<>();
		HashMap map = new HashMap();
		
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
