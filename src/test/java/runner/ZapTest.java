package runner;


import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.zaproxy.clientapi.core.ClientApiException;

import commonUtilities.ZapUtility;
import io.github.bonigarcia.wdm.WebDriverManager;



public class ZapTest {
	

		public void test() throws ClientApiException {
			WebDriver driver;
			
			ChromeOptions test =new ChromeOptions();
			//FirefoxOptions fo = new FirefoxOptions();
			//WebDriverManager.chromedriver();
			//	driver= new ChromeDriver(coptions);
				
				//generating zap report
				ZapUtility.zapReport();
			test.setProxy(ZapUtility.proxy);
			WebDriverManager.chromedriver();
			driver= new ChromeDriver(coptions);
		}

}	
	//WebDriverManager.chromedriver();
	//driver= new ChromeDriver(coptions);
	
	//generating zap report
	//ZapUtility.zapReport();
	
	
	
//    DesiredCapabilities capabilities = DesiredCapabilities.chrome();
//    capabilities.setCapability(CapabilityType.PROXY, ZapUtility.proxy);
//
//    // Launch Chrome browser
//    WebDriver driver = new ChromeDriver(capabilities);
//    driver.manage().window().maximize();
//	
//	


	
