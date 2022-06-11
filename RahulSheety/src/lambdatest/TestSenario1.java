package lambdatest;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class TestSenario1 {
public static void main(String[] args) {
	

	System.setProperty("webdriver.chrome.driver","V:\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.lambdatest.com/selenium-playground/");
	driver.findElement(By.xpath("//a[.='Simple Form Demo']")).click();
	
	String name1 ="Simple Form Demo";
	String link1 = driver.findElement(By.xpath("//a[.='Simple Form Demo']")).getText();
	
	Assert.assertEquals(link1, name1);	
	
	
	String veriable = "Welcome to LambdaTest";
	driver.findElement(By.xpath("//input[@id='user-message']")).sendKeys(veriable);
	driver.findElement(By.cssSelector("button[id='showInput']")).click();
	
	//relative locator below
    WebElement massage=driver.findElement(By.xpath("//label[.='Your Message: ']"));		
	String veriable1 =driver.findElement(with(By.cssSelector("p[id='message']")).below(massage)).getText();
	Assert.assertEquals(veriable, veriable1);
	
	
	
	
	
}

}
