package com.mahesh.automation.corejava;

import java.util.Comparator;
import java.util.TreeSet;

 class CustomSorting implements Comparator
{

	@Override
	public int compare(Object o1, Object o2) {
		System.out.println(1111111111);
		String str1 = (String) o1;
		String str2 = (String) o2;

		// return str1.compareTo(str2); //ascending order
		// return -str1.compareTo(str2); //descending order
		// return str2.compareTo(str1);   //descending order
		return -str2.compareTo(str1);   //ascending order
	}
	}

public class CustomSortingDemo {
public static void main(String[] args) {
		
   // TreeSet ts = new TreeSet();
    CustomSorting  sorting = new  CustomSorting();
    TreeSet ts = new TreeSet(sorting);
	ts.add("java");
	ts.add("selenium");
	ts.add("testing");
	ts.add("automation");
	ts.add("aabc");
	ts.add("manual testing");
	ts.add("maven");
	
System.out.println(ts);	
	}

}
