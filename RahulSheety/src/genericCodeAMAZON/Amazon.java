package genericCodeAMAZON;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Amazon {
public static void main(String[] args) throws InterruptedException {
	

System.setProperty("webdriver.chrome.driver", "V:\\\\chromedriver_win32\\\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));	
driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=58075519359&hvpone=&hvptwo=&hvadid=486462454211&hvpos=&hvnetw=g&hvrand=4012295641534483132&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9062111&hvtargid=kwd-64107830&hydadcr=14452_2154371&gclid=Cj0KCQiAmeKQBhDvARIsAHJ7mF4sDpxfhRIZ3lBlQlP7_Bcw9TMvlcgk1nId1vL1b3DfRS2AnCseqdEaAqCAEALw_wcB");
driver.findElement(By.xpath("//span[contains(text(),'Account & Lists')]")).click();
driver.findElement(By.cssSelector("input.a-input-text.a-span12.auth-autofocus.auth-required-field")).sendKeys("9130473742");
driver.findElement(By.id("continue")).click();
driver.findElement(By.id("ap_password")).sendKeys("suraj26867648");
Thread.sleep(1000);
driver.findElement(By.id("signInSubmit")).click();
driver.findElement(By.id("twotabsearchtextbox")).sendKeys("i phone");
driver.findElement(By.id("nav-search-submit-button")).click();
driver.findElement(By.xpath("//span[contains(text(),'Apple iPhone 12 (128GB) - Black')]")).click();
Thread.sleep(5000);driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));




//Select quantity= new Select(driver.findElement(By.id("quantity")));
//quantity.selectByIndex(1);



//Navigating to the child page.
//Window handling.
Set<String> windows =driver.getWindowHandles();
Iterator<String> it=windows.iterator();
String parent=it.next();
String child=it.next();
driver.switchTo().window(child);       //this si the IMP


//Explicit wait use to wait the dom for specific action
WebDriverWait wait= new WebDriverWait(driver,20);          
WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[id*='add-to-cart-button']")));
//ADD TO CART
driver.findElement(By.cssSelector("input[id*='add-to-cart-button']")).click();

}

}









