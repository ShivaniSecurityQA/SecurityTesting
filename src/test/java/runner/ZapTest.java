package runner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ZapTest {
	WebDriver driver;
	ChromeOptions coptions= new ChromeOptions();
	coptions.setProxy(ZapUtility.proxy);
	
	WebDriverManager.chromedriver().setup();
	driver= new ChromeDriver(coptions);
	
	//generating zap report
	ZapUtility.zapReport();
	
	
	
//    DesiredCapabilities capabilities = DesiredCapabilities.chrome();
//    capabilities.setCapability(CapabilityType.PROXY, ZapUtility.proxy);
//
//    // Launch Chrome browser
//    WebDriver driver = new ChromeDriver(capabilities);
//    driver.manage().window().maximize();
//	
//	

}
