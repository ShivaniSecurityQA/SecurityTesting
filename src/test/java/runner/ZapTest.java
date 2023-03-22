package runner;

<<<<<<< HEAD
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
=======


import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeOptions;

>>>>>>> cbb72f50e525df6c4ec31fc3127ff55aacd2de0a
import org.zaproxy.clientapi.core.ClientApiException;

import commonUtilities.ZapUtility;
import io.github.bonigarcia.wdm.WebDriverManager;



public class ZapTest {
	
<<<<<<< HEAD
	WebDriver driver;
	
	public static void main(String[] args){
		ZapTest zt=new ZapTest();
		try {
			zt.setUp();
		} catch (ClientApiException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
=======

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
			//driver= new ChromeDriver(coptions);
>>>>>>> cbb72f50e525df6c4ec31fc3127ff55aacd2de0a
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


	
