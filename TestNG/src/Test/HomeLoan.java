package Test;

import java.util.Objects;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class HomeLoan {

	@Parameters({ "URL","API Key/Username"})   //Driving Data From XML
	@Test
	public void webLoginHome(String url, String userid) {  //this will help to navigate the URL before Method.
		System.out.println("Homeloan Web Login is sucessful");
		System.out.println(url);
		System.out.println(userid);
		//selenium
	}
	@Test
	public void mobileLoginHome() {
	System.out.println("Homeloan Mobile Login is successful");
	//Appium
	}
	
	@Test(dataProvider= "setidpass") //Data Provide
	public void ApiLoginHome(String id,String pass) {
		System.out.println("Homeloan Api is created ");
		//Rest Api
		System.out.println(id);
		System.out.println(pass);
	}
	
	@DataProvider    //Data Provider with multi Diamentionsal Array
	public Object[][] setidpass() {
		Object[][] multiarr= new Object[3][2];
		//1] combination of id and pass for loan will be executed
		multiarr[0][0]="Vishwas";
		multiarr[0][1]="VBS@123";
		
		multiarr[1][0]="Suraj";
		multiarr[1][1]="sur@123";
		
		multiarr[2][0]="shiva";
		multiarr[2][1]="shiv@123";
		return multiarr;
	}
	
	
	
}
