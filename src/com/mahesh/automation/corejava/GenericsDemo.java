package com.mahesh.automation.corejava;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class GenericsDemo {
	public List hello() {
	List list = new ArrayList<>();
	for (int i=0; i<=9; i++) {
		list.add(i);
	}
    return list;   
	}
	
	public Set<String> hello2() {
		Set<String> set = new HashSet<String>();
		set.add("java");	
		set.add("hardwork");	
	    return set;   
		}
	public void hardwork(Map<String, Integer> map) {
		System.out.println(map);
		Set<String> keys = map.keySet();
		System.out.println(keys);
		
		Set<Entry<String, Integer>> entrys = map.entrySet();
		System.out.println(entrys);
		map.put("java", 123);
	}
	
	
	

	public static void main(String[] args) {
		
		GenericsDemo demo = new GenericsDemo();
		List list = demo.hello();
		System.out.println(list);
		
		Map<String, Integer> map = new HashMap<String,Integer>();
		map.put("java", 456);
		map.put("selenium", 91456);
		map.put("job", 456);
		map.put("hardwork", 91456);
		map.put("java", 456);
		demo.hardwork(map);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		List<Integer> list = new ArrayList<Integer>();
	//	List<Integer> list = new ArrayList<>();
	//	List<Integer> list = new ArrayList();
		
		list.add(456);
		list.add(1456);
		list.add(2456);
		list.add(3456);
		list.add(5456);
		list.add(56);
		
		for (int i:list) {
			if(i==5456) {
				System.out.println("hello generics");
			}
			System.out.println(i);
		}
		
	System.out.println("**********************");
	
	Map<String, Integer> map = new HashMap<String,Integer>();
	map.put("java", 456);
	map.put("selenium", 91456);
	map.put("job", 456);
	map.put("hardwork", 91456);
	map.put("java", 456);
	map.put("java", 456);
	
	Set<String> keys = map.keySet();
	System.out.println(keys);
	
//  Map map1 = new HashMap<String,Double>();  valid but non generic
	*/
		

	}

}
