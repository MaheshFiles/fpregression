package com.mahesh.automation.corejava;


class ConstructorTest1{
	int practHrs;
	String result;
	public ConstructorTest1(int practHrs,String result) {
		this.practHrs = practHrs;
		this.result = result;
		System.out.println("PC");
	}
	public ConstructorTest1(String result) {
		System.out.println("DC:"+result);
		}
	public ConstructorTest1(int Hrs) {
		System.out.println("1 PC : "+ Hrs);
	}
	public void hello() {
		System.out.println(practHrs+"  "+result);
	}
	
}
public class ConstructorDemo2 {
public static void main(String[] args) {
	ConstructorTest1 test = new ConstructorTest1("love");
	
}
}
