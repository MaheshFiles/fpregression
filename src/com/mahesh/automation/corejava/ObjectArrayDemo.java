package com.mahesh.automation.corejava;

public class ObjectArrayDemo {
public static void main(String[] args) {
	
	Object[] obj = new Object[6];
	obj[0]= 123;
	obj[1]= "Java";
	obj[2]= 4123;
	obj[3]= "selenium";
	
	for(int i=0; i<obj.length;i++) {
		System.out.println(obj[i]);
	}
}
}
