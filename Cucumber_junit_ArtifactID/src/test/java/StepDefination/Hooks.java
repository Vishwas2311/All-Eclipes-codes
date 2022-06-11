package StepDefination;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

	//hooks are used to run Before & After the all senarios OR with specific senarios also
	
	@Before("@MobileTest")
	public void mobilelaunching() {
		System.out.println("i am executing before mobile Test only");
		
	}
	
	@After("@MobileTest")
	public void mobiletestending() {
		System.out.println("i am executing after mobile Test only");
		
	}
	
	
	
	
	
	
}
