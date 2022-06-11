package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import UtilityClasses.UtilityClasses;

public class HomePageFlipkartFindBy extends UtilityClasses{
//Project Object Pattern
	static WebDriver driver;
	

	
	@FindBy(xpath="//input[@name='q']")
	private WebElement searchbox;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement search;
	
	@FindBy(xpath="//div[text()='Vishwas']")
	private WebElement verifyaccount;
          
	@FindBy(xpath="//input[@name='q']")
	private WebElement clearSearchBox;
	
	
          
	public HomePageFlipkartFindBy(WebDriver driver) {
	// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
}


	public WebElement SearchBox() {
		
		return searchbox;
	}
	
	public void Search() {
		search.click();
	}

	public boolean verifyaccount() {
		try {
		WebElement element = explicitwait(driver,verifyaccount);
		return true;
	}catch(Exception e){
		System.out.println(e);
		return false;
	}
		
	}

	public void ClearSearchBox(String SearchBox) {
		
		for(int i =0; i<= SearchBox.length();i++) {
			clearSearchBox.sendKeys(Keys.BACK_SPACE);
		}
	}


}
