package com.mahesh.automation.corejava;

import java.util.Iterator;

public class ReverseTest {
public static void main(String[] args) {
	
//	String str = "mahesh";
	
	String str = "45";
	
	int val1 = Integer.parseInt(str);
	System.out.println(val1);
	
	Float flt = Float.parseFloat(str);
	System.out.println(flt);
	
	
	int i = 456;
	
	Double d1 = Double.parseDouble(str);
	System.out.println(d1);
	
	Integer i1 = 456456;
	Integer i2 = Integer.valueOf(i);
	System.out.println(i2);
	
	Integer i3 = Integer.valueOf(str);
	System.out.println(i3);
	
	
	
	/* String reverse = "";   
	for(int i = str.length()-1; i>=0; i--) {
		reverse = reverse+str.charAt(i);
	}
	System.out.println(" reverse of string is : "+reverse);
	
	*/
	
	//using api
	
	/*StringBuffer sb = new StringBuffer(str);
	sb.reverse();
	
	System.out.println(sb);
	*/
	
}
}
