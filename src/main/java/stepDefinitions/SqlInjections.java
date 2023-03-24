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
import programPract.XssZap;


public class SqlInjections {

	//  Ex exClass= new Ex(); 
	WebDriver driver;
	BasicUtility utility= new BasicUtility(); 
	//HomePage hp= new HomePage(driver);
	XssZap zp = new XssZap();
	
	
//      @Given("User on the amazon Login page")
//      public void user_on_the_amazon_login_page(DataTable dataTable) {
//    	  List<String> dataList = dataTable.asList(String.class);
//    	  utility.Openurl(dataList.get(0));
//      }

	
	@Given("User on the juice-shop Login page")
	public void user_on_the_juice_shop_login_page(io.cucumber.datatable.DataTable dataTable) {
		 List<String> dataList = dataTable.asList(String.class);
   	 zp.setUp(dataList.get(0));
	}
	
	
}
