package selenium.testing.practice;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsTest {
	WebDriver driver;
	WebElement element;
	// Se crea el objeto actions
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
	By label_psswd = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div[2]");
	//Herokuapp
	By option_selector = By.xpath("//*[@id=\"dropdown\"]");
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
	public void testingDropDown() {
		driver.get("https://the-internet.herokuapp.com/dropdown");
		WebElement option1 = driver.findElement(By.cssSelector("option[value='1']"));
		WebElement option2 = driver.findElement(By.cssSelector("option[value='2']"));
		//Select option 2
		WebElement selector = driver.findElement(option_selector);
		selector.sendKeys("Option 2");
		assertTrue(option2.isSelected());
		assertFalse(option1.isSelected());
	}
	@Test
	public void testingHovers() {
		driver.get("https://the-internet.herokuapp.com/hovers");
		element = driver.findElement(By.className("figure"));
		Actions actions = new Actions(driver);
		//No le puse .build() porque eso lo unico que hace es permitirme guardar esto en un objeto action
		actions.moveToElement(element).perform();
		
		element = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/div/h5"));////*[contains(text(),'name: user1')]
		assertTrue("user1 should appear, this is a message test", element.isDisplayed());
	}
	@Test
	public void testingContext_Menu() {
		driver.get("https://the-internet.herokuapp.com/context_menu");
		//Select option 1
		element = driver.findElement(By.id("hot-spot"));
		Actions actions = new Actions(driver);
		actions.contextClick(element).perform();
		driver.switchTo().alert().accept();

	}
	@Test
	public void testingKeyPress() {
		driver.get("https://the-internet.herokuapp.com/key_presses");
		//Select option 1
		element = driver.findElement(By.id("target"));
		element.click();
		Actions actions = new Actions(driver);
		actions.
				sendKeys(Keys.ARROW_RIGHT).
				pause(1000).
				perform();
		element = driver.findElement(By.id("result"));
		assertEquals("message if fail","You entered: RIGHT",element.getText());
	}


}
