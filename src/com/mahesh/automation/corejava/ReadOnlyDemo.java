package com.mahesh.automation.corejava;

class ReadOnlytest {
	int practHrs = 9;
	String result = "job";
	public void hello() {
		System.out.println(practHrs +" "+ result);
	}
}
 
public class ReadOnlyDemo {
public static void main(String[] args) {
	ReadOnlytest test = new ReadOnlytest();

	//System.out.println(test.practHrs);
	//System.out.println(test.result);
	//test.hello();
	
	
	test.practHrs = 0;
	test.result = "NO JOB";
	 test.hello(); 
	System.out.println(test.practHrs);
	System.out.println(test.result);
	test.hello();
	
}
}
