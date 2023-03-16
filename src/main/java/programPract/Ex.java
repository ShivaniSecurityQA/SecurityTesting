package programPract;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ex {
	WebDriver driver;
	public static void main(String[] args) {
		Ex obj = new Ex();
		obj.Login("https://www.facebook.com/","Saurabh","s");
		
	}
	public void Login(String url,String username,String pass) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(pass);
		driver.findElement(By.xpath("//button[@id='loginbutton']")).click();
		
	}
	

}
