package com.mahesh.automation.corejava;
class ConstructorCallsTest1
{

	public ConstructorCallsTest1()
	{
		this(8);	
	System.out.println("ConstructorCallstest: dc");	
	  }
	public ConstructorCallsTest1(int id) 
	{
		super();	
		System.out.println("ConstructorCallstest: DC");	
		  }
		}
	


public class ConstructorCallsDemo1 extends ConstructorCallsTest1 {
	
 public ConstructorCallsDemo1 () {
	 super();
	 System.out.println("ConstructorCallsDemo: DC");
 }
 public static void main(String[] args) {
	 ConstructorCallsDemo1 demo = new ConstructorCallsDemo1();
}
}
