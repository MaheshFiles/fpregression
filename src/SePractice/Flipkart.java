package SePractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "D:\\Javapractice\\corejavasubject\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	
	driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
	driver.get("https://www.flipkart.com");
		
	WebElement login = driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
	
	login.clear();
	login.sendKeys("9398826853");
	
	 WebElement rotp = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']"));
	    rotp.click();
	  WebElement Forgot = driver.findElement(By.xpath("//input[@class='_2IX_2- _1WRfas']"));
	Forgot.click();
	
	
	Thread.sleep(5000);
	driver.close();
	
}
}
