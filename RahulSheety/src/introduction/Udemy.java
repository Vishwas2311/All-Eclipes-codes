package introduction;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Udemy {

	public static void main(String[] args) {
	//invoking the browser.
		//chrome-chrome drivers >>   close ,  get .
		//firefox -firefox drivers>>  close ,  get.
		//safari- safariDrivers  >> close ,  get .
		//web driver methods + personal class methods {this will belonging to personal methods it won't work in other Webdrivers }
		
		//chromedriver.exe -> 3rd party which provided by chrome guys to INVOKING the browser.	
    System.setProperty("webdriver.chrome.driver", "V:\\chromedriver_win32\\chromedriver.exe");

       //firefox driver
      // gecko griver
    
      // webdriver.gecko.driver
      //System.setProperty("webdriver.gecko.driver", "path of gecko driver with .exe.");
      //WebDriver driver=new firefoxdriver;
      
      
      //webdriver.edge.driver
      //System.setProperty('webdriver.edge.driver', ' path of edge driver with .exe');
       //WebDriver driver=new Edgedriver
    
    
       //webdriver.chrome.driver - > value of path 
	WebDriver driver=(WebDriver) new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));     // this is the most important with help to waith the upcoming syntax to get in console as a printed (specially if you want to print the "incorrect password" msg in console it will help to wait the console get printed it) 
	
	driver.get("https://www.udemy.com/join/login-popup/?skip_suggest=1&locale=en_US&next=https%3A%2F%2Fwww.udemy.com%2Fjoin%2Flogin-popup%2F%3Flocale%3Den_US%26response_type%3Dhtml%26next%3Dhttps%253A%252F%252Fwww.udemy.com%252F&response_type=html");
    driver.manage().window().maximize();
    System.out.println(driver.getCurrentUrl()); 
    
    driver.findElement(By.cssSelector("input[class='form-control'")).sendKeys("vishwasshinde07@gmail.com");
    driver.findElement(By.xpath("//input[@type='email']")).clear();
    driver.findElement(By.xpath("//input[@id='email--1']")).sendKeys("vishwasshinde745@gmail.com");
    driver.findElement(By.cssSelector("\\input[type='password']")).sendKeys("Vishwas@1995");
    driver.findElement(By.cssSelector("input[data-purpose='do-login']")).click();
    
    
    
	}
 
}
