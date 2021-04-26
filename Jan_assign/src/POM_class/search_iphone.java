package POM_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class search_iphone {

	@FindBy (xpath=("//input[@type='text']"))private WebElement searchbox;
	
	@FindBy (xpath=("//button[@class='L0Z3Pu']"))private WebElement searchbtn;
	
	@FindBy (xpath=("//button[@class='_2KpZ6l _2doB4z']"))private WebElement close;
	
	public search_iphone(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	public void closetab() {
	close.click();	
	}
	public void searchIphone() {
		searchbox.sendKeys("iphone mobiles");
	}
	
	public void clicksearchbtn() {
		searchbtn.click();
	}
}
