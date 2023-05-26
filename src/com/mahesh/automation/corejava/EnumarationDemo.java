package com.mahesh.automation.corejava;

import java.util.Enumeration;
import java.util.Vector;

public class EnumarationDemo {

	public static void main(String[] args) {
	
		Vector vector = new Vector<>();
		
		vector.add("job");
		vector.add("hardwork");
		vector.add("sal");
		vector.add("hike");
		vector.add("java");
		vector.add("selenium");
		vector.add("java");
		vector.add("job");
		vector.add("job");
		vector.add("job");
		
		
		System.out.println(vector);
		
		Enumeration enumaration	= vector.elements();
		while (enumaration.hasMoreElements()) {
		Object obj =	enumaration.nextElement();
		String str = (String) obj;
		if(str.equalsIgnoreCase("job")) {
		System.out.println("Im doing Hardwork");	
		}
		System.out.println(str);
		}
	
	}

}
