package driverSetup;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class driver {

	
public static void main(String[] args) {
	
	

		
		System.setProperty("webdriver.chrome.driver", "V:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zomato.com/");
		
		//Pixels depend on you laptop setting 
		Dimension  dia = new Dimension(1000,900);
		driver.manage().window().setSize(dia);
		
		System.out.println(driver.manage().window().getSize());
		
		
		
		
	}
	
	
	
	
}
