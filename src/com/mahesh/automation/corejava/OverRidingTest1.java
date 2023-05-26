package com.mahesh.automation.corejava;
 
           //overriding

class parent1
{
     static  public void study() {
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
class child1 extends parent1 {
 //@override
  static public void study() {
		System.out.println("CC: i dont want to study");
	}
	public void business() {
		System.out.println("CC: business man");
	}
	public void friends() {
		System.out.println("CC: Bye friends");
   }
}
public class OverRidingTest1 {
public static void main(String[] args) {
	
    /* parent1 parent = new parent1();
     parent.study();
     parent.friends();
     parent.job();
     parent.money();*/
	
	/*child1 child = new child1();
	child.study();
	child.friends();
	child.job();
	child.money();
	child.business(); */
	
	parent1 parent =  new child1();
	parent.study();
	parent.friends();
	parent.job();
	parent.money();
}
}
