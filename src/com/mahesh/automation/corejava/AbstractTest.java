package com.mahesh.automation.corejava;

abstract class AbstractDemo{
	public void hardwork() {
		System.out.println("practice = job kavali");
	}
	public void practice() {
		System.out.println("practice is must");
	}
	abstract public void job();
	abstract public void sal();	
}

abstract class AbstractDemoOne extends AbstractDemo{

	@Override
	public void job() {
		System.out.println("JOB");
	}
	
	public void Java() {
	System.out.println("its very importent");	
	}
}
class AbstractDemoTwo extends AbstractDemoOne{
	@Override
	public void sal() {
		System.out.println("SAL");
	}
	public void career() {
		System.out.println("CAREER");
	}
}
public class AbstractTest {
 public static void main(String[] args) {
	/*AbstractDemoTwo demo = new AbstractDemoTwo();
	demo.career();
	demo.hardwork();
	demo.Java();
	demo.job();
	demo.practice();
	demo.sal();
	*/
	AbstractDemoOne demo = new AbstractDemoTwo();
	
	demo.hardwork();
	demo.Java();
	demo.job();
	demo.practice();
	demo.sal();
}

}