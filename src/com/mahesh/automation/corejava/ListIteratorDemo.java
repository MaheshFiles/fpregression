package com.mahesh.automation.corejava;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {

   List list = new ArrayList<>();
   
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
	ListIterator itr = list.listIterator();
	while(itr.hasNext()) {
	Object obj = itr.next();
	String str = (String) obj;
	if (str.equalsIgnoreCase("java")) {
		System.out.println("im doing practice");
	}
	 System.out.println(str);
	}
		
		
		
		
		
		
	}
}
