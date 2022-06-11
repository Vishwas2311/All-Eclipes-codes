package ScrollingWebpage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment7 {
	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "V:\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	
	
	//number of columns
	System.out.println(driver.findElements(By.cssSelector(".table-display tr")).size());
	
	//number of rows
	System.out.println(driver.findElements(By.xpath("//table[@id='product']/tbody/tr/th")).size());
	
	
	//converting into webelements to count	
	List<WebElement> column=driver.findElements(By.cssSelector(".table-display tr:nth-child(2) td"));
	
	//printing the list one by one
	for(int i=0;i<column.size();i++) {
		
		System.out.println( column.get(i).getText());
		
	}
	
	//printing the one column
	//System.out.println(driver.findElement(By.cssSelector(".table-display tr:nth-child(2) td")).getText());
	
	
	
	
	
	
	
	
	}

}
