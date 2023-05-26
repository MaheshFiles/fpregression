package com.mahesh.automation.corejava;

class ConstructorTest3{
	int practHrs = 15;
	String res = "job";
	public void hello() {
		System.out.println(practHrs+" "+res);
	}
}

public class ConstructorDemo3 extends ConstructorTest3 {
   
   //  int PractHrs = 0;
	//String res = "no job";
	
	//public void hello() {
      //  int practHrs = 9;
        //String result = "job";
       //System.out.println(practHrs+" "+result);
        //System.out.println(this.PractHrs +" "+this.res);
        //System.out.println(super.practHrs +" "+ super.res);
  /*  super.hello();*/
	//}
	
	public static void main(String[] args) {
		ConstructorDemo3 demo = new ConstructorDemo3();
		demo.hello();
}   
}
