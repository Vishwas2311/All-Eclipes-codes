package genericCodeAMAZON;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicSyntax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "V:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		//this will give us the over all list of the Products Present on the WEB PAGE
    String[] name= {"Cucumber","Brocolli"};         
              List<WebElement> allProducts   = driver.findElements(By.cssSelector("h4.product-name"));
	for (int i=0; i<allProducts.size();i++)
	{
		String Buy = allProducts.get(i).getText();
		if (Buy.contains("Cucumber"))
		{
			driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
		}
	}
              
              
		
	}


	}
	

  