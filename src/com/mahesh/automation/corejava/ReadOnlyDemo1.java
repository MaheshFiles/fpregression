package com.mahesh.automation.corejava;

abstract class ReadOnlyTest1{
	static int practHrs = 9;
	static String result= "job";
 public static void hello() {
		System.out.println(practHrs +" "+ result);
	}
}
public class ReadOnlyDemo1 {
public static void main(String[] args) {
	ReadOnlyTest1.hello();
}
}
