package CucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/Feature",
		glue="StepDefination",stepNotifications= true,tags="@MobileTest")



/*

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/Feature",
		glue="StepDefination",stepNotifications= true,tags ="not @SmokeTest")*/


public class BeforeandAfterHooks {

	
}
