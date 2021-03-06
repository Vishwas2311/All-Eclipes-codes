package how.many.links.in.page.and.footer;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class windownameprinfting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "V:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		//No of links on the page
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		//Navigating to the footer links
		WebElement footer = driver.findElement(By.cssSelector("div[id='gf-BIG']"));
		System.out.println(footer.findElements(By.tagName("a")).size());
		
		//navigating to the column links
		WebElement footercolumn= footer.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(footercolumn.findElements(By.tagName("a")).size());
		
		for(int i=1;i<footercolumn.findElements(By.tagName("a")).size();i++) {
			
			footercolumn.findElements(By.tagName("a")).get(i).sendKeys(Keys.CONTROL,Keys.ENTER);
		}
		
		//window handling 
		Set<String> windows= driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		
		
		//printing the name of the windows
		//directly switching to the windows without creating the parent and child 
		while (it.hasNext()){
		  	driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}		

		
		
		
		
		
	}

}
