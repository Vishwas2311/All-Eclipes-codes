package Test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Types {

	@Test
	public void Homeloan() {
		System.out.println("Homeloan-> 6% interest");
	}
	
	
	@Test(groups= {"Smoke"})
	public void Carloan() {
		System.out.println("carloan -> 12% interest");
	}
	

	@BeforeTest
	public void before() {
		System.out.println("@BeforeTest test server has started");
	}
	
	@AfterTest
	public void after(){
	System.out.println("@AfterTest test close the chrome browser");
	}
	
	@BeforeSuite
	public void beforesuite() {
		System.out.println("I am the number 1 in SUITE");
	}
	
	@AfterSuite
	public void AfterSuite() {
		System.out.println("I am the Last 1 in the SUITE");
	}
	
}
