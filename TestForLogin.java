package webPageTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTestCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\SelReq\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com");
		
		// Username
		 WebElement username=driver.findElement(By.id("user-name"));
		 if(username.isDisplayed() && username.isEnabled())
		 {
			 username.sendKeys("standard_user");
			 
		 }
		//pasword 
		 WebElement password=driver.findElement(By.id("password"));
		 if(password.isDisplayed() && password.isEnabled())
		 {
			 password.sendKeys("secret_sauce");
			 
		 }
		 //login-button
		driver.findElement(By.id("login-button")).click();
		
		
	}

}
 