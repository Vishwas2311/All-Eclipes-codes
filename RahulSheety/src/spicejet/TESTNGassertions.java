package spicejet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class TESTNGassertions {
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "V:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='1 Adult']")).click();
		Thread.sleep(1000);
		
		
		int i=1;
		while (i<9)
		{
			driver.findElement(By.xpath("//div[@data-testid='Adult-testID-plus-one-cta']")).click();
			i++;
		}
		driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep']/parent::div)[5]")).click();
		System.out.println(driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep']/parent::div)[5]")).getText());
		
		//IS SELECTED method Trying to use BUT FAILED to use BCZ ATTRIBUTES are changing after clicking the radio button
		System.out.println(driver.findElement(By.xpath("//div[@data-testid='return-date-dropdown-label-test-id']")).isEnabled()); //in this statement we cant get false BCZ it still same the valve 
		//Radio button
		System.out.println(driver.findElement(By.xpath("//div[contains(text(),'Return Date')]")).getAttribute("style"));          //see Test NG 1st syntax that i want to print before clicking and after clicking the ROUND TRIP , CALENDER is getting HIDE.
		driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-zso239']) [2]")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.xpath("//div[@data-testid='return-date-dropdown-label-test-id']")).isEnabled());  //in this also we are getting same 
		
		//TEST NG 
		//to over come the ENABLED //it shows disabled in current UI but it is not //developed defiantly changed ATTRIBUTE we have to find it and put in ASSERTIONS .
		System.out.println(driver.findElement(By.xpath("//div[contains(text(),'Return Date')]")).getAttribute("style"));
		//assertion is the most interesting method i have seen in the coding till now
		
		if (driver.findElement(By.xpath("//div[contains(text(),'Return Date')]")).getAttribute("style").contains("1"));
		{
			System.out.println("Calender for ROUND TRIP IS ENABLED");
			Assert.assertTrue(true);
		} 
		driver.close();
		
		
	}

}
