package com.mahesh.automation.corejava;

class ConstructorDemo{       //void
public  ConstructorDemo() {
	System.out.println("Default constructor");
}	
public void hello() {
	//System.out.println("hello");
	ConstructorDemo demo = new ConstructorDemo();
}
}
public class ConstructorsDemo {
public static void main(String[] args) {
	ConstructorDemo demo = new ConstructorDemo();
	demo.hello();
	//demo.ConstructorDemo();
}
}
