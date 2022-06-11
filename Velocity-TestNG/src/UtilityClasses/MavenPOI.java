package UtilityClasses;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import POM.HomePageFlipkartFindBy;

public class MavenPOI {
	static UtilityClasses util;
	static WebDriver driver;
	static HomePageFlipkartFindBy home;
	
	
	public void datadriven(WebDriver driver) throws IOException, InterruptedException {
		//accessing the file
		FileInputStream filein =new FileInputStream("V:\\Self study\\Data Driven Testing with Excel\\Book1.xlsx");
		Workbook wbook=WorkbookFactory.create(filein);
		
		//giving file access with sheet
		Sheet sheet=wbook.getSheet("TestData1");
		
		String string="";
		for(int i=0;i<10;i++) {
				
			
			    try {
			     string=sheet.getRow(i).getCell(0).getStringCellValue();
			
			    }
				catch(Exception e){
				 string = String.valueOf(sheet.getRow(i).getCell(0).getNumericCellValue());
				}
				
			    home.SearchBox().sendKeys(string,Keys.ENTER);
				
				I_am_Waiting(driver);
				
				util.explicitwait(driver,driver.findElement(By.xpath("//div[@class='_4rR01T']")));
				
				String price="";
				try {
				price=driver.findElement(By.xpath("//div[@class='_30jeq3 _1_WHN1']")).getText();
				}
				catch(Exception e){
					
					price=driver.findElement(By.xpath("//div[@class='_30jeq3']")).getText();
		
					System.out.println("Number also succesfully converted");
				}
				
				
				System.out.println(price);
				
				sheet.getRow(i).createCell(1).setCellValue(price);
		
				for(int k = 0;k<string.length();k++) {
					home.SearchBox().sendKeys(Keys.BACK_SPACE);
				}
				
		}//for loop ended

				filein.close();
				FileOutputStream FileOut=new FileOutputStream("V:\\\\Self study\\\\Data Driven Testing with Excel\\\\Book1.xlsx");
			    wbook.write(FileOut);
				
				
	}//main method ended

	private static void I_am_Waiting(WebDriver driver) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverWait explicit =new WebDriverWait(driver,Duration.ofSeconds(20));
		explicit.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='_4rR01T']")));
		Thread.sleep(2000);
		}

	
	
	
	
	
	
	
	
	
	
}
