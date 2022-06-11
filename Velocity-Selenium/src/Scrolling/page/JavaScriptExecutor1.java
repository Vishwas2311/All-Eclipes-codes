package Scrolling.page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class JavaScriptExecutor1 {
public static void main(String[] args) throws InterruptedException {

		
	

	System.setProperty("webdriver.chrome.driver", "V:\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
    driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	
	//this the method to enter in the JAVA Script
    JavascriptExecutor js=(JavascriptExecutor)driver;
	
	//this the the Script to write the JAVA Script
	js.executeScript("window.scrollBy(0,500)");
	
	Thread.sleep(5000);
	
	//2nd window under the page 
	js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
	
	Thread.sleep(5000);
	
	//Unto this element we will scroll
	WebElement footer=driver.findElement(By.xpath("//a[text()='REST API']"));
	
	//scrollTo unto element
	js.executeScript("arguments[0].scrollIntoView(true);", footer);

	
	// ***assert table calculation
	
	List<WebElement> valueelement = driver.findElements(By.xpath("(//tbody)[2]/tr/td[4]"));
	int sum = 0;
	for(int i=0;i<valueelement.size();i++) {
		Integer sum1=Integer.parseInt(valueelement.get(i).getText());
		
		System.out.println(valueelement.get(i).getText());
		
		//addition
		sum=sum+sum1;
	}
	
	System.out.println(sum);
	
	String actualsum=driver.findElement(By.className("totalAmount")).getText().split(":")[1].trim();
	
	System.out.println(actualsum);
	
	//Assert.assertEquals(actualsum,sum);
	
	
	//Click with JS
	//js.executeScript("arguments[0].click();", footer);

	//no of frames under Webelement
	System.out.println(driver.findElements(By.tagName("iframe")).size());
	// switching to the frame 
	driver.switchTo().defaultContent();
}

}
