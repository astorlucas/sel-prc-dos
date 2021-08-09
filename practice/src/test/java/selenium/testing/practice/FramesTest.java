package selenium.testing.practice;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FramesTest {
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
	public void framesTest() {
		driver.navigate().to("https://the-internet.herokuapp.com/nested_frames");
		
		//frame-top es el atributo name del frame default del view de esta pagina
		WebElement defFrame = driver.findElement(By.name("frame-top"));
		//Se puede cambiar de frame desde los indexes
		driver.switchTo().frame(1);
		//Pregunto si realmente accedí al frame bottom
		WebElement bottomFrame = driver.findElement(By.tagName("body"));
		assertEquals("BOTTOM",bottomFrame.getText());
		//Esto deberia devolver TRUE porque nos encontramos en el frame BOTTOM
		
		//Esto debería movernos al frame padre
		driver.switchTo().parentFrame();
		//Switcheo por nombre de frame
		//Siempre necesito ir al top, antes de moverme a alguno de los hermanos
		driver.switchTo().frame("frame-top");
		driver.switchTo().frame("frame-left");
		WebElement leftFrame = driver.findElement(By.tagName("body"));
		assertEquals("LEFT",leftFrame.getText());
		//Esto deberia devolver TRUE porque nos encontramos en el frame LEFT
		
		//DEFAULT CONTENT NOS LLEVA AL TOP DEL HTML Y CUALQUIER COSA DESDE AHI ES BUSCABLE
		driver.switchTo().defaultContent();
		WebElement topFrame = driver.findElement(By.name("frame-top"));
		assertTrue(topFrame.getSize().height>0);
		//Obtengo la altura del elemento frame-TOP para asegurarme qu estoy parado ahi, medio raro
	}
}
