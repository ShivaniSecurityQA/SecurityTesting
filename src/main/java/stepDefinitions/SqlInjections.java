package stepDefinitions;

import java.util.List;

import org.openqa.selenium.WebDriver;

import commonUtilities.BasicUtility;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import programPract.Ex;
import programPract.HomePage;


public class SqlInjections {

	//  Ex exClass= new Ex(); 
	WebDriver driver;
	BasicUtility utility= new BasicUtility(); 
	HomePage hp= new HomePage(driver);

//      @Given("User on the amazon Login page")
//      public void user_on_the_amazon_login_page(DataTable dataTable) {
//    	  List<String> dataList = dataTable.asList(String.class);
//    	  utility.Openurl(dataList.get(0));
//      }

	
	@Given("he has entered {string} and {string} on {string} home page.")
	public void he_has_entered_and_on_home_page(String userName, String password, String titlePage) {
		hp.enterUserName(userName);
		hp.enterPassword(password);
	}

	@Given("User on the juice-shop Login page")
	public void user_on_the_juice_shop_login_page(io.cucumber.datatable.DataTable dataTable) {
		 List<String> dataList = dataTable.asList(String.class);
   	  utility.Openurl(dataList.get(0));
	}
	
	@When("he clicks on {string} button")
	public void he_clicks_on_button(String string) {
	    hp.clickSubmitBtn();
	}
	
	@Given("he has entered ''or'{int}'='{int}';' and {string} on {string} login page.")
	public void he_has_entered_or_and_on_login_page(Integer int1, Integer int2, String string, String string2) {
	    
	}

	@Then("user ''or'{int}'='{int}';' should be able to login into the {string} dashboard page.")
	public void user_or_should_be_able_to_login_into_the_dashboard_page(Integer int1, Integer int2, String string) {
	    
	}

	@Then("user {string} is logged into juice-shop application")
	public void user_is_logged_into_juice_shop_application(String string) {
	    hp.verifyLogin();
	}

	@When("he navigates to the user profile page with an invalid  {string}")
	public void he_navigates_to_the_user_profile_page_with_an_invalid(String string) {
	  
	}

	@Then("error message {string} should be displayed on {string} page")
	public void error_message_should_be_displayed_on_page(String string, String string2) {
	   
	}

}
