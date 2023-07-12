package diffConcepts;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_Selectors {

	WebDriver driver;
	
	@Before
	public void init () {
		
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://objectspy.space/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
	}
	@Test
	public void testCase () {
		// Using Css_Selector --> TagName[attribute='value']
		driver.findElement(By.cssSelector("input[name='firstname']")).sendKeys("Abdullah");
		//driver.findElement(By.cssSelector("input[name='lastname']")).sendKeys("Obaid");
		
		//Xpath Locator Absolute Xpath
		driver.findElement(By.xpath("html/body/div/div[2]/div[2]/form/div[10]/input")).sendKeys("Legend");
		driver.findElement(By.cssSelector("input[name='Password']")).sendKeys("abc123");
		
		// Using Css_Selector --> input#sex-0  To select id 
		driver.findElement(By.cssSelector("input#sex-0")).click();
		driver.findElement(By.cssSelector("input#exp-6")).click();
		driver.findElement(By.cssSelector("input[id='profession-0']")).click();
		driver.findElement(By.cssSelector("input[value='Automation Tester'][id='profession-1']")).click();
		//driver.findElement(By.cssSelector("a[href=\"http://techfios.com/api-prod/api/\"]")).click();
		driver.findElement(By.cssSelector("input#photo")).sendKeys("C:\\Users\\Abdul\\OneDrive\\Desktop\\TechFios QA\\Selenium\\All Codes\\MVN dependencies.txt");
		
	}
	
	
	
	
}
