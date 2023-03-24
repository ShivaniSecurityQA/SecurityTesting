package programPract;

import org.openqa.selenium.By;
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
	
Webdriver driver;
 BasicUtility utility=new BasicUtility();
	
	//@FindBy (xpath="//input[@id='email']")
    WebElement username = driver.findElement(By.xpath("//input[@id='email']"));
	//WebElement username;
	
//	@FindBy (css="#password")
//	WebElement password;
    WebElement pwd =  driver.findElement(By.cssSelector("#password"));
	 
    
//	@FindBy (xpath="//button[@id='loginButton']")
//	WebElement submtBtn;
    
    WebElement loginbtn = driver.findElement(By.xpath("//button[@id='loginButton']"));
    
	@FindBy (xpath="//img[@alt='Apple Juice (1000ml)']")
	WebElement vImage;
	
	@FindBy (xpath="//span[text()='Dismiss']")
	WebElement dismissBtn;
	
	public HomePage(WebDriver driver) {
	   driver=driver;
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
		pwd.sendKeys(pass);
	}
	
	public void clickSubmitBtn()
	{
		loginbtn.click();
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
		this.driver= new EdgeDriver(captions);
		//generating zap report
		//driver.get("https://owasp.org/www-project-juice-shop/");
		this.driver.get("https://juice-shop.herokuapp.com/#/login");
		//'or'1'='1';     ----useful for sql injection
		String ttl=driver.getTitle();
		System.out.println(ttl);
		
		ZapUtility.zapReport();
	}


	}}
