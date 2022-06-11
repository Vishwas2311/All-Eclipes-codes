package TestClasses;

public class Flipkart {
public static void main(String[] args) {
	
	

	System.setProperty("webdriver.chrome.driver", "V:\\Self study\\chromedriver_win32\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.flipkart.com/");
	
	
	
	
	
	
	
}
}
