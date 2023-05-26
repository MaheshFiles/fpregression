package com.mahesh.automation.corejava;
 class BlockTest{
	 static {
		 System.out.println("PC = SB1");
	 }
	 static {
		 System.out.println("PC = SB2");
	 }
	 {
		 System.out.println("PC = IB1");	 
	 }
	 public BlockTest () {
		 System.out.println("PC = DC");
	 }
 }
 
public class BlocksDemo extends BlockTest {
	{
		 System.out.println("CC = IB2");	 
	 }
	static {
		 System.out.println("CC = SB1");
	 }
	public BlocksDemo () {
		 System.out.println("CC = DC");
	 }	
	static {
		 System.out.println("CC = SB2");
	 }
	
public static void main(String[] args) {
	BlocksDemo demo = new BlocksDemo();
}
}

