package com.mahesh.automation.corejava;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ArrayListDemo {
public static void main(String[] args) {
	
	//List list = new List();
	//List list = new ArrayList<>();
//	Collection collection = new ArrayList<>();
	ArrayList al = new ArrayList();
	
	al.add(456);
	al.add("java");
	al.add(255);
	al.add("java");
	al.add('a');
	al.add(456);
	
	al.add("suresh");
	al.add("v");
	
	System.out.println(al);
	
	al.add(0, "mahesh");
	System.out.println(al);
	
	Object object =al.get(2);
	System.out.println(object);
	
	
	
}
}
