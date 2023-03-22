package programPract;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ex {
	WebDriver driver;
	public static void main(String[] args) {
		
	}
		
	public void Login(String username,String pass) {
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(pass);
		driver.findElement(By.xpath("//button[@id='loginbutton']")).click();
		
	}	

}
