package RelativeLocators;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class AboveRL {
	//Making relative Locator to handle Dynamic Objects
	@Test
public static void Relative() {
	System.setProperty("webdriver.chrome.driver", "V:\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/angularpractice/");
	//getting Web Element of name 
	WebElement Locator=driver.findElement(By.cssSelector("[name='name']"));
	///creating Relative Locator with Above,
System.out.println(	driver.findElement(with(By.tagName("label")).above(Locator)).getText());
	
	
	
}
}
