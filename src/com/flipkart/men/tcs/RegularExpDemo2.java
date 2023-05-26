package com.flipkart.men.tcs;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpDemo2 {
public static void main(String[] args) {
	
 //	String str = ("java javajava javajob");
	String str = ("java@& javajava JOB javajob 456");

	
    // Pattern pattern = Pattern.compile("j");
   //  Pattern pattern = Pattern.compile("java");
   // Pattern pattern = Pattern.compile("[0-9]");
	
	   Pattern pattern = Pattern.compile("[0-9]");
	   Matcher matcher= pattern.matcher(str);  
  
      int sum =0; //4
      while(matcher.find()) { 
	 
      String str1 = matcher.group(); // "4","5","6"
      System.out.println(str1);
      int val =  Integer.parseInt(str1); // 4 5 6
      sum=sum+val; //4+5+6
    
        }
	System.out.println("sum is:"+sum);
	
	
	
	
	
	
}
}
