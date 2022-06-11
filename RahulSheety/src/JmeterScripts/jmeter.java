package JmeterScripts;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class jmeter {
	
	@Test
	public void Selenum() {
		

		System.setProperty("webdriver.chrome.driver", "V:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.getTitle();
	}

}
