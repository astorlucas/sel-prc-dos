package selenium.testing.practice;

import static org.junit.Assert.assertEquals;

import java.util.Set;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JSExecutorTest {
	WebDriver driver;
	//CASTING DRIVER INTO JSEXECUTOR	
	
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
	public void openWindowTest() {
		driver.get("https://the-internet.herokuapp.com/windows");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.open('https://the-internet.herokuapp.com/windows/new');");
		//consiguiendo la primer pestaña
		String firstTab = driver.getWindowHandle();
		//Armo un objeto Set con todas las pestañas activas
		Set todasLasTabs = driver.getWindowHandles();
		//Quito la primer pestaña del set
		todasLasTabs.remove(firstTab);
		//consiguiendo la pestaña siguiente a la primera
		String nextTab = String.valueOf(todasLasTabs.iterator().next());
		//cambiando a la siguiente pestaña
		driver.switchTo().window(nextTab);
		assertEquals("New Window",driver.getTitle());
		
	}

}
