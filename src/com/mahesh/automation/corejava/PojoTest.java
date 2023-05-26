package com.mahesh.automation.corejava;
 class PojoDemo
 {
	private int practHrs = 9;
	private String name = "JOB";
	private static double sal = 125000.45;
	
	public int getPractHrs() {
		return practHrs;
	}
	public String getName() {
		return name;
	}
	public double getSal() {
		return sal;
		
	}
}
	
 public class PojoTest {
 public static void main(String[] args) {
	PojoDemo demo = new PojoDemo();
	
	int practHrsResp = demo.getPractHrs();
	System.out.println(practHrsResp);	
	String nameResp = demo.getName();
	System.out.println(nameResp);
	double salResp = demo.getSal();
	System.out.println(salResp);
	
}

}
