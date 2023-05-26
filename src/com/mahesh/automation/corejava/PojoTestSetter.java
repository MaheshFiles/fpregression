package com.mahesh.automation.corejava;

class pojoDemo1
{
	
	private int practHrs1;
	private String name;
	private  double sal;
	
	public void setPractHrs1(int PractHrs) {
		this.practHrs1 = PractHrs;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public int getPractHrs1() {
	return practHrs1;
	}
    public String getName() {
	return name;
    }
     public double getSal() {
    	return sal;
    }
}
public class PojoTestSetter {
	public static void main(String[] args) {
		pojoDemo1 demo = new pojoDemo1();
		
		demo.setPractHrs1(51);
		demo.setSal(125000.55);
		demo.setName("job");
		
		int PractHrsResp = demo.getPractHrs1();
		System.out.println(PractHrsResp);
		
		String nameResp = demo.getName();
		System.out.println(nameResp);
		
		double salResp = demo.getSal();
		System.out.println(salResp);
		
		
		
		
		
		
		
	}

}
