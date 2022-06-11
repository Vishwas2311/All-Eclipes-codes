package Java.Stream.WebElement;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FilterWithSendkeys {
	//filtering the send keys result in dynamic drop down. and comparing it with the send keys 
	@Test
	public void Filter() {
	System.setProperty("webdriver.chrome.driver", "V:\\\\chromedriver_win32\\\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
	//send keys
	driver.findElement(By.id("search-field")).sendKeys("Rice");
	//getting text of results
	List<WebElement> SearchResult = driver.findElements(By.xpath("//tbody/tr/td[1]"));
	//converting Element into TEXT
	List<WebElement> intoText=SearchResult.stream().filter(veggies->veggies.getText().contains("Rice")).collect(Collectors.toList());
	//Comparing with Assertions
	Assert.assertEquals(SearchResult, intoText);
	
	
	
	
	
	
	
	
	
	
	}
}
