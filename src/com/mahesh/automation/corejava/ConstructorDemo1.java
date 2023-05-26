package com.mahesh.automation.corejava;
class ConstructorTest{
	int practHrs;
	String result;
	public ConstructorTest(int practHrs,String result) {
		this.practHrs = practHrs;
		this.result = result;
	}
	public void hello() {
		System.out.println(practHrs+"  "+result);
	}
}
public class ConstructorDemo1 {
public static void main(String[] args) {
	ConstructorTest test = new ConstructorTest(9, "JOB");
	test.hello();
}
}
