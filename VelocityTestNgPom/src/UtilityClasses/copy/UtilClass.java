package UtilityClasses.copy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UtilClass {

	WebDriver driver;

	public WebElement explicitwait(WebDriver driver, String BYClass) {
		
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
	WebElement element1=wait.until(ExpectedConditions.visibilityOf((WebElement) By.xpath("BYClass")));
	return element1;
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
