package com.mahesh.automation.corejava;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class IteratorDemo {

	public static void main(String[] args) {
		
		// List list = new ArrayList<>();
		  Set list = new HashSet<>(); 
		   list.add("job");
		   list.add("hardwork");
		   list.add("sal");
		   list.add("hike");
		   list.add("java");
		   list.add("selenium");
		   list.add("java");
		   list.add("job");
		   list.add("job");
		   list.add("java");
		   list.add("job");
		   list.add("java");
		   
		    System.out.println(list);

   Iterator itr = list.iterator();		
	while(itr.hasNext()) {
		Object obj = itr.next();
		String str = (String) obj;
		if(str.equalsIgnoreCase("java")) {
			System.out.println("do practice");
		}
		System.out.println(str);
	}	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
