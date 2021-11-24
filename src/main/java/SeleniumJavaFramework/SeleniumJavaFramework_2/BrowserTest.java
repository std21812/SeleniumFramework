package SeleniumJavaFramework.SeleniumJavaFramework_2;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserTest {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
	//	System.setProperty("webdriver.gecko.driver", "/Users/saqkhan_1/eclipse-workspace/SeleniumAutomation/SeleniumJavaFramework_2/drivers/geckodriver/geckodriver1");
	//	WebDriver driver = new FirefoxDriver();
		
	//	System.setProperty("webdriver.chrome.driver", "/Users/saqkhan_1/eclipse-workspace/SeleniumAutomation/SeleniumJavaFramework_2/drivers/chromedriver/chromedriver 3");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
	//	WebDriverManager.firefoxdriver().setup();
	//	WebDriver driver = new FirefoxDriver(); 
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(1));
		driver.manage().timeouts().scriptTimeout(Duration.ofMinutes(2));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		
		driver.get("https://google.com");
		String originalWindow = driver.getWindowHandle();
		Thread.sleep(2000);
		driver.navigate().to("https://mynisum.okta.com/");
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
	/*	
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		
		
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.close();
		driver.switchTo().newWindow(WindowType.TAB);
		
	*/
		
	/*	
		driver.manage().window().getSize().getWidth();
		driver.manage().window().getSize().getHeight();
		
		Dimension size = driver.manage().window().getSize();
		System.out.println(size.getWidth());
		System.out.println(size.getHeight());
		
		Thread.sleep(2000);
		
		driver.manage().window().setSize(new Dimension(800,600));
		driver.manage().window().getPosition().getX();
		driver.manage().window().getPosition().getY();
		
		Point position = driver.manage().window().getPosition();
		System.out.println(position.getX());
		System.out.println(position.getY());
		
		driver.manage().window().setPosition(new Point(500,100));
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.manage().window().minimize();
		Thread.sleep(2000);
		driver.manage().window().fullscreen();
		Thread.sleep(2000);
	*/
		
	/*	
		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile, new File("./image1.png"));
		
		WebElement element = driver.findElement(By.cssSelector(".auth-org-logo"));
		File srcFile1 = element.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile1, new File("./image2.png"));
	*/	
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		WebElement button = driver.findElement(By.id("okta-signin-submit"));
		js.executeScript("arguments[0].click();", button);
		js.executeScript("console.log('Hello World')");
		
		driver.switchTo().window(originalWindow);
		driver.close();
		
	}

}

