package selenium.testing.practice;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsTest {
	WebDriver driver;
	//Se crea el objeto actions
	Actions actions;
	By username = By.xpath("//*[@id=\"user-name\"]");
	By password = By.xpath("//*[@id=\"password\"]");
	By btn_Login = By.xpath("//*[@id=\"login-button\"]");
	By btn_AddToCartBackpack = By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]");
	By cart = By.xpath("//*[@id=\"shopping_cart_container\"]/a");
	By btn_Checkout = By.xpath("//*[@id=\"checkout\"]");
	By first_Name = By.xpath("//*[@id=\"first-name\"]");
	By last_Name = By.xpath("//*[@id=\"last-name\"]");
	By postal_Code = By.xpath("//*[@id=\"postal-code\"]");
	By btn_Continue = By.xpath("//*[@id=\"continue\"]");
	By btn_Finish = By.xpath("//*[@id=\"finish\"]");
	By success_Message = By.xpath("//*[@id=\"checkout_complete_container\"]/img");
	@Before
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		actions = new Actions(driver);
	}

	@After
	public void tearDown() {
		//driver.quit();
	}

	@Test
	public void testingActions() {
		//Getting in
		driver.get("https://www.saucedemo.com/");
		//ACTIONS EXAMPLES
		//Con el actions, le pasas un webelement y tenes que poner build y perform para que funcione
		actions.clickAndHold(driver.findElement(btn_Login)).pause(10).build().perform();
		//Keyboard commands
		actions.keyDown("Enter").build().perform();
		actions.keyUp("Enter").build().perform();
		//SendKeys de actions, sirve para mandarle 
		//keys a todo el borwser por ejemplo para abrir consola
		actions.sendKeys("F12").build().perform();


	}
}
