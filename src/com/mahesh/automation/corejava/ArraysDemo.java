package com.mahesh.automation.corejava;

public class ArraysDemo {
public static void main(String[] args) {
	
	String[] str = new String[9];
	str[0]="java";
	str[1]="is";
	//str[2]=456;
	str[2]="must";
	str[3]="for";
	str[4]="selenium";
	str[8]="hardwork";
	
	for(int i=0; i<str.length;i++) {
	System.out.println(str[i]);	
	}
	
	int[] i = {456,9456,567,756456};	
	String[] str1 = {"java","is","important","selenium"};
	for(int i1=0;i1<str1.length;i1++) {
		System.out.println(str1[i1]);
	}
	
}
}
