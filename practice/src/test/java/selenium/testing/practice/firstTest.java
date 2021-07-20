package selenium.testing.practice;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstTest {
	@BeforeClass
	public static void setupClass() {
		WebDriverManager.chromedriver().setup();
	}

	@Test
	public void realTest() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.quit();
	}

	public void elTest() {
		// Forma estandar de crear el chrome driver pero sin control de versionado
		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "src/main/resources/chromedriver.exe"); WebDriver driver = new
		 * ChromeDriver(); driver.get("https://www.hola.com/"); driver.quit();
		 */
		// Forma con control de versionado importando el WebDriverManager
	}

}
