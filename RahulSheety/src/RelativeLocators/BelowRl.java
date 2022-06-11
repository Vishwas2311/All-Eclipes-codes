package RelativeLocators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import static org.openqa.selenium.support.locators.RelativeLocator.with;


public class BelowRl {
	//Making relative Locator to handle Dynamic Objects
//this would give the Relative Locator /user-friendly / dynamic / reliable.
	@Test
	public void belowRl() {
	
		System.setProperty("webdriver.chrome.driver", "V:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
	    
		//Retrieve the parent Locator
		WebElement parent =driver.findElement(By.cssSelector("[for='exampleFormControlSelect1']"));
		//grab the child locator
		System.out.println(driver.findElement(with(By.cssSelector("[id='exampleFormControlSelect1']")).below(parent)).getText());
		//syso
	
	
	
	
	
	
	
	
	
	
}}
