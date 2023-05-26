package com.mahesh.automation.corejava;

public class SwitchDemo {
public static void main(String[] args) {
	String a = "Chrome";
	String b = "Opera";
	switch (a) {
	case "ie": System.out.println("IE BROWSER");
	              break;
	case "Chrome": System.out.println("CHROME BROWSER");
                  break;
	case "firefox": System.out.println("FIREFOX BROWSER");
                  break;
	
	case "Opera": System.out.println("OPERA BROWSER");
                  break;
	
	
	default: System.out.println("no case is matched");
	              break;
	}

	System.out.println("out of switch");
  }
}

