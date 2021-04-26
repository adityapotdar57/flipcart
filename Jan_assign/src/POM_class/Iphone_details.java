package POM_class;

import java.util.Iterator;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Iphone_details {

	@FindBy (xpath=("//div[@class='_30jeq3 _1_WHN1']"))private List<WebElement> pricetag;
	
	@FindBy (xpath=("//div[@class='_5THWM1']/div[3]"))private WebElement lowprice;
	
	@FindBy (xpath=("//div[@class='_4rR01T']"))private List<WebElement> model;
	
	@FindBy (xpath=("//span[@class='_2_R_DZ']/span/span"))private List<WebElement> ratings;
	
	public Iphone_details(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	public void clickonlowpricebtn() {
		lowprice.click();
	}
	
	public void modelname() {
		List<WebElement> modelname = model;
     	System.out.println("modelnames of iphones");
		for(WebElement models : modelname) {
			System.out.println(models.getText());
			
		}
		System.out.println();
	}
	
	public void price() {
		
		List<WebElement> prices = pricetag;
		System.out.println("pricelist of iphones");
		for(WebElement pricelist : prices) {
			
			System.out.println(pricelist.getText());
		}
		System.out.println();
		
	}
	

	public void phoneratings() {
		List<WebElement> rates = ratings;
		System.out.println("phoneratings of iphone");
		for(WebElement phoneratings : rates) {
			System.out.println(phoneratings.getText());
		}
		
		System.out.println();
	}
}
