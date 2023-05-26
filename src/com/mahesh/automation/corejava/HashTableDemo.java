package com.mahesh.automation.corejava;

import java.util.Hashtable;

public class HashTableDemo {

	public static void main(String[] args) {
		
		Hashtable map = new Hashtable();
		
		map.put("name", "rameshsoft");
		map.put(456, "job");
		map.put('d', "job");
		map.put(456.456, "sal");
		map.put("hardwork", "jobs");
		map.put(456, "hardwork job");
	     //  map.put(null, null);
		//	map.put(null, "java");
		//	map.put("java", null);
		
        System.out.println(map);

		
		
		
	}

}
