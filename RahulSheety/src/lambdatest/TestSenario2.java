package lambdatest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSenario2 {
//Drag & drop
	public static void main(String[] args) {
		
	
	
	System.setProperty("webdriver.chrome.driver", "V:\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.lambdatest.com/selenium-playground/input-form-demo");
	
	driver.findElement(By.xpath("//div/p[contains(text(),'Progress Bar & Sliders')]")).click();
	driver.findElement(By.cssSelector("a[href*='https://www.lambdatest.com/selenium-playground/drag-drop-range-sliders-demo']")).click();
	
	//here we need to find the X & y coordinate of the page where we need to drop the pointer
	//We will use the "PageRuler" Extension for the chrome.
	Actions slider=new Actions(driver);
	//giving X & Y coordinate with "PageRuler"
	slider.moveByOffset(754, 609).click().build().perform();
	String actual=driver.findElement(By.id("rangeSuccess")).getText();
	String expected ="95";
	Assert.assertEquals(actual, expected);
	
	
	
	
	
	
	
	
	
	
}
}
