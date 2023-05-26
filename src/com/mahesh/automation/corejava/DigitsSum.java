package com.mahesh.automation.corejava;

public class DigitsSum {
public static void main(String[] args) {
	
	String str = "adp456";
	
	int sum=0;
	
	for(int i=0; i<=str.length();i++) 
	{
		char ch = str.charAt(i);
		if(Character.isDigit(ch)) {
		int val =	Character.getNumericValue(ch);
		sum = sum + val;
		}
	}
	System.out.println("SUM is: "+sum);
	
	
	
	
	
	
	
	
	
	
	
}
}
