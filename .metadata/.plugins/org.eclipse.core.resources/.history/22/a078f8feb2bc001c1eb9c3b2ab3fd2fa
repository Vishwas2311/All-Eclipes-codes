package Test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CarLoan {

	@Parameters({ "URL" }) //this will help to navigate the website before executing this method
	@Test
	public void webLogincar(String url) {
		System.out.println("Car loan Web Login is sucessful");
		System.out.println(url);
		//selenium
	}
	@Test
	public void mobileLogincar() {
	System.out.println("car loan Mobile Login is successful");
	//Appium
	}
	
	@Test
	public void mobilelogocar() {
		System.out.println("car loan mobile logo");
	}
	
	@Test
	public void mobileUIcar() {
		System.out.println("car loan mobile UI");
	}
	
	//groups for regression testing 
	//OR just selected Test cases 
	@Test(groups= {"Smoke"})  
	public void ApiLogincar() {
		System.out.println("car loan Api is created ");
		//Rest Api
	}
	
	@BeforeClass //only this class 
	public void beforeclass() {
		System.out.println("@ Before class i wi");
	}

	@BeforeMethod //Scope in the class Methods
	public void methodBefore() {
		System.out.println("before every Method in Types ");
	}
	@AfterMethod
	public void methodAfter() {
		System.out.println("After every Method i will be the last");
	}
	
}
