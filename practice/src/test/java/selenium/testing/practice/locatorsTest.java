package selenium.testing.practice;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class locatorsTest {
	@BeforeClass
	public static void setupClass() {
		WebDriverManager.chromedriver().setup();
	}

	@Test
	public static void typeOfLocators() {
		// 1. Instantiate the driver
		WebDriver driver = new ChromeDriver();
		// 2. navigate to the URL
		driver.get("https://www.saucedemo.com/");
		//3. Find elements
		//ID
		//Name
		//Class name
		//Tag name
		//Css selector
		//Xpath
		//Link text
		//Partial link text
	}
}
