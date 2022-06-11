package spicejet;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class suggestiveDROPDOWNS {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		

		System.setProperty("webdriver.chrome.driver", "V:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		driver.get("https://www.spicejet.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("((//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep']) [1])/child::input")).sendKeys("ba");
		Thread.sleep(2000);
		List<WebElement> options = (List<WebElement>) driver.findElement(By.cssSelector("div[class='css-1dbjc4n r-18u37iz'] div"));
		
		
		for (WebElement option : options)
		{
			if (option.getText().equalsIgnoreCase("Bengaluru"))
			{
				option.click();
				break;
			}
			
			
		}
		
		
		
		
		
		
		
	}

}
