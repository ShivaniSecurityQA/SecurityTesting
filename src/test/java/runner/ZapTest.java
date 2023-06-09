package runner;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
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
//		public void test() throws ClientApiException {
//			WebDriver driver;
//			
//			ChromeOptions test =new ChromeOptions();
//			//FirefoxOptions fo = new FirefoxOptions();
//			//WebDriverManager.chromedriver();
//			//	driver= new ChromeDriver(coptions);
//				
//				//generating zap report
//				ZapUtility.zapReport();
//			test.setProxy(ZapUtility.proxy);
//			WebDriverManager.chromedriver();
//			//driver= new ChromeDriver(coptions);
//		}
	
	public void setUp() throws ClientApiException {

		ChromeOptions coptions =new ChromeOptions();
		EdgeOptions captions=new EdgeOptions();
		captions.addArguments("--remote-allow-origins=*");
		captions.addArguments("--ignore-certificate-errors");
		captions.setProxy(ZapUtility.proxy);
		
		WebDriverManager.edgedriver().setup();
		driver= new EdgeDriver(captions);
		//generating zap report
		//driver.get("https://owasp.org/www-project-juice-shop/");
		driver.get("https://juice-shop.herokuapp.com/#/login");
		//'or'1'='1';     ----useful for sql injection
		String ttl=driver.getTitle();
		System.out.println(ttl);
		
		ZapUtility.zapReport();
		
	}

}	


	
