package lambdatest;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class TestSenario3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "V:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.lambdatest.com/selenium-playground/input-form-demo");
		driver.findElement(By.xpath("//button[contains(.,'Submit')]")).click();
		
		
		JavascriptExecutor js= (JavascriptExecutor)driver;

		WebElement field =driver.findElement(By.name ("name"));

		Boolean isvalid = (Boolean)js.executeScript("return arguments[0].checkValidity();", field); 
		String message =(String)js.executeScript("return arguments[0].validationMessage;", field); 
		String expected= "Please fill out this field.";
		//String message=driver.findElement(By.name("name")).getAttribute("validationMaessage");
		System.out.println(message);
		Assert.assertEquals(message, expected);
		
	    driver.findElement(By.id("name")).sendKeys("vishwas");
	    driver.findElement(By.id("inputEmail4")).sendKeys("Vishwasshinde745@gmai.com");
	    driver.findElement(By.id("inputPassword4")).sendKeys("Vishwas1234");
	    driver.findElement(By.id("company")).sendKeys("RedHat");
	    driver.findElement(By.id("websitename")).sendKeys("www.google.com");
	    driver.findElement(By.id("inputCity")).sendKeys("Pune");
	    driver.findElement(By.id("inputAddress1")).sendKeys("Vimannagar");
	    driver.findElement(By.id("inputAddress2")).sendKeys("kharadibypass");
	    driver.findElement(By.id("inputState")).sendKeys("Maharashtra");
		driver.findElement(By.id("inputZip")).sendKeys("422605");
		
		//using "SELECT" Class
		driver.findElement(By.name("country")).click();
		WebElement Countries=driver.findElement(By.name("country"));
		Select country =new Select(Countries);
		country.selectByVisibleText("United States");
		driver.findElement(By.xpath("//button[.='Submit']")).click();
		
		//massage validating
		String successful="Thanks for contacting us, we will get back to you shortly.";
		//Grabbing text
		String message2=driver.findElement(By.xpath("//p[@class='success-msg hidden']")).getText();
		System.out.println(message2);
		Assert.assertEquals(successful, message2);
		driver.close();
	}

}
