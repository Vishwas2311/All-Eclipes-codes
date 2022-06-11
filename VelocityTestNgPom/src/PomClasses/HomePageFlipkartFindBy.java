package PomClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageFlipkartFindBy {
//Project Object Pattern
	WebDriver driver;
	
	
	@FindBy(xpath="//input[@name='q']")
	WebElement searchbox;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement search;
          
          
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





}
