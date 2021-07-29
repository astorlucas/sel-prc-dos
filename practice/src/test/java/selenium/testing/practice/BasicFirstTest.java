package selenium.testing.practice;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasicFirstTest {
	WebDriver driver;
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
	}

	@After
	public void tearDown() {
		//driver.quit();
	}

	@Test
	public void testingAll() {
		//Getting in
		driver.get("https://www.saucedemo.com/");
		//Logging in
		driver.findElement(username).sendKeys("standard_user");
		driver.findElement(password).sendKeys("secret_sauce");
		driver.findElement(btn_Login).click();
		//Adding to cart
		driver.findElement(btn_AddToCartBackpack).click();
		//Going to cart
		driver.findElement(cart).click();
		//Checking out
		driver.findElement(btn_Checkout).click();
		driver.findElement(first_Name).sendKeys("Hola");
		driver.findElement(last_Name).sendKeys("Beba");
		driver.findElement(postal_Code).sendKeys("2");
		driver.findElement(btn_Continue).click();
		//Finishing
		driver.findElement(btn_Finish).click();
		//Asserting
		// explicit wait - to wait for success image to be visible
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(success_Message));
		assertTrue(driver.findElement(success_Message).isDisplayed());


	}
}
