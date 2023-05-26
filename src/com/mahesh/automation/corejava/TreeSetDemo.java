package com.mahesh.automation.corejava;

import java.util.Collections;
import java.util.TreeSet;
;

public class TreeSetDemo {

	public static void main(String[] args) {
		// Collection collection = new TreeSet();
		// Set set = new TreeSet();
	TreeSet set = new TreeSet();
		 
		 set.add(456);
		 set.add(22456);
		 set.add(56);
	//	 set.add("java");  // class cast exception(hetero geneous element)
	//	 set.add(null);     Null pointer exception
		 set.add(49);
		 set.add(22456);
		 
		 
		System.out.println(set);
		 
		 
	}

}
