package com.mahesh.automation.corejava;

public class ArraysDemo1 {
public static void main(String[] args) {
	
	int[][] i = new int[2][2];
	i[0][0]=5456;
	i[0][1]=6456;
	i[1][0]=7456;
	i[1][1]=8456;
	for (int i1=0; i1<i.length;i1++) 
	{
		for(int j=0; j<i.length;j++) 
		{
		System.out.println(i[i1][j]);	
		}
	}
	
}
}
