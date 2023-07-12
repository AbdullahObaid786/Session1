package diffConcepts;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junit_framework {
	static WebDriver driver;

	@Before
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.techfios.com/billing/?ng=admin/");

	}

	@Test
	public void loginTests() throws InterruptedException {
		driver.findElement(By.name("username")).sendKeys("demo@techfios.com");
		driver.findElement(By.name("password")).sendKeys("abc123");
		driver.findElement(By.name("login")).click();
		Thread.sleep(5000);

	}

	@Test
	public void negloginTests() throws InterruptedException {
		driver.findElement(By.name("username")).sendKeys("demo@techfios.com");
		driver.findElement(By.name("password")).sendKeys("abc124");
		driver.findElement(By.name("login")).click();
		Thread.sleep(5000);

	}

	@After
	public void tearDown() {
		driver.close();
	}

}
