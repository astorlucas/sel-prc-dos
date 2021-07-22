package selenium.testing.practice;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Navigation1 {
	@BeforeClass
	public static void setupClass() {
        WebDriverManager.firefoxdriver().setup();
    }
	@Test
    public void navigationTest()
    {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://the-internet.herokuapp.com/");
        //driver.quit();
    }
	
}
