package introduction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "V:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("https://www.instagram.com/?hl=en");
		driver.findElement(By.xpath("//input[@aria-label='Phone number, username, or email']")).sendKeys("Vishwas23.11");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Vishwas@1995");
        driver.findElement(By.xpath("//div[@class='             qF0y9          Igw0E     IwRSH      eGOV_         _4EzTm                                                                                                              ']")).click();
		Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@class='sqdOP  L3NKy   y3zKF     ']")).click();
        Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='aOOlW  bIiDR  ']")).click();
		driver.findElement(By.xpath("//span[@class='_2dbep qNELH']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Log Out']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='dMMs-']")).click();
		//driver.findElement(By.xpath("//body/div[1]/section/main/article/div[2]/div[1]/div/div[1]/following-sibling::div[@class='             qF0y9          Igw0E     IwRSH      eGOV_         _4EzTm       oxOrt                               CIRqI                  IY_1_    aGBdT                                                  ']")).click();
		
		
		driver.navigate().to("https://www.google.co.in/");
		driver.navigate().back();
		driver.navigate().forward();
		
		driver.close();
		
		System.setProperty("webdriver.chrome.driver", "V:\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver3=new ChromeDriver();
		driver3.manage().window().maximize();
		driver3.get("https://www.google.co.in/");
		driver3.navigate().to("https://www.instagram.com/?hl=en");
		driver3.navigate().back();
		driver3.navigate().forward();
		
	}
}