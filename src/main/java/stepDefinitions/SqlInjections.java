package stepDefinitions;

import java.util.List;

import commonUtilities.BasicUtility;
import cucumber.api.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import programPract.Ex;


public class SqlInjections {

      Ex exClass= new Ex(); 
      BasicUtility utility= new BasicUtility(); 
	
      
      @Given("User on the amazon Login page")
      public void user_on_the_amazon_login_page(io.cucumber.datatable.DataTable dataTable) {
    	  List<String> dataList = dataTable.asList(String.class);
    	  utility.Openurl(dataList.get(0));
      }

	
	@Given("he has entered {string} and {string} on {string} home page.")
	public void he_has_entered_and_on_home_page(String userName, String password, String titlePage) {
		exClass.Login(userName, password);
	}

	@Then("user {string} should not be able to login into the {string} dashboard page.")
	public void user_should_not_be_able_to_login_into_the_dashboard_page(String string, String string2) {
	   
	}


	@When("he clicks on {string} button")
	public void he_clicks_on_button(String string) {
	  
	}

	@Then("user Shishpal123 should not be able to login into the {string} dashboard page.")
	public void user_shishpal123_should_not_be_able_to_login_into_the_dashboard_page(String string) {
	   
	}

	@Given("user Shishpal is logged into amazon application")
	public void user_shishpal_is_logged_into_amazon_application() {
	  
	}

	@When("he navigates to the user profile page with an invalid user ID {int}")
	public void he_navigates_to_the_user_profile_page_with_an_invalid_user_id(Integer int1) {
	 
	   
	}

	@Then("error message User ID is not correct should be displayed on {string} page")
	public void error_message_user_id_is_not_correct_should_be_displayed_on_page(String string) {
	   
	}
}
