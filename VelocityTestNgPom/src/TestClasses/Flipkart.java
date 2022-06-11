package TestClasses;

import java.time.Duration;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import PageObjectModelPatternRepository.PageFactory.POM.PageObject.Model.HomePageFlipkartFindBy;
import PageObjectModelPatternRepository.PageFactory.POM.PageObject.Model.LoginFindBy;

public class Flipkart {
	
	
	public static void main(String[] args) {
		
	
	System.setProperty("webdriver.chrome.driver", "V:\\Self study\\chromedriver_win32\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.flipkart.com/");
    
    LoginFindBy repo=new LoginFindBy(driver);
    repo.Email();
    repo.password();
	repo.Sumbit();
	Thread.sleep(5000);
	
	//verification
	String Expected = "Vishwas";
	String Real=driver.findElement(By.xpath("//div[@class='exehdJ']")).getText();	
	System.out.println(Real);
	//Verified user
	Assert.assertEquals(Expected, Real);
	
	//search Box
	HomePageFlipkartFindBy homepage=new HomePageFlipkartFindBy(driver);
	homepage.SearchBox().sendKeys("i phone 13",Keys.CONTROL.ENTER );
	

	//which colours do you want ??
	String [] arr= {"(Starlight, 128 GB)","(Pink, 128 GB)","(Midnight, 128 GB)"};
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
	//method with full code
	Coding(driver , arr);
	

	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	Set<String> window=driver.getWindowHandles();
	Iterator<String>it=window.iterator();
	String w0=it.next();
	String w1=it.next();
	String w2=it.next();
	String w3=it.next();
	driver.switchTo().window(w1);
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
	Thread.sleep(2000);
	driver.switchTo().window(w2);
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
	Thread.sleep(2000);
	driver.switchTo().window(w3);
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
	
	
	driver.findElement(By.xpath("//span[text()='Place Order']")).click();
	driver.findElement(By.xpath("//button[text()='Deliver Here']")).click();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
	driver.findElement(By.xpath("//button[text()='CONTINUE']")).click();
	driver.findElement(By.xpath("//button[text()='Accept & Continue']")).click();
}



private static void Coding(WebDriver driver, String[] arr) {
	
	// TODO Auto-generated method stub
	

	//catching names
	List<WebElement> AllList=driver.findElements(By.cssSelector("div._4rR01T"));
	
	   int j=0;
	for(int i=0;i<AllList.size();i++) {
		
		String [] name =AllList.get(i).getText().split("13");
		String formatedname=name[1].trim();
	
		
		//My selected Color into list
		List color=Arrays.asList(arr);
		
		if(color.contains(formatedname)) {
			
			System.out.println(color);
			
			j++;
			driver.findElements(By.xpath("//div[@class='_4rR01T']")).get(i).click();	
		}
		
		if(j==arr.length) {
			break;
		}
		
	}
}
}
