package CucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/Feature",
		glue="StepDefination",stepNotifications= true,tags="@MobileTest",
		plugin= {"pretty","html:target/cucumber.html","json:target/cucumber.json","junit:target/cukin.xml"
		})
// plugin = is use to generate the test reports and that can be used for integrating jenkins

public class ReportsHtmlJsonJunit {

	
}
