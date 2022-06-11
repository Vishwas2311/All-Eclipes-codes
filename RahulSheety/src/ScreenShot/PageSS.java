package ScreenShot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PageSS {
public static void main(String[] args) throws IOException {
	

		System.setProperty("webdriver.chrome.driver", "V:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		WebElement image =driver.findElement(By.tagName("img"));
		File name=image.getScreenshotAs(OutputType.FILE);
	
	 
		FileUtils.copyDirectory(name, new File("Eclicps.png"));
	
	
	
	
	
	
	
	
	
	}

}
