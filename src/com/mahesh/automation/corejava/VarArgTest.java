package com.mahesh.automation.corejava;

class VarArgDemo{
	//public void hello (String...str) 
	//public void hello(int i, String...str)
	//{
	//System.out.println("var arg method");	
	//}
	public void hello(int i,String...str) {
		System.out.println("var arg method");
	}
    public void hello(int i) {
    	System.out.println("int parameter");
}
}
 public class VarArgTest {
public  static  void main(String[] args) {
	VarArgDemo demo = new VarArgDemo();
	//demo.hello(456);
	//demo.hello(9456, "JAVA");
	//demo.hello("JAVA");
	demo.hello(456);
	demo.hello(94123, "job kavali");
}
}

	
	



