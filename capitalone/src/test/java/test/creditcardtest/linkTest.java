package test.creditcardtest;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import homepage.creditcardtest.creditCardPOM;

public class linkTest extends creditCardPOM {

	static WebElement element = null;
	WebDriver driver;

	@Test
	public static void ventureTravelTest(WebDriver driver) {
		creditCardPOM.ventureCCImage(driver);
		String CorrectURL = driver.getCurrentUrl();
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(CorrectURL, "https://www.capitalone.com/credit-cards/venture/");
		sa.assertAll();
	}

	@AfterMethod
	public static void tearDown(WebDriver driver) {
		driver.close();
	}

}
