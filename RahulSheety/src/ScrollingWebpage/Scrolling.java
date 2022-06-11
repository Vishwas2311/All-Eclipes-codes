package ScrollingWebpage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Scrolling {
public static void main(String[] args) throws InterruptedException {
	
	

	System.setProperty("webdriver.chrome.driver", "V:\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	
	//this the method to enter in the JAVA Script
	JavascriptExecutor js= (JavascriptExecutor)driver;
	
	//this the the Script to write the JAVA Script
	js.executeScript("window.scrollBy(0,500)");
	
	Thread.sleep(3000);
	//this is for Specific Window with CSS selector
	js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
	
List<WebElement>  values=driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)")); 
	int sum=0;
    for(int i=0;i<values.size();i++) {
    	
System.out.println( Integer.parseInt(values.get(i).getText()));	
    	 
//converting values for concatenation to integer
    sum = sum + Integer.parseInt(values.get(i).getText());

    }	System.out.println("total sum of the column =" + sum);
    
    
    
    //matching the total value to the ANS present in the DOM
    System.out.println(driver.findElement(By.className("totalAmount")).getText());
  //Now converted above value into INTO
   int total =  Integer.parseInt(driver.findElement(By.className("totalAmount")).getText().split(":")[1].trim());

Assert.assertEquals(total, sum);
	
}
}
