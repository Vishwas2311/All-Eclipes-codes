package Test;

import org.testng.annotations.Test;

public class Enabled {
	@Test
	public void demo1() {
		System.out.println("browser started");
	}

	//Helping Attributes
	@Test(enabled= false)   //Hiding this method because of has error
	public void Secondtest1() {
	System.out.println(" you have dont execute me");
	
	}
	@Test(dependsOnMethods= {"demo1"})   //Helping Attributes
	public void dependent() {
	System.out.println("i am starting the testing");
	
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
