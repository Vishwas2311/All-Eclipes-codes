package AjaxmouseActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class ActionsDemo {
	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver", "V:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		//Ajax mouse interactions
		Actions move=new Actions(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		move.moveToElement(driver.findElement(By.cssSelector("a[id='nav-link-accountList']"))).build().perform();         //build and perform has to be in the last of every ACTION method then it will perform that application
		
		//making object
		WebElement move2=driver.findElement(By.cssSelector("input[type*='text']"));
		//this will send keys with pressing shift key button.
		move.moveToElement(move2).click().keyDown(Keys.SHIFT).sendKeys("i phone pro max").build().perform();
		//right clicking on selected object
		move.moveToElement(move2).contextClick().build().perform();	
		
		
		
		
	}

}
