package spicejet;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Assignment1 {
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "V:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		System.out.println(driver.findElement(By.xpath("//input[@type='checkbox']")).isSelected()); //false
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		System.out.println(driver.findElement(By.xpath("//input[@type='checkbox']")).isSelected());  //true
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		System.out.println(driver.findElement(By.xpath("//input[@type='checkbox']")).isSelected());
		System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());       //size 3
		
			
		boolean check = driver.findElement(By.xpath("//input[@type='checkbox']")).isSelected();
		  if(check == true)
		  {
			  System.out.println("check box is selected");
			  driver.findElement(By.xpath("//input[@type='checkbox']")).click(); 
		  }
		  else {
			  System.out.println("check box is not selected");
			  Assert.assertFalse(false);
		  }
		
		
		
	}

}
