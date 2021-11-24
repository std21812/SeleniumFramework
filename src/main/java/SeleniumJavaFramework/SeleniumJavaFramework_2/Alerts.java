package SeleniumJavaFramework.SeleniumJavaFramework_2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alerts {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://nisum.smarthcm.com/ess/Account/Login.aspx?returnUrl=https://nisum.smarthcm.com/ess/default.aspx");
		driver.findElement(By.xpath("//input[@type='text'][@name='txtUserName']")).sendKeys("2232999");
		driver.findElement(By.xpath("//input[@type='password'][@name='txtPassword']")).sendKeys("22329999");
		driver.findElement(By.xpath("//input[@type='submit'][@name='btnImgSignIn']")).click();
		
		//alert
		
		driver.quit();
		
		
		
		
	}

}
