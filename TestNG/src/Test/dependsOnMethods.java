package Test;

import org.testng.annotations.Test;

public class dependsOnMethods {

	//this will help to set the priority of the methods
	
	@Test
	public void demo1() {
		System.out.println("browser started");
	}

	//helping attributes
	@Test(dependsOnMethods= {"demo1","bike","car"})
	public void Secondtest1() {
	System.out.println("i am dependent on all methods i will execute last");
	
	}
	@Test(dependsOnMethods= {"demo1"})
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
