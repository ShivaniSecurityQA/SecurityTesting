package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SqlInjections {

	@Given("User <Name> on the {string} login page")
	public void user_name_on_the_login_page(String string, io.cucumber.datatable.DataTable dataTable) {
	   
	}

	@Given("he has entered Shishpal123 and Shishpal@{int} on {string} home page.")
	public void he_has_entered_shishpal123_and_shishpal_on_home_page(Integer int1, String string) {
	   
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
