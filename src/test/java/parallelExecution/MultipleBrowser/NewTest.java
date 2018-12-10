package parallelExecution.MultipleBrowser;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTest {
	 private WebDriver driver;

	   @BeforeMethod
	   public void setUp()
	   {
		   
		   //WebDriverManager.chromedriver().setup();
		   WebDriverManager.firefoxdriver().setup();
		   
		   
		  // driver= new ChromeDriver();
		   driver = new FirefoxDriver();
	   }
	   
	   @Test
	   public void testBMS()
	   
	   {
		   driver.get("https://www.google.com");
		   
		   
	   }
	   
	   @AfterMethod
	   public void quitBrowser()
	   {
		   
		   driver.close();
	   }
}

