package RelativeLocators;
import static org.openqa.selenium.support.locators.RelativeLocator.with;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RightRL {

	
@Test
public void RightReletive() {
	System.setProperty("webdriver.chrome.driver", "V:\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/angularpractice/");
	//Storing the radio button in a variable
	WebElement firstRadio=driver.findElement(By.id("inlineRadio1"));
	//Relative Xpath for the Radio button
	System.out.println(driver.findElement(with(By.tagName("label")).toRightOf(firstRadio)).getText());
	
	
	
	
	
	
}

}
