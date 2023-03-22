package runner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.zaproxy.clientapi.core.ClientApiException;

import commonUtilities.ZapUtility;
import io.github.bonigarcia.wdm.WebDriverManager;



public class ZapTest {
	
	WebDriver driver;
	
	public static void main(String[] args){
		ZapTest zt=new ZapTest();
		try {
			zt.setUp();
		} catch (ClientApiException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void setUp() throws ClientApiException {

		ChromeOptions coptions =new ChromeOptions();
		coptions.setProxy(ZapUtility.proxy);
		
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver(coptions);
		//generating zap report
		driver.get("https://www.google.in");
		ZapUtility.zapReport();
		
	}

}	


	
