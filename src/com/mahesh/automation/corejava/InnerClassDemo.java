package com.mahesh.automation.corejava;

class outerone {
	public void hardwork1() {
		System.out.println("OC: HW1");
	}
	static public void hardwork2() {
		System.out.println("OC: HW2");
	}
	
	class innerOne {
		public void hardwork3() {
			System.out.println("IC: HW3");
		}
	}
	
	static class InnerTwo {
		public void hardwork4() {
			System.out.println("SIC: HW4");
		}
		static public void hardwork5() {
			System.out.println("SIC: HW5");
		}
	}
}
public class InnerClassDemo {
public static void main(String[] args) {
	
	/*outerone one = new outerone();
	one.hardwork1();
	one.hardwork2();
	outerone.hardwork2();
	*/
	
	/*outerone.InnerTwo two = new outerone.InnerTwo();
	outerone.InnerTwo.hardwork5();
     two.hardwork4();
     two.hardwork5(); */
}

}
