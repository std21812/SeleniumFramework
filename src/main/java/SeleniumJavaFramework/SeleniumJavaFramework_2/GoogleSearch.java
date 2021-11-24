package SeleniumJavaFramework.SeleniumJavaFramework_2;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.GoogleSearchPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearch {
	
	private static WebDriver driver = null;

	public static void main(String[] args) {
	
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.get("https://google.com/");
	
	GoogleSearchPage.textbox_search(driver).sendKeys("Automation step by step");
	GoogleSearchPage.textbox_search(driver).sendKeys(Keys.ENTER);
	
	driver.close();
	
	}
}

