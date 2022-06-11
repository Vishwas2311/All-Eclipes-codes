package StepDefination;

import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefination {

	@Given("^User is on Flipkart login page$")
    public void user_is_on_flipkart_login_page() throws Throwable {
           System.out.println("Flipkart Login page loaded");
    }
	
	@When("^User signup into application using below data$")
    public void user_login_into_application_using_below_data(DataTable data) throws Throwable {
       List<List <String>> obj= data.asLists(); //this is because we are using two times get method
      
       System.out.println(obj.get(0).get(0));
       System.out.println(obj.get(0).get(1));
       System.out.println(obj.get(0).get(2));
       System.out.println(obj.get(0).get(3));
       System.out.println(obj.get(0).get(4));
       System.out.println(obj.get(0).get(5));
		
    }
    @Then("^Home page is populated$")
    public void home_page_is_populated() throws Throwable {
       System.out.println("user logged in successfully");
    }
    
    @When("^User login into application using \"([^\"]*)\" and passward \"([^\"]*)\"$")
    public void user_login_into_application_using_something_and_passward_something(String strArg1, String strArg2) throws Throwable {
       //dynamic values with different pass & id
    	System.out.println(strArg1 + strArg2);
    }

    @And("^search box is displayed \"([^\"]*)\"$")
    public void search_box_is_displayed_something(String strArg1) throws Throwable {
        System.out.println("cards are Displayed = " +strArg1);
  
    }

    @When("^User signup into application using userid (.+) and pass (.+)$")
    public void user_signup_into_application_using_userid_and_pass(String userid, String password) throws Throwable {
      System.out.println(userid + password);
    }
    
    
    //Background:
    
    @Given("^check browser is launched$")
    public void check_browser_is_launched() throws Throwable {
        System.out.println("Browser is launched");
    }

    @When("^browser is launched$")
    public void browser_is_launched() throws Throwable {
       System.out.println("browser is launched");
    }

    @Then("^check navigated to website$")
    public void check_navigated_to_website() throws Throwable {
        System.out.println("navigated to the WEBSITE");
    }

}
