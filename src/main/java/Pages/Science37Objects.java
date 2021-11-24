package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Science37Objects {
	
	WebDriver driver = null;
	
	By email_login = By.xpath("//input[starts-with(@name,'id-')]");
	
	By password_login = By.xpath("//input[@type='password']");
	
	By login_button = By.xpath("//button[@type='submit']");
	
	public Science37Objects(WebDriver driver) {
		
		this.driver = driver;
	}
	
	public void setEmail(String email) {
		
		driver.findElement(email_login).sendKeys(email);
		
	}
	
	public void setPassword(String password) {
		
	//	driver.findElement(password_login).click();
	//	driver.findElement(password_login).clear(); 
		driver.findElement(password_login).sendKeys(password);
		
	}
		
	public void clickLoginButton() {
		
		driver.findElement(login_button).click();
	}

}
