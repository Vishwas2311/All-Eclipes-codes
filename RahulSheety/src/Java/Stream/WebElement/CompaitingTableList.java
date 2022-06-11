package Java.Stream.WebElement;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CompaitingTableList {
	@Test
public static void Compairing() {
	
	System.setProperty("webdriver.chrome.driver", "V:\\\\chromedriver_win32\\\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
	
	//click to get sorted list
	driver.findElement(By.xpath("//tr/th[1]")).click();
	
	//capturing all element into WebElement
	//this  will Store elements not their TEXT
	List<WebElement> list=driver.findElements(By.xpath("//tbody/tr/td[1]"));
	
	
	//in STREAM is object which is use to support various method which can be pipelined 
	//Original List with Stream
	List<String> Originallist=list.stream().map(s->s.getText()).collect(Collectors.toList());
	
	//Sorted List with Stream
	List<String> Sorted=Originallist.stream().sorted().collect(Collectors.toList());
	
	//Compare Stream and String List with Assert
	Assert.assertEquals(Originallist, Sorted);
	
	
	
	
	
	
}
}
