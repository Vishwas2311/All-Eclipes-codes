package TestClasses;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import UtilityClasses.UtilityClasses;

public class Listeners extends TestListenerAdapter {

	public WebDriver driver;
	
	
	@Override
	public void onTestSuccess(ITestResult result) {
		    // not implemented
		
		System.out.println("test Passed");
		  }
	@Override
	public void onTestFailure(ITestResult result) {
		    // not implemented
		  try {
			UtilityClasses.getscreenShotAs(driver, "successfull");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  System.out.println("i failed executed listener pass code and check screen shot "+result.getName());
		  }

	@Override
	public void onTestSkipped(ITestResult result) {
		    // not implemented
		  }
	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		    // not implemented
		  }

	@Override	
	public void onTestFailedWithTimeout(ITestResult result) {
		    onTestFailure(result);
		  }
	@Override
	public void onStart(ITestContext context) {
		    // not implemented
		  }

	@Override
	public void onFinish(ITestContext context) {
		    // not implemented
		  }
	
}
