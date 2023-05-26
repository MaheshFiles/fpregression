package com.mahesh.automation.corejava;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		
		List list = new ArrayList<>();
		
		list.add("java");
		list.add("selenium");
		list.add("job");
		list.add("hardwork");
		
		for (Object obj:list) {
			String str = (String) obj;
			if (str.equalsIgnoreCase("hardwork")) {
				System.out.println("hello mahesh do practice");
			}
			System.out.println(str);
		}
		
		
		
		
		
		
		
		
		

	}

}
