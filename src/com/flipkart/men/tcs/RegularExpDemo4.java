package com.flipkart.men.tcs;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpDemo4 {
public static void main(String[] args) {
	
	RegularExpUtility.isValidPhNum("9010090466");
	RegularExpUtility.isValidPhNum("8010090466");
	RegularExpUtility.isValidPhNum("6010090466");
	RegularExpUtility.isValidPhNum("09010090466");
	RegularExpUtility.isValidPhNum("919010903466");

	
}
}
