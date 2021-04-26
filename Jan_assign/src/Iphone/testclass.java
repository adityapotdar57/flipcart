package Iphone;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import POM_class.Iphone_details;
import POM_class.search_iphone;


public class testclass {
	
	public static void main(String [] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\aditya\\Downloads\\geckodriver.exe");
				
				WebDriver driver = new FirefoxDriver();
				driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.flipkart.com/");
		
		Thread.sleep(3000);
		search_iphone search = new search_iphone(driver);
		        search.closetab();
				search.searchIphone();
				search.clicksearchbtn();
				
	    Thread.sleep(3000);
		Iphone_details details = new Iphone_details(driver) ;
		        details.clickonlowpricebtn();
		        Thread.sleep(2000);
		        details.modelname();
		        details.price();				
				details.phoneratings();
	}
		
}
