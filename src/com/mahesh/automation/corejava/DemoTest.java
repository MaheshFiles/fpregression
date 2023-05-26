 package com.mahesh.automation.corejava;

class DemoTest1
{
	
	public int addition(int num1,int num2) {
	int result = num1+num2;
	System.out.println("int int Result is: "+result);
	return result;
	}

	public float addition(float num1,float num2) {
	float result = num1+num2;
	System.out.println("float float Result is: "+result);
    return result;
	}

	public double addition(double num1,double num2) {
	double result = num1+num2;
	System.out.println("double double Result is: "+result);
	return result;
	}
}

 public class DemoTest {
 public static void main(String[] args) {
		
 DemoTest1 test = new DemoTest1();
	
		//*test.addition(35,15);
		test.addition(135,115);
		test.addition(230.5f,315.5f);
		//*test.addition(111135,15);
		test.addition(2222222.5,159999.9);
		//*test.addition(333333335,1501000000);
		//*test.addition('a','b');
	}
}

