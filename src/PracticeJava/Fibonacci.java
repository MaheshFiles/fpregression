package PracticeJava;

public class Fibonacci {
public static void main(String[] args) {
	
	 int num1=0,num2=1,sum=0;
	 System.out.print(num1+" "+num2);
	for (int a=2;a<12;a++)
	{
	sum=num1+num2;
	System.out.print(" "+sum);
		num1=num2;
		num2=sum;
	
		
	}
}
}
