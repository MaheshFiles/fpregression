 package PracticeJava;

public class PrimenumDemo {
public static void main(String[] args) {
	
	int num=37   ;
	int count=0;
	for (int a=1; a<=num;a++) 
	{
		if (num % a==0) {
			count++;
	    }
	}
	if (count==2) {
		System.out.println("prime");
	}
	else {
		System.out.println("not prime");
	}
}
}
