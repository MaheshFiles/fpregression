package com.mahesh.automation.corejava;
// method hiding
class parent{
static public void study() {
		System.out.println("PC: study");
	}
 public void friends() {
	System.out.println("PC: Hi friends");
}
public void money() {
	System.out.println("PC: money");
}
public void job() {
	System.out.println("PC: job kavali");
}
}
class child extends parent{
	
	static public void study() {
		System.out.println("CC: i dont want to study");
	}
	@Override
	public void friends() {
		System.out.println("CC: Bye friends");
   }
	public void business() {
		System.out.println("CC: business man");
	}
}

public class OverRidingTest {
public static void main(String[] args) {
 parent parent = new child();	
  parent.study();
  parent.friends();
  parent.money();
   parent.job();
	
	
	
	
	
}
}
