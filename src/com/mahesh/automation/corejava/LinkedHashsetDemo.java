package com.mahesh.automation.corejava;

import java.util.*;

public class LinkedHashsetDemo {

	public static void main(String[] args) {
	      //  Collection collection = new LinkedHashSet<>();
		 //	  Set set = new HashSet<>();
		     LinkedHashSet set = new LinkedHashSet();
			
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
