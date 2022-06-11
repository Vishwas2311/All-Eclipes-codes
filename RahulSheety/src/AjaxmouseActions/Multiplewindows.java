package AjaxmouseActions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiplewindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "V:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/windows");
		driver.findElement(By.cssSelector("a[href*='/windows/new']")).click();
		
		//switching windows
		Set<String> windows = driver.getWindowHandles();            //parent to child 
		Iterator<String> it =windows.iterator();
		String parent = it.next();
		String child =it.next();
		driver.switchTo().window(child);                           //most imp to switching window
		
		
		System.out.println(driver.findElement(By.xpath("//h3[text()='New Window']")).getText().split(" ")[1].trim());
		
		//Navigating to parent window again.
		driver.switchTo().window(parent);
        System.out.println(driver.findElement(By.xpath("//h3[text()='Opening a new window']")).getText().split("a")[1].trim());		
		
		
	}

}
