package Framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Framehandeling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Simple drag and drop program in Frames,
		
		
		System.setProperty("webdriver.chrome.driver", "V:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();	
		driver.get("https://jqueryui.com/droppable/");
		
		//navigating to the frames
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='demo-frame']")));
	    //other way to switch to the frames with INDEX
		//driver.switchTo().frame(0);
		//to get the size of the frames from the DOM
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		
		
		//storing the element in the object to use in the frames 
		WebElement take =driver.findElement(By.cssSelector("div#draggable"));
		WebElement drop =driver.findElement(By.cssSelector("div#droppable"));
		
		
		//Actions - Drag and drop
		Actions mouse =new Actions(driver);
		mouse.dragAndDrop(take, drop).build().perform();
		
		//to navigate to main window
		driver.switchTo().defaultContent();                 // this is the most 
		
	
		
		
		
		
	}

}
