package UtilityClasses;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UtilityClasses {

	static WebDriver driver;
	
	
	public static void implicitWait() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	public static WebElement explicitwait(WebDriver driver, WebElement BYClass) {
		
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
	WebElement element1=wait.until(ExpectedConditions.visibilityOf(BYClass));
	return element1;
	}

	
	public static void getscreenShotAs(WebDriver driver, String successfull) throws IOException {
		
		Date dt =new Date();
		
		SimpleDateFormat date1 = new SimpleDateFormat("YYYY-MM-DD-HH-MM-SS");
		String date=date1.format( dt);
		
		System.out.println(date);
		//taking the screen shot 
		//selenium hierarchy say TakesScreenshot Method implemented in RemoteWebDriver
		//Search context -> WebDriver -> RemoteWebDriver (JavaSCriptExecutor + TakesScreenshot) -> chromium Driver(Chrome Driver + Edge Class);
		
		//Up casting - > object (File-> TakesScreenshot) - > WebDriver
	 	File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
	 	
		//this is the destination to save the file
		File Destination =new File("V:\\Velocity DREAM\\NOTES\\TakesScreenshot\\getScreenshotAs"+date+".jpg");
		
		//this is the FIle Handler to source and destination
		FileHandler.copy(source, Destination);
		
		System.out.println("ScreenShotTaken");
	}
	
	public static void failAssertSceenShot(WebDriver driver , String abc) throws IOException {
         Date dt =new Date();
		SimpleDateFormat date1 = new SimpleDateFormat("YYYY-MM-DD-HH-MM-SS");
		String date=date1.format( dt);
		
		EventFiringWebDriver EFWDriver= new EventFiringWebDriver(driver);
		
		File source = EFWDriver.getScreenshotAs(OutputType.FILE);
		
		File destination = new File("V:\\Velocity DREAM\\NOTES\\TakesScreenshot\\AssertFail+"+date+".png");
		
		FileHandler.copy(source, destination);
		
		System.out.println("failAssertSceenShot");
		
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
}
