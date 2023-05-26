package com.mahesh.automation.corejava;
class EncapsulationDemo
{
  public int practHrs = 9;
  public String name = "practice";
  public void hello() {
	  System.out.println(practHrs+""+name);
}
}
public class EncapsulationTest {
public static void main(String[] args) {
   EncapsulationDemo demo = new EncapsulationDemo();
   int practHrsResp = demo.practHrs;
   System.out.println(practHrsResp);
   String nameResp = demo.name;
   System.out.println(nameResp);
   demo.hello();
}
}
