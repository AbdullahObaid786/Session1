package diffConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		// creating WebDriver Object
		WebDriver driver = new ChromeDriver();
		// Deleting all the cookies 
		driver.manage().deleteAllCookies();
		// Maximize the window
		driver.manage().window().maximize();
		// Go to Website
		driver.get("http://www.techfios.com/billing/?ng=admin");
		// Insert the Username and pass the userName
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		// Insert the Password and pass the password
		driver.findElement(By.id("password")).sendKeys("abc123");
		// Click on Sign in Button
		driver.findElement(By.name("login")).click();
		// Wait until 5 second then close it
		Thread.sleep(5000);
		// Close the window
		driver.close();
		

	}

}
