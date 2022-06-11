package Test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Loan {

	
	@Parameters({ "URL" })
	@Test
	public void demo(String url) {
		System.out.println("Testing is started");
		System.out.println(url);
	}
	
	@Test(groups= {"Smoke"})
	public void Secondtest() {
	System.out.println("Loan Department");
	
	}
	
	
	
	
	
	
	
	
	
	
}
