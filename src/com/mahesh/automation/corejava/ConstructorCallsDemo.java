package com.mahesh.automation.corejava;

class ConstructorCallsTest
{
	
public ConstructorCallsTest() {
	super();	
System.out.println("ConstructorCallstest: DC");	
  }
}
public class ConstructorCallsDemo extends ConstructorCallsTest {
	public ConstructorCallsDemo()
	{
		super();
	System.out.println("ConstructorCallsDemo: DC");	
	}
	
	
public static void main(String[] args) {
	ConstructorCallsDemo demo = new ConstructorCallsDemo();
}

}
