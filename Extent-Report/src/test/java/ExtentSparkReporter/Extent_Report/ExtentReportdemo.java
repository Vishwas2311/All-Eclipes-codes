package ExtentSparkReporter.Extent_Report;



import static org.openqa.selenium.support.locators.RelativeLocator.with;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportdemo {

	//Globally setting the ExtentReport Instantiate BCZ Have to call in @Test method
	ExtentReports ER;
	
	@BeforeTest
	public void extent() {
		

		
		//path of the project
	String Location = System.getProperty("user.dir")+"\\ExtentRepors\\index.html";
	ExtentSparkReporter ESR = new ExtentSparkReporter(Location);
    //Test Name
	 ESR.config().setReportName("SPICEJET");
	 //TEST TAB NAME SET
	 ESR.config().setDocumentTitle("EXTENT REPORTER");
	 
	  ER = new ExtentReports(); //this has to be like this if you modify it wont work
	  
	 //Giving file location knowledge to the ER
	 ER.attachReporter(ESR);
	 //Giving the Tester Name
	 ER.setSystemInfo("Tester of This ExtentReports is = ", "Vishwas shinde");
		
	}
	
	
	

    @Test
	public void Test() throws InterruptedException {

		//monitor the results
		ER.createTest("InitialDemo for Lamda Test");
		
   Assignment a1=new Assignment();
		a1.Assignmentmethod();
		
		
		//Breaking the flow After Run
		ER.flush();
    
	}
	
	

	
}
	

