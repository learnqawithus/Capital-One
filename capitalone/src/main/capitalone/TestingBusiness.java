package capitalone;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestingBusiness {

	WebDriver driver;

	public static void SetUpBeforeClass() {
		
		System.out.println("The test started");
	}
 
	@BeforeMethod
	public void setup() {

		WebDriver driver;
		String URL = "https://www.capitalone.com/";
		System.setProperty("webdriver.chrome.driver", "/Users/maheen/Desktop/WorkSpace/Drivers/chromedriver");

		driver = new ChromeDriver();
		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@Test
	public void mousehover() {
		WebElement businessbutton = driver.findElement(By.xpath("//span[contains(text(),'Business')]"));
		
		

	}

}

	
}
