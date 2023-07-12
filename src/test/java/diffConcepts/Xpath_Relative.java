package diffConcepts;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Relative {

	WebDriver driver;

	@Before
	public void init() {

		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://objectspy.space/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@Test
	public void testCase() throws InterruptedException {

		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Abdullah Obaid");
		// Using Xpath for multi attributes
		driver.findElement(By.xpath("//input[@name='lastname' and @type='text']")).sendKeys("is a legend");
		driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("Brave");
		driver.findElement(By.xpath("//input[@id='sex-0' and @name='sex' and @type='radio']")).click();
		driver.findElement(By.xpath("//input[@id='exp-6']")).click();
		driver.findElement(By.xpath("//input[@id='profession-1']")).click();
		driver.findElement(By.xpath("//input[@id='profession-0']")).click();
		driver.findElement(By.xpath("//input[@value='Selenium Webdriver']")).click();
		// using xpath for Hyperlink or Link text Way 1
		driver.findElement(By.xpath("//strong[text()='Link Test : Page Change']")).click();
		driver.navigate().back();
		Thread.sleep(5000);
		// using xpath for Link text or partial Link Text Way 2
		driver.findElement(By.xpath("//strong[contains(text(),'Link Test : New Page')]")).click();

	}

	@After
	public void tearDown() {

		driver.quit();
	}

}
