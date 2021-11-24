package SeleniumJavaFramework.SeleniumJavaFramework_2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Elements {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(1));
		driver.manage().timeouts().scriptTimeout(Duration.ofMinutes(2));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		
		driver.get("https://mynisum.okta.com/");
		Thread.sleep(2000);
	//	String originalWindow = driver.getWindowHandle();
	//	driver.navigate().to("https://mynisum.okta.com/");
		
	/*	driver.findElement(By.name("username")).sendKeys("saqkhan@nisum.com");
		WebElement usernameEnter = driver.findElement(By.name("username"));
		usernameEnter.sendKeys("saqkhan@nisum.com", Keys.ENTER);
		WebElement passwordEnter = driver.findElement(By.name("password"));
		passwordEnter.sendKeys("123456", Keys.ENTER);
	*/
		
	/*	driver.navigate().to("https://trytestingthis.netlify.app/");
		List<WebElement> options = driver.findElements(By.name("Optionwithcheck[]"));
		
		for (WebElement element : options) 
		{
			System.out.println(element.getText());
		}
	*/
		driver.navigate().to("https://mynisum.okta.com/");
		WebElement passwordEnter = driver.findElement(By.id("okta-signin-password"));
//		driver.findElement(RelativeLocator.with(By.tagName("input")).above(passwordEnter)).sendKeys("saqkhan@nisum.com");
		driver.findElement(RelativeLocator.with(By.id("input7")).below(passwordEnter)).sendKeys(Keys.SPACE);
		
		Thread.sleep(2000);
		driver.close();
		driver.quit();
		
	}
}
