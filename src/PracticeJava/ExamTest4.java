package PracticeJava;

import java.awt.JobAttributes.DefaultSelectionType;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ExamTest4 {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "D:\\Javapractice\\corejavasubject\\Drivers\\chromedriver.exe");	
	WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().deleteAllCookies();
    
    driver.get("https://www.adp.in/");
 WebElement numDD =   driver.findElement(By.id("num"));
 String tagname = numDD.getTagName();
   if(tagname.equalsIgnoreCase("select")) {
	   Select select = new Select(numDD);
	   List listElementsDD = select.getOptions();
	   Set set = new HashSet<>(listElementsDD);
	   System.out.println(set);  
   } 
   else {
	   ;;;;
   }
}	
}
