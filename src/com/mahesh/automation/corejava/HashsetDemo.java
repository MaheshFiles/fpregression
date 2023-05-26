package com.mahesh.automation.corejava;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class HashsetDemo {

	public static void main(String[] args) {
		
  //  Collection collection = new HashSet<>();
 //	  Set set = new HashSet<>();
	HashSet set = new HashSet();
	
	set.add(456);
	set.add("java");
	set.add(null);
	set.add("job");
	set.add(456);
	set.add("java");
	set.add(456.566);
	set.add('d');
	
	System.out.println(set);
		
	}

}
