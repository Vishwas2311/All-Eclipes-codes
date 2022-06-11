package GetWindowHandles;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GetWindowHandles {
	//New window with new URL Handling
	@Test
	public void Windowhandles() throws IOException {

		System.setProperty("webdriver.chrome.driver", "V:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//opening first window
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		//opening new window
		driver.switchTo().newWindow(WindowType.WINDOW);
		//using Set<String> navigating to the second window with new URL
	    Set<String>	window=driver.getWindowHandles();
	     //iterating the windows
	     Iterator<String> It= window.iterator();
		//parent
	     String Oldwindow= It.next();
		//child
	     String Newwindow=  It.next();
		//switching to new window
	     driver.switchTo().window(Newwindow);
	     //open URL
	     driver.get("https://www.rahulshettyacademy.com/#/index");
		//Grabbing the text of 1st course
	     String first=driver.findElements(By.xpath("//h2/a")).get(0).getText();
		//reversing the navigation to the old window
	     driver.switchTo().window(Oldwindow);
		//sendkeys to the name TEXTBOX
	    WebElement diamensions= driver.findElement(By.cssSelector("[name='name']"));
	    diamensions.sendKeys(first);
	     
	   System.out.println( diamensions.getRect().getDimension().getHeight());
	    System.out.println(diamensions.getRect().getDimension().getWidth());
	     
	    
	     
	     
	     /*
		WebElement Screenshot = driver.findElement(By.cssSelector("[name='name']"));
		Screenshot.sendKeys(first);
		
		File cnew =Screenshot.getScreenshotAs(OutputType.FILE);
		FileUtils.copyDirectory(cnew, new File("Eclips.png"));
		*/
		
	}

}
