package com.mahesh.automation.corejava;

import java.util.Iterator;

public class StringsTest {
public static void main(String[] args) {
	
	String str = "java selenium";
	
	char ch = str.charAt(1);
	System.out.println(ch);
	
	String[] str1 = str.split(" ");
	for (String str2 : str1) {
		System.out.println(str2);
	}
	System.out.println("    *************************8");
	
	String[] str2 = str.split(""); // not provide space so in console split every letter
	for (String str3 : str2) {
		System.out.println(str3);
	}
	
	String str5  = str.replace('a', 'm');
	System.out.println(str5);
	
	String str7 = str.replaceFirst("v","z");
	System.out.println(str7);
	
	String str6  = str.substring(1)	;
	System.out.println("    **********   "+str6);
	
	
	
}
}
