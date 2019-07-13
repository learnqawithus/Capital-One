package capitalone;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestingBusiness {

	WebDriver driver;

	@BeforeMethod
	public void setup() {

		String URL = "https://www.capitalone.com/";

		System.setProperty("webdriver.chrome.driver", "/Users/maheen/Desktop/WorkSpace/Drivers/chromedriver");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(URL);
	}

	@Test
	public void BCC () {
		 
	}
	
 
	
	

}
