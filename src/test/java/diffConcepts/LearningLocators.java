package diffConcepts;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningLocators {

	WebDriver driver;
	@Before
	public void init () {
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://objectspy.space/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
		
	}
	@Test
	public void textLocator () {
		driver.findElement(By.name("firstname")).sendKeys("Abdullah");
		driver.findElement(By.name("lastname")).sendKeys("Obaid");
		driver.findElement(By.name("Password")).sendKeys("");
		
		// Click the checkBoxes
		driver.findElement(By.id("sex-0")).click();
		driver.findElement(By.id("exp-6")).click();
		driver.findElement(By.id("profession-1")).click();
		driver.findElement(By.id("tool-2")).click();
		
		//upload file using sendkeys as long as the tagName is input
		// anything else use Robot
		driver.findElement(By.className("input-file")).sendKeys("C:\\Users\\Abdul\\OneDrive\\Desktop\\TechFios QA\\Selenium\\PowerPoint Slides\\Session 1.pptx");
		
		//Link Text
		driver.findElement(By.linkText("OS-API Product FrontEnd")).click();
		// Going back to previous page, In Automation we cannot go back to previous page
		driver.navigate().back();
		
		// Partial Link Text
		driver.findElement(By.partialLinkText("TF-API")).click();
		
	}
	//@After
	public void tearDown () {
		
		driver.close();
	}
	
	
	
	
}
