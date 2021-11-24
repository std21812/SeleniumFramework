package SeleniumJavaFramework.SeleniumJavaFramework_2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpaths {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	//	driver.get("http://the-internet.herokuapp.com/javascript_alerts");
		driver.get("https://mynisum.okta.com/");
		driver.findElement(By.xpath("//h2[text()='MyNisum-OKTA']"));
		driver.findElement(By.xpath("//input[@type='text'][@name='username']")).sendKeys("saqkhan@nisum.com1");
		driver.findElement(By.xpath("//input[starts-with(@name,'username')]")).sendKeys("saqkhan@nisum.com2");
		driver.findElement(By.xpath("//input[starts-with(@name,'username')or @id='okta-signin-username']")).sendKeys("saqkhan@nisum.com3");driver.findElement(By.xpath("//a[contains(text(),'Help')]")).click();
		driver.findElement(By.xpath("//input[starts-with(@name,'username')and @id='okta-signin-username']")).sendKeys("saqkhan@nisum.com2");
		
		
		driver.get("https://good.dev1-platform.s37dev.com/");
		driver.findElement(By.xpath("//input[starts-with(@name,'id-')]"));
		
		driver.quit();
		
		
	}

}
