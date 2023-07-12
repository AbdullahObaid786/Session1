package diffConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NegativeTests {
	static WebDriver driver;

	public static void main (String [] args) throws InterruptedException {
		launchBrowser();
		loginTests();
		tearDown();
		
		launchBrowser();
		negloginTests();
		tearDown();
		
		
		
	
	}
	
	public static void launchBrowser () {
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.techfios.com/billing/?ng=admin/");
		
	}
	
	public static void loginTests () throws InterruptedException {
		driver.findElement(By.name("username")).sendKeys("demo@techfios.com");
		driver.findElement(By.name("password")).sendKeys("abc123");
		driver.findElement(By.name("login")).click();
		Thread.sleep(5000);
		
	}
	public static void negloginTests () throws InterruptedException {
		driver.findElement(By.name("username")).sendKeys("demo@techfios.com");
		driver.findElement(By.name("password")).sendKeys("abc124");
		driver.findElement(By.name("login")).click();
		Thread.sleep(5000);
		
	}
	
	public static void tearDown () {
		driver.close();
	}
	
	
	
	
	
}
