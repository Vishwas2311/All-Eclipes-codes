package LinkValidation;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class AlllinkValidationFrompage {
public static void main(String[] args) throws MalformedURLException, IOException {
	
	
	System.setProperty("webdriver.chrome.driver", "V:\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver(); 	
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	
	//get all links providate on the page into WebElement
	
	List<WebElement> Links = driver.findElements(By.cssSelector("li[class='gf-li'] a"));
	
	//this will avoid stoping Assertion and get all Broken URL
	SoftAssert a = new SoftAssert();
	for(WebElement link : Links) {
		//storing the URL in to a variable
		String url = driver.findElement(By.cssSelector("li[class='gf-li'] a")).getAttribute("href");
		//URL method
		HttpURLConnection conn= (HttpURLConnection) new URL(url).openConnection();
		conn.setRequestMethod("HEAD");
		conn.connect();
		int requestcode =conn.getResponseCode();
		System.out.println(requestcode);
		
		a.assertTrue(requestcode<400,"This URl" + link +" is Broken " + "Respont Code is " + requestcode);
		
		
	}
	
	a.assertAll();
	
	
	
	
	
	
	
}
}
