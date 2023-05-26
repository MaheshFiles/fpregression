package com.mahesh.automation.corejava;

import java.util.ArrayList;
import java.util.List;

public class ForEachDemo {

	public static void main(String[] args) {
		
		String[] str = {"java","selenium","java","job","hardwork"};
		for(String str1 : str) {
			if(str1.equalsIgnoreCase("java")) {
				System.out.println("  do practice");
			}
			System.out.println(str1);
		}

		List list = new ArrayList<>();
		list.add("hello");
		list.add("java");
		list.add("job");
		list.add("hardwork");
	for (Object obj:list) {
		String str1 = (String) obj;
		if(str1.equalsIgnoreCase("java")) {
			System.out.println("   do practice");
		}
		System.out.println(str1);
	}	
		
		
	}

}
