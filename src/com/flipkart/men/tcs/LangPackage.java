package com.flipkart.men.tcs;

public class LangPackage {

	public int hashCode() {
		return 456;
	}
	public String toString() {
		return "JOB";
		
	}
	public static void main(String[] args) {
		
		LangPackage test = new LangPackage();
		System.out.println(test.hashCode());
		System.out.println(test);
		System.out.println(test.toString());
		
		System.out.println(test.getClass().getName());
		
	}

}
