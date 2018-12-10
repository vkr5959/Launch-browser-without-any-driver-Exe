package parallelExecution.MultipleBrowser;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
	 private WebDriver driver;

	    @BeforeClass
	    public static void setupClass() {
	        WebDriverManager.chromedriver().setup();
	    }

	    @Before
	    public void setupTest() {
	        driver = new ChromeDriver();
	    }

	    @After
	    public void teardown() {
	        if (driver != null) {
	            driver.quit();
	        }
	    }

	    @Test
	    public void test() {
	        // Your test code here
	    }
}
