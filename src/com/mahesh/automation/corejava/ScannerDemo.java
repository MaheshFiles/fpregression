package com.mahesh.automation.corejava;

import java.util.Scanner;

public class ScannerDemo {
	int practHrs;
	String result;
	public void hello() {
		System.out.println(practHrs+" "+result);
	}
public static void main(String[] args) {
	ScannerDemo demo = new ScannerDemo();
	System.out.println("Enter practice hours");
	Scanner scanner = new Scanner (System.in);
	
		int practice = scanner.nextInt();
		
	System.out.println("Enter the result");
	String res = scanner.next();
	
	demo.practHrs = practice;
	demo.result = res;
	demo.hello();
}
}
