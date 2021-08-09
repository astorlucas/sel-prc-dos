package selenium.testing.practice;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertTest {
	WebDriver driver;

	@Before
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	@After
	public void tearDown() {
		// driver.quit();
	}

	@Test
	public void alertTest() {
		driver.navigate().to("https://the-internet.herokuapp.com/javascript_alerts");
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[3]/button")).click();
		//normalize-space sirve por si los espacios no son correctos
		//driver.findElement(By.xpath("//*[contains(normalize-space(text()),'Click for JS Prompt')]")).click();
		//Alert me permite crear un objeto del tipo Alert e interactuar con el
		Alert inputAlert = driver.switchTo().alert();
		inputAlert.sendKeys("Texto de prueba");
		inputAlert.accept();
	}
}
