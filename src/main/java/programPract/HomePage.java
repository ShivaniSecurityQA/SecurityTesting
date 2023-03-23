package programPract;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commonUtilities.BasicUtility;
public class HomePage {
	
 WebDriver driver;
 BasicUtility utility=new BasicUtility();
	
	@FindBy (xpath="//input[@id='email']")
	WebElement username;
	
	@FindBy (xpath="//input[@id='password']")
	WebElement password;
	
	@FindBy (xpath="//button[@id='loginbutton']")
	WebElement submtBtn;
	
	@FindBy (xpath="//img[@alt='Apple Juice (1000ml)']")
	WebElement vImage;
	
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
	


	}
