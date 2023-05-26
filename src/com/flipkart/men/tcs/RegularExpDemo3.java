package com.flipkart.men.tcs;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpDemo3 {
public static void main(String[] args) {
	
	String phNum = "919010903466";
	Pattern pattern =Pattern.compile("(0|91)?[6-9][0-9]{9}");
	Matcher matcher = pattern.matcher(phNum);
	
	if(matcher.find()&&matcher.group().equalsIgnoreCase(phNum)) {
	System.out.println("it is a valid mobile number:"+phNum);	
	}
	else {
		System.out.println("it is NOT a valid mobile number:"+phNum);
	}

	
}
}
