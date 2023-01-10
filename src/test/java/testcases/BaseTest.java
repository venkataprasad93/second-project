package testcases;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
	static WebDriver driver;
	
	@BeforeClass
	public static void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\venket\\eclipse-workspace\\FreshProject\\Driver\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.get("http://adactinhotelapp.com/");
		driver.manage().window().maximize();
		
		
	}
	
	@AfterClass
	public static void exit() {
		driver.quit();
		
	}

}
