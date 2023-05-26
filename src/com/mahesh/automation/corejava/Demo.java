package com.mahesh.automation.corejava;

 class Demo {
 int practHrs = 6;
 String hardwork = "mahesh";
	int workHrs = 81;
	int sal = 25000;
 String name = "need a job";
	/* public void mahi () {
		System.out.println("workHrs by govt:"+workHrs );
	}*/
	 public void hello() {
		final String name = "JAVA";
		int workHrs = 8;
		int sal = 456456; 
		sal = 9456456;
		String hardwork = "JOB";
	  //System.out.println(practHrs+" "+hardwork+" "+name+" "+workHrs);
      //System.out.println(practHrs+" "+this.hardwork+" "+this.name+" "+this.workHrs);
		
		System.out.println(practHrs+" "+hardwork+" "+name+" "+sal);
	    System.out.println(practHrs+" "+this.hardwork+" "+this.name+" "+this.sal);
			
	}
	 public static void main(String[] args) {
		Demo demo = new Demo();
		demo.hello();
		//demo.mahi();
	}
}
