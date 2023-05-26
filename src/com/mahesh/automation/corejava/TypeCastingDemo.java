package com.mahesh.automation.corejava;

public class TypeCastingDemo {

	public static void main(String[] args) {
	
		int i =456;
		float f =i;   // implicit type casting
		double d = f;
		
		String str = "hardwork";
		Object obj = str;    
		String str1 = (String) obj;

	}

}
