package how.many.links.in.page.and.footer;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linkhandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	
	
	

		System.setProperty("webdriver.chrome.driver", "V:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		
		//No of links on the page
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		//scope of footer links only
		WebElement footer = driver.findElement(By.id("gf-BIG"));
		System.out.println(footer.findElements(By.tagName("a")).size());
		
		//count of the first column
		WebElement footercolumn = footer.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(footercolumn.findElements(By.tagName("a")).size());
		
		
		//click on each and every element 
		for(int i=1;i<footercolumn.findElements(By.tagName("a")).size();i++) {
			
			//String clickonelemet= Keys.chord(Keys.CONTROL,Keys.ENTER);
			
			footercolumn.findElements(By.tagName("a")).get(i).sendKeys(Keys.CONTROL,Keys.ENTER);
		Thread.sleep(2000);
		}
		
	
	
	
	}

}
