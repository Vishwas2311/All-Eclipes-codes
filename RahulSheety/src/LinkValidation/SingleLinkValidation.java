package LinkValidation;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SingleLinkValidation {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "V:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//driver.findElement(By.cssSelector("a[href*='brokenlink']")).click();
		
		//storing into the String to get used for open COnnection METHOD
		String url=	driver.findElement(By.cssSelector("a[href*='brokenlink']")).getAttribute("href");

		//method to get URL codes 
		HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();	
		
		conn.setRequestMethod("HEAD");
		//this will help to connect URL.
		conn.connect();
	int Respondcode =	conn.getResponseCode();
		System.out.println(Respondcode);
		
	}

}
