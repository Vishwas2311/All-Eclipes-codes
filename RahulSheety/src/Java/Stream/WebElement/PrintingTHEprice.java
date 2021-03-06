package Java.Stream.WebElement;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PrintingTHEprice {
@Test
public void getprice() {
	
	System.setProperty("webdriver.chrome.driver", "V:\\\\chromedriver_win32\\\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
	
	//storing list in Web Element
	List<WebElement> list=driver.findElements(By.xpath("//tbody/tr/td[1]"));
	
	List<String> Price2;
	do {
		//added foe get list of every refreshed elements on DOM.after clicking NEXT 
		List<WebElement> Rows=driver.findElements(By.xpath("//tbody/tr/td[1]"));
		
	//converting Web Elements in to String
	//filter the name
	//get price of the that element - > creating method.
	 Price2=Rows.stream().filter(s->s.getText().contains("Carrot")).map(s->getprice(s)).collect(Collectors.toList());
	//printing price
	Price2.forEach(s->System.out.println(s));
	
	//if we don't find any text them move to the next page
	if(Price2.size()<1){
	
	driver.findElement(By.xpath("//div/ul/li[7]")).click();
	}
}while(Price2.size()<1);
}


private static String getprice(WebElement s) {
	// TODO Auto-generated method stub
	String Price=s.findElement(By.xpath("following-sibling::td[1]")).getText();
	return Price;






}	}

