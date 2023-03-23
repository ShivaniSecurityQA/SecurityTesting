package programPract;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class HomePage {
	
 WebDriver driver;
	
	@FindBy (xpath="//input[@id='email']")
	WebElement username;
	
	@FindBy (xpath="//input[@id='password']")
	WebElement password;
	
	@FindBy (xpath="//button[@id='loginbutton']")
	WebElement submtBtn;
	
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
	


	}
