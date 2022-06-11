package Framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment5 {
	public static void main(String[] args) {
	
	
		System.setProperty("webdriver.chrome.driver", "V:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();	
		driver.get("https://the-internet.herokuapp.com/frames");
		driver.findElement(By.cssSelector("a[href='/nested_frames']")).click();
		//size of the frames
		System.out.println(driver.findElements(By.tagName("frame")).size());
		driver.switchTo().frame("frame-top");
		driver.switchTo().frame("frame-middle");
		
		
		Actions mouse =new Actions(driver);
		//mouse.moveToElement(driver.findElement(By.xpath("//frame[contains(@name,'frame-middle')]"))).contextClick().build().perform();
		System.out.println(driver.findElement(By.id("content")).getText());
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	
	
	}
