package Test;

import org.testng.annotations.Test;

public class timeout {

	// explicitly waiting for response to complete the test
	//for 4 Seconds not showing any error
	@Test(timeOut=4000)
	public void dependent() {
	System.out.println("i am waiting for 4 second to execute the Test");
	
	}
	
	
	@Test
	public void bike() {
		System.out.println("bike also Started");
	}
	  
	@Test
	public void car() {
	System.out.println("Car started");
	
	}
}
