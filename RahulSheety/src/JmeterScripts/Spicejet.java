package JmeterScripts;

import java.time.Duration;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import net.jodah.failsafe.internal.util.Assert;

public class Spicejet {

	@Test
	public static void Jmeter() throws InterruptedException {
		

					System.setProperty("webdriver.chrome.driver", "V:\\chromedriver_win32\\chromedriver.exe");
					WebDriver driver =new ChromeDriver();
					driver.get("https://www.spicejet.com/");
					//driver.manage().window().maximize();
					Thread.sleep(1000);
					//System.out.println(driver.switchTo().alert().getText());               this will handled BY JAVA script
					//driver.switchTo().alert().accept();                                    this will help to allow the alerts are present the window
					driver.findElement(By.xpath("//div[text()='1 Adult']")).click();
					Thread.sleep(1000);
					
					
					int i=1;
					while (i<9)
					{
						driver.findElement(By.xpath("//div[@data-testid='Adult-testID-plus-one-cta']")).click();
						i++;
					}
					driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep']/parent::div)[5]")).click();
					System.out.println(driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep']/parent::div)[5]")).getText());
		 
					driver.findElement(By.xpath("//div[contains(text(),'From')]")).click();
					Thread.sleep(1000);
					driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-b5h31w r-95jzfe']) //div[text()='Bengaluru']")).click();       //this method is accepted by some off the experienced client.
			                                                                                                                        //they are assuming that this QA AUTOMATION TESTER id Quite Experienced.//driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-b5h31w r-95jzfe']) //div[contains(text(),'SAG')]")).click();   // Xpath is felt to the pool request that this QA AUTOMATION is very experienced		  
					
					//driver.findElement(By.xpath("//div[contains(text(),'BLR')]")).click();                                                  //some client dont wat this type of Xpath ----firstly want us to select the whole window then we need to select that CITY with CODE.
					driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-14lw9ot r-11u4nky r-z2wwpe r-1phboty r-rs99b7 r-1loqt21 r-13awgt0 r-ymttw5 r-tju18j r-5njf8e r-1otgn73']) [2]")).click();
					Thread.sleep(1000);
					driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-14lw9ot r-z2wwpe r-1rjd0u6 r-1g94qm0 r-u8s1d r-8fdsdq']) //div[text()='Shirdi']")).click();                                                  
				
					//for calender we need to select as per the date also
					driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-14lw9ot r-11u4nky r-rs99b7 r-6koalj r-eqz5dr r-1pi2tsx r-pm9dpa r-1knelpx r-13qz1uu']")).click();
					Thread.sleep(2000);
					driver.findElement(By.xpath("//div[contains(@class,'css-1dbjc4n r-1awozwy r-19m6qjp r-156aje7 r-y47klf r-1phboty r-1d6rzhh r-1pi2tsx r-1777fci r-13qz1uu')]")).click();
				     
					//This is STUDENTS RADIO BUTTON click Checker,with "is Selected " method.
					driver.findElement(By.xpath("(//div[@class='css-1dbjc4n'])[44]")).click();
					Thread.sleep(5000);
					System.out.println(driver.findElements(By.xpath("circle[cx='9']")).size());      //number of check BOX available in the DOM
					
					
					driver.findElement(By.xpath("((//div[@class='css-1dbjc4n']) [54]/child::div) [1]")).click();
					Thread.sleep(5000);
					
					//this is agreed CHECK BOX.
					driver.findElement(By.xpath("((//div[@class='css-1dbjc4n r-1awozwy r-1loqt21 r-18u37iz r-1otgn73']) [2]/child::div) [1]")).click();
				   //System.out.println(driver.findElement(By.xpath("((//div[@class='css-1dbjc4n r-1awozwy r-1loqt21 r-18u37iz r-1otgn73']) [2]/child::div) [1]")).isSelected());
					
					
					driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
					driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-13awgt0 r-18u37iz']/child::div[@class='css-1dbjc4n r-obd0qt r-1ap4h1l'])/child::div")).click();
					Thread.sleep(2000);
					driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-1awozwy r-1xfd6ze r-1loqt21 r-18u37iz r-1777fci r-1w50u8q r-ah5dr5 r-1otgn73']")).click();
					System.out.println(driver.findElements(By.xpath("div[class='css-1dbjc4n r-zso239']")).size());    //this is the Method to get the SIZE of check boxes present on the DOM
					
			    

				}

			


				
			}

		



