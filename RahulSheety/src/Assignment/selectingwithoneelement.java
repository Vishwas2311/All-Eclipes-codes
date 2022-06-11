package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectingwithoneelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		System.setProperty("webdriver.chrome.driver", "V:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://qaclickacademy.com/practice.php");
		driver.findElement(By.xpath("//div[@id='checkbox-example']/fieldset/label[2]/input")).click();
		
		//taking visible text of the check Box
		String option = driver.findElement(By.xpath("//div[@id='checkbox-example']/fieldset/label[2]")).getText();
		
		//dropdown handling by visible text
		WebElement dropdown=driver.findElement(By.id("dropdown-class-example"));
		Select nodropdown=new Select(dropdown);
		nodropdown.selectByVisibleText(option);
		
		//sending the visible text to the Box
		driver.findElement(By.name("enter-name")).sendKeys(option);
		driver.findElement(By.id("alertbtn")).click();
		
		//Alert handling and matching with visible text
		String Alert=driver.switchTo().alert().getText();
		
		
		if(Alert.contains(Alert)) {
			System.out.println("got the same alert for clickable element");
		}else {
			System.out.println("you did wrong coding");
		}
		
	}

}
