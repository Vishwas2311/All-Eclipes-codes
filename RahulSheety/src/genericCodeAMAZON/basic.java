package genericCodeAMAZON;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class basic {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "\"V:\\chromedriver_win32\\chromedriver.exe\"");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	
	Actions move=new Actions(driver);
	move.moveToElement(driver.findElement(By.cssSelector("a[class='nav-a nav-a-2 nav-truncate   nav-progressive-attribute']"))).build().perform();
	
	
	
	
}
}
