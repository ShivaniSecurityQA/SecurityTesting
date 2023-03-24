package programPract;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.zaproxy.clientapi.core.ClientApiException;

import commonUtilities.BasicUtility;
import commonUtilities.ZapUtility;
import io.github.bonigarcia.wdm.WebDriverManager;
public class HomePage {
	
 WebDriver driver;
 BasicUtility utility=new BasicUtility();
	
	@FindBy (xpath="//input[@id='email']")
	WebElement username;
	
	@FindBy (css="#password")
	WebElement password;
	
	@FindBy (xpath="//button[@id='loginButton']")
	WebElement submtBtn;
	
	@FindBy (xpath="//img[@alt='Apple Juice (1000ml)']")
	WebElement vImage;
	
	@FindBy (xpath="//span[text()='Dismiss']")
	WebElement dismissBtn;
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
}
	
//	public void login(String url,String uname,String paswd) {
//		driver.get(url);
//		username.sendKeys(uname);
//		password.sendKeys(paswd);
//		submtBtn.click();
//		
//	}
	
	public void enterUserName(String uName)
	{
		username.sendKeys(uName);
	}
	
	public void enterPassword(String pass)
	{
		password.sendKeys(pass);
	}
	
	public void clickSubmitBtn()
	{
		submtBtn.click();
	}
	
	public void verifyLogin() {
		utility.waitForVisiblityByWebelemnt(driver, 10, vImage);
		
	}
	
	public void clickDismissBtn()
	{
		dismissBtn.click();
	}
	
	public void loginZap(String url ) throws ClientApiException {
		
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
