package runner;


import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;




@RunWith(Cucumber.class)
@CucumberOptions(
		//features = "C:\\Features\\SQLInjection.feature"
		features = "src/main/java/featureFiles/"
		//features = "C:\\Users\\Z004E9RJ\\eclipse-workspace\\SecurityTesting\\src\\main\\java\\featureFiles\\SQLInjection.feature"
		,glue = {"stepDefinitions"}
		//,dryRun = true
		,tags =  "@ID"
		,plugin = {"pretty","html:target/cucumber-results"},
		monochrome = true
		)

public class TestRunner extends  AbstractTestNGCucumberTests {
	
}	