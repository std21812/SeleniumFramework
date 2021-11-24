package SeleniumJavaFramework.SeleniumJavaFramework_2;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.Science37Objects;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Science37Tests {
	
	private static WebDriver driver = null;
	
	public static void main(String[] args) {
		
		Science37Tests1();
		
	}
	
	public static void Science37Tests1() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://good.dev1-platform.s37dev.com/");
		
		
		Science37Objects searchPageObj = new Science37Objects(driver);
		
		searchPageObj.setEmail("hbinraees+S+coordinator@science37.com");
		searchPageObj.setPassword("Password1234");
		searchPageObj.clickLoginButton();
		
		
		driver.close();
		driver.quit();
	}
	
}
