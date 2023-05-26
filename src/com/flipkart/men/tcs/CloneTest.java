package com.flipkart.men.tcs;

public class CloneTest implements Cloneable {

	int practHrs;
	String result;
	public void hello() {
		System.out.println(practHrs+"  "+result);
	}
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		CloneTest test = new CloneTest();
		Object object = test.clone();
		CloneTest dupliTest = (CloneTest) object;
		dupliTest.practHrs = 45;
		dupliTest.result = "no job";
		dupliTest.hello();
		
		System.out.println(test.hashCode());
		System.out.println(dupliTest.hashCode());
		
		
		
	}
}
