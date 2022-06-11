package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import UtilityClasses.UtilityClasses;

public class LoginFindBy extends UtilityClasses{

	WebDriver driver;
	
	
	
	@FindBy(xpath="//input[@class='_2IX_2- VJZDxU']")
	private WebElement Email;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement password;
	
	@FindBy(xpath="(//span[.='Login'])[3]")
	private WebElement sumbit;
	
	public LoginFindBy(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	
	public void Email() {
		 Email.sendKeys("7743913257");;
	}
	
	public void password() {
		 password.sendKeys("VBS@123");
	}
	
	public void Sumbit() {
		
		sumbit.click();
	}




	
	
	
	
	
	
}
