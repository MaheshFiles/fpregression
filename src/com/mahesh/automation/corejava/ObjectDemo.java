
package com.mahesh.automation.corejava;

public class ObjectDemo {
	int practHrs;
	String result;
	public void hello() {
		System.out.println(practHrs+""+result);
	}
public static void main(String[] args) {
	ObjectDemo demo = new ObjectDemo();
	demo.practHrs=13;
	demo.result= "job";
	demo.hello();
}
}
