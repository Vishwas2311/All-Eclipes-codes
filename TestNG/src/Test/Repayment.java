package Test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Repayment {

	
	@BeforeClass
	public void beforeclass() {
		System.out.println("i am the first before all  method in the Repayment class");
	}
	
	
	@AfterClass
	public void Afterclass() {
		System.out.println("i am the last after all method in the Repayment class");
	}
	
	@Test(groups= {"Smoke"})
	public void method() {
		System.out.println("repayment of suzuki car has been done");
	}
	
	@Test
	public void method1() {
		System.out.println("repayment of homeloan has been done");
	}
	@Test
	public void method2() {
		System.out.println("repayment of TATA car has been done");
	}


}
