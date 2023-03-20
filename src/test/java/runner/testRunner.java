package runner;

import org.junit.runner.RunWith;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@RunWith(Cucumber.class)

@CucumberOptions(
		features = "src/com/aires/features/"
		,glue = {"stepDefinitions"}
		//,dryRun = true
		//,tags = {"@SmokeTest, @Regression"}
		,tags = {"@me"}
	//	,tags = (CoreConstants.TAG_VALUE)
		,plugin = { "com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:", "junit:target/cucumber-results.xml", "html:target/cucumber-results", "json:target/cucumber-results.json"},
		monochrome = true
		)

public class testRunner {
	}
