package commonUtilities;

	import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

	public class BasicUtility {
		WebDriver driver = null;
	   public static BasicUtility bUtil = new BasicUtility();

		public WebDriver startUp(String browserName,String url) {
		 String path = System.getProperty("user.dir");
		 System.out.println("project path :"+path);
		  
		 if (browserName.equalsIgnoreCase("Chrome")) {
		 System.setProperty("webdriver.chrome.driver",path +"\\drivers\\chromedriver.exe");
		  driver = new ChromeDriver();
		 
		 }else if (browserName.equalsIgnoreCase("FF")) {
			 System.setProperty("webdriver.gecko.driver","F:\\saurabh automation\\Saurabh_selenium\\drivers\\geckodriver.exe");
			  driver = new FirefoxDriver();
			
		 }else if (browserName.equalsIgnoreCase("edge")) {
			 System.setProperty("webdriver.edge.driver","F:\\saurabh automation\\Saurabh_selenium\\drivers\\msedgedriver.exe");
			 driver = new EdgeDriver();
			
		 }else {System.out.println("browserName");
			 
		 } driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.manage().window().maximize();
//		  driver.manage().window().minimize();
  // driver.manage().window().setSize(new Dimension 600,800);
		 driver.get(url);
		  return driver;
		 
		} 
		
		public void teardown () {
			driver.close();
		    driver.quit();		
		}
		
		public void waitForVisiblityByWebelemnt(WebDriver driver ,int time ,WebElement ele) {
			WebDriverWait wt = new WebDriverWait(driver,Duration.ofSeconds(time));
			wt.until(ExpectedConditions.visibilityOf(ele));
			
		} public void waitForVisibilityByPara(WebDriver driver, int time ,By obj) {
			WebDriverWait wt = new WebDriverWait(driver,Duration.ofSeconds(time));
			wt.until(ExpectedConditions.visibilityOfElementLocated(obj));
			
		} public void waitForUrlContains(WebDriver driver , int time ,String str) {
			WebDriverWait wt = new WebDriverWait(driver,Duration.ofSeconds(time));
			wt.until(ExpectedConditions.urlContains(str));
			
		}public void waitForVisibilityByLocator(WebDriver driver ,int time ,String type ,String locator) {
			WebDriverWait wt = new WebDriverWait(driver,Duration.ofSeconds(time));
			switch (type) {
			case "xpath": 
				wt.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(locator))));
			    break;
			case "css" :
				wt.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector(locator))));
				break;
			case "id" :
				wt.until(ExpectedConditions.visibilityOf(driver.findElement(By.id(locator))));
				break;
			case "linktext"	:
				wt.until(ExpectedConditions.visibilityOf(driver.findElement(By.linkText(locator))));
				break;
			case "partiallinktest"	:
				wt.until(ExpectedConditions.visibilityOf(driver.findElement(By.partialLinkText(locator))));
				break;
			case "classname" :
				wt.until(ExpectedConditions.visibilityOf(driver.findElement(By.className(locator))));
				break;
			case "name":
				wt.until(ExpectedConditions.visibilityOf(driver.findElement(By.name(locator))));
				break;
			case "tagname":
				wt.until(ExpectedConditions.visibilityOf(driver.findElement(By.tagName(locator))));
				break;
					
			} 
			
				
			}
						
		public void Openurl(String list) {
			WebDriverManager.edgedriver().setup();
			WebDriver driver=new EdgeDriver();
			driver.get(list);
			driver.manage().window().maximize();
		}
		
}
