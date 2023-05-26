package com.mahesh.automation.corejava;

public class StringDemo {

	public static void main(String[] args) {
		
		StringBuffer sb1 = new StringBuffer("java");
		StringBuffer sb2 =	sb1.append("selenium");
		
		System.out.println(sb1);
		System.out.println(sb1.toString());
		
		System.out.println(sb2);
		System.out.println(sb2.toString());
		
		System.out.println(sb1.hashCode());
		System.out.println(sb2.hashCode());
		
		if (sb1 == sb2) {
			System.out.println("Equal");
		}
		else {
			System.out.println("NOT Equal");
		}
		
		
		
		
		
		
		
		
		
		
	/*	String str = new String("java");
		
		String str1 = str.concat("selenium");
		
		System.out.println(str);
		System.out.println(str1);
		
		System.out.println(str.toString());
		System.out.println(str1.toString());
		
		System.out.println(str.hashCode());
		System.out.println(str1.hashCode());
		
		if (str == str1) {
			System.out.println("equal");
		}
		else {
			System.out.println("not equal");
		}
		*/
	}
	
	
	
}
