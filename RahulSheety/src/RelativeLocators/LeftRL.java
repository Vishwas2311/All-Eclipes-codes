package RelativeLocators;
import static org.openqa.selenium.support.locators.RelativeLocator.with;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LeftRL {	
	//Making relative Locator to handle Dynamic Objects
	//getting the text and making it with Relative Locator
	@Test
	public void Left() {	
		System.setProperty("webdriver.chrome.driver", "V:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
	    //WebElement of the Right Text of Check Box
	    WebElement checkboxname=	driver.findElement(By.xpath("//label[contains(text(),'Check me out if you Love IceCreams!')]"));
		//write Relative locator script with Left TAGNAME
		driver.findElement(with(By.tagName("input")).toLeftOf(checkboxname)).click();
	

}}
