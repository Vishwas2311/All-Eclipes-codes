package TestClasses;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Baseclasses.getWebDriver;
import POM.HomePageFlipkartFindBy;
import POM.LoginFindBy;
import UtilityClasses.UtilityClasses;

import org.testng.annotations.BeforeMethod;

public class FlipkartFirefox {

	static WebDriver driver;
	static LoginFindBy login;
	static HomePageFlipkartFindBy home;
	
	@BeforeClass
	public void beforeClass() {
		driver = getWebDriver.WebDriver("firefox");
	}
	
	@BeforeMethod
	public void BeforeMethod() throws InterruptedException {
	    login=new LoginFindBy(driver);
		home = new HomePageFlipkartFindBy(driver);
		
	}	
	@Test
	public void login() {
		login.Email();
		login.password();
		login.Sumbit();
		Assert.assertTrue(home.verifyaccount());
	}
	
	@Test(invocationCount= 2,dataProvider="dataDriving")
	public void productsearching(String names, String name2) throws InterruptedException {
		String w=names+" "+ name2; 
		home.SearchBox().sendKeys(w);
		home.ClearSearchBox(w);

	}
	
	@AfterMethod
	public void ScreenShot() throws IOException {
		UtilityClasses.getscreenShotAs(driver, "fail printing");
		
	}
	
	@AfterClass
	public void close() {
		driver.close();
	}
	
	@DataProvider
	public Object [][] dataDriving(){
		Object [] [] list=new Object[3][2];
		
		list[0][0]=" i phone";
		list[0][1]=" i phone 10000";
		
		list[1][0]=" i phone 12 pro max";
		list[1][1]=" i phone 12 pro max 20000";
		
		list[2][0]=" i phone 13 pro max";
		list[2][1]=" i phone 13 pro max 300000";
		return list;
		
	}
	
	
	
	
	
}
