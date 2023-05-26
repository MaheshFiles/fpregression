package com.flipkart.men.tcs;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpDemo {
public static void main(String[] args) {
	
 //	String str = ("java javajava javajob");
	String str = ("java@& javajava JOB javajob 456");

	
    // Pattern pattern = Pattern.compile("j");
   //  Pattern pattern = Pattern.compile("java");
   //  Pattern pattern = Pattern.compile("[java]");
	// Pattern pattern = Pattern.compile("[a-z]");
 //    Pattern pattern = Pattern.compile("[A-Z]");
//	   Pattern pattern = Pattern.compile("[A-Za-z]");
//	  Pattern pattern = Pattern.compile("[0-9]");
  //   Pattern pattern = Pattern.compile("[A-Za-z0-9]");
	   Pattern pattern = Pattern.compile("[^A-Za-z0-9]");


       
        Matcher matcher= pattern.matcher(str);  
  
      int Count =0;
      while(matcher.find()) { 
	  Count++;
      String str1 = matcher.group();
      System.out.println(str1);
    
      int index =  matcher.start();
	  System.out.println("    "+index);  
	
	  int endindex = matcher.end();
	  System.out.println("    "+endindex);
	 
  }
	System.out.println("noof accurences of char is:"+Count);
	
	
	
	
	
	
}
}
