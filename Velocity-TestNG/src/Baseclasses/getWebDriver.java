package Baseclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class getWebDriver {

	static WebDriver driver;
	
	public static WebDriver WebDriver(String browser) {
		
		if(browser.equals("chrome")) {
	        System.setProperty("webdriver.chrome.driver","V:\\Drivers\\chromedriver.exe");
	         driver=new ChromeDriver();
    
		}else if(browser.equals("firefox")){
			System.setProperty("webdriver.gecko.driver","V:\\Drivers\\geckodriver.exe");
			 driver=new FirefoxDriver();
		  
		}
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		return driver;
	}
	
}
