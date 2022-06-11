package lambdatest; //<your package name>

import static org.openqa.selenium.support.locators.RelativeLocator.with;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

class TestClass1 implements Runnable {
public void run() {
    Hashtable<String, String> capsHashtable = new Hashtable<String, String>();
    capsHashtable.put("browserName", "Chrome");
    capsHashtable.put("version", "86.0");
    capsHashtable.put("platform", "Windows 10");
    capsHashtable.put("resolution", "1920x1080");
    capsHashtable.put("build", "Checking-lambdatest-build-1");
    capsHashtable.put("name", "Test 1");
    Lambdatest r1 = new Lambdatest();
    r1.executeTest(capsHashtable);
}
}
class TestClass2 implements Runnable {
  public void run() {
      Hashtable<String, String> capsHashtable = new Hashtable<String, String>();
      capsHashtable.put("browserName", "MicrosoftEdge");
      capsHashtable.put("version", "86.0");
      capsHashtable.put("platform", "macOS Sierra");
      capsHashtable.put("resolution", "1920x1080");
      capsHashtable.put("build", "Checking-lambdatest-build-1");
      capsHashtable.put("name", "Test 2");
      Lambdatest r2 = new Lambdatest();
      r2.executeTest(capsHashtable);
  }
}
public class Lambdatest {
  public static final String USERNAME = "vishwasshinde745";
  public static final String AUTOMATE_KEY = "VEb7pqs4MGFfn4M7V55baJkS17oh0QcKEFXrJAF3atf9xuTto7";
  public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub.lambdatest.com/wd/hub";
  public static void main(String[] args) throws Exception {
    Thread object1 = new Thread(new TestClass1());
    object1.start();
    Thread object2 = new Thread(new TestClass2());
    object2.start();
    Thread object3 = new Thread(new TestClass3());
    object3.start();
  }
  public void executeTest(Hashtable < String, String > capsHashtable) {
    String key;
    DesiredCapabilities caps = new DesiredCapabilities();
    // Iterate over the hashtable and set the capabilities
    Set < String > keys = capsHashtable.keySet();
    Iterator < String > itr = keys.iterator();
    while (itr.hasNext()) {
      key = itr.next();
      caps.setCapability(key, capsHashtable.get(key));
    }
    WebDriver driver;
    try {
      driver = new RemoteWebDriver(new URL(URL), caps);
      
      driver.manage().window().maximize();
  	driver.get("https://www.lambdatest.com/");
  	
  	WebDriverWait explicit= new WebDriverWait(driver, 10);
  	List<WebElement> wait = explicit.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//a[.='See All Integrations']")));
  	String Url=wait.get(0).getAttribute("href");
  	System.out.println(Url);
  	
  	
  	JavascriptExecutor java =(JavascriptExecutor)driver;
  	java.executeScript("window.scrollBy(0,4000)");
  	
  	driver.findElement(By.xpath("//a[.='See All Integrations']")).sendKeys(Keys.CONTROL,Keys.ENTER);
  	
  	Set<String> windows=driver.getWindowHandles();
  	Iterator <String> it= windows.iterator();
  	String parent=it.next();
  	String child =it.next();
  	driver.switchTo().window(child);
  	String newwindow = driver.getCurrentUrl();
  	
  	Assert.assertEquals(Url, newwindow);
  	
  	
  	JavascriptExecutor scroll=(JavascriptExecutor)driver;
  	scroll.executeScript("window.scrollBy(0,6000)");
  	
  	List<WebElement> Actual=driver.findElements(By.xpath("//div/div[4]/a"));
            Actual.get(2).click();
            String lambda=driver.getTitle();
            
            
      String Expected="Running Automation Tests Using TestingWhiz LambdaTest | LambdaTest";
  	Assert.assertEquals(Expected, lambda);
  	driver.close();
  	
  	driver.switchTo().window(parent);
  	
  	int count=0;
  	while(it.hasNext()) {
  		
  		int url=  Integer.parseInt(it.next());
  		count=count+url;
  	}
  	System.out.println(count);
  	
  	driver.navigate().to("https://www.lambdatest.com/blog/");
  	Thread.sleep(1000);
  	driver.findElement(By.xpath("//a[text()='Community'] [1]")).click();
  	String currenturl=driver.getCurrentUrl();
  	
  	String Expected1 ="https://community.lambdatest.com/";
  	
  	Assert.assertEquals(currenturl, Expected1);
      driver.close();
    } catch (Exception e) {
      System.out.println(e.getMessage());
     
    }
  }
}