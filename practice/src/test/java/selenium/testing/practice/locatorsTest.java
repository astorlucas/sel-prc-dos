package selenium.testing.practice;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class locatorsTest {
	@BeforeClass
	public static void setupClass() {
		WebDriverManager.chromedriver().setup();
	}

	@Test
	public void typeOfLocators() {
		// 1. Instantiate the driver
		WebDriver driver = new ChromeDriver();
		// 2. navigate to the URL
		driver.get("https://www.saucedemo.com/");
		// 3. Find elements
		// ID
		driver.findElement(By.id("password"));
		// Name
		driver.findElement(By.name("password"));
		// Class name
		//driver.findElement(By.className("input_error form_input"));
		// Tag name
		driver.findElement(By.tagName("input"));
		// Css selector
		driver.findElement(By.cssSelector("#login-button"));
		// Xpath
		driver.findElement(By.xpath("//*[@id=\"password\"]"));
		// Link text
		//driver.findElement(By.linkText("Sign in"));
		// Partial link text
		//driver.findElement(By.partialLinkText("sign"));
		// quit driver
		driver.quit();
	}
}
