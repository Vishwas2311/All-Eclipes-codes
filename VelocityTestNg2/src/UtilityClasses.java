import java.time.Duration;

import org.testng.annotations.Test;

public class UtilityClasses {
	
	@Test
	public void implicitWait() {
	WebDriver driver;

	public WebElement explicitwait(WebDriver driver, String BYClass) {
		
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
	WebElement element1=wait.until(ExpectedConditions.visibilityOf((WebElement) By.xpath("BYClass")));
	return element1;
	}

	}
	
}
