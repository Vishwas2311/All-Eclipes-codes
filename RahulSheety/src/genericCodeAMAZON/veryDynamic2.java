package genericCodeAMAZON;


import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class veryDynamic2 {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "V:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
	
		 String[] cart= {"Cucumber","Beetroot","Pumpkin"};    	 //array

		Coding(driver, cart);
		
		driver.findElement(By.cssSelector("img[alt=\"Cart\"]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@class='promoCode']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.xpath("//button[text()='Apply']")).click();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		System.out.println(driver.findElement(By.cssSelector("span[class*='promoInfo']")).getText());
		driver.findElement(By.xpath("//button[text()='Place Order']")).click();
		
		
		Select country= new Select(driver.findElement(By.xpath("//select[contains(.,'Select')]")));
		country.selectByVisibleText("India");
		driver.findElement(By.xpath("//input[@class='chkAgree']")).click();
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
 
}


	
	
	public static void Coding(WebDriver driver,String[] cart) {
		
		int j = 0;
		
		//this will give us the over all list of the Products Present on the WEB PAGE
        
              List<WebElement> allProducts   = driver.findElements(By.cssSelector("h4.product-name"));
	for (int i=0; i<allProducts.size();i++)
	{
		
	   
		//need to format the needed items
		
		String[] Buy = allProducts.get(i).getText().split("-");
		String Formatedname=Buy[0].trim();
		//check whether name you extracted is present in the array list or not
		//convert array into array list      ===array list is taking less memory as compare top the array list
		
		List neededitems= Arrays.asList(cart);
		 	
		if (neededitems.contains(Formatedname))
		{
			
			   j++;
			driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
		}
	
	   
		if(j==cart.length )
		{
			break;
		}
	
	}
		
		
	}
	
	
	
	
}
