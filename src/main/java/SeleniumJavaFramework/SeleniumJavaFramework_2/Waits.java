package SeleniumJavaFramework.SeleniumJavaFramework_2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Waits {
	
	public static void main(String[] args) throws InterruptedException {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
			
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://mynisum.okta.com/");
		driver.findElement(By.name("username"));
		
		//Explicit wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement myLinkHelp = wait.until(ExpectedConditions.elementToBeClickable(By.partialLinkText("Help")));
		myLinkHelp.click();
		WebElement myLinkForgotPassword = wait.until(ExpectedConditions.elementToBeClickable(By.partialLinkText("Forgot Password?")));
		myLinkForgotPassword.click();
		
		//Fluent wait
		Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(10))
				.ignoring(java.util.NoSuchElementException.class);
		
		fluentWait.until(ExpectedConditions.elementToBeClickable(By.name("userName")));
		
		Thread.sleep(3000);
		driver.close();
		driver.quit();
		
	}

}
