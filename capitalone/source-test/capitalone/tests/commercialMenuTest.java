package capitalone.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import capitalone.pages.commercialMenu;

public class commercialMenuTest {

	WebDriver driver;
	
	@BeforeMethod
	public void setup () {
		String URL = "https://www.capitalone.com/";
		System.setProperty("webdriver.chrome.driver", "/Users/adilkhan/Documents/Drivers/chromedriver");
		driver = new ChromeDriver();
		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
}
	
	@Test
	public void IE () throws InterruptedException{
		commercialMenu.Commercial(driver);
		Thread.sleep(2000);
		commercialMenu.CandIndustrial(driver);
		
		commercialMenu.Commercial(driver);
		Thread.sleep(2000);
		commercialMenu.CRealEstate(driver);
		
		commercialMenu.Commercial(driver);
		Thread.sleep(2000);
		commercialMenu.Energy(driver);
		
		commercialMenu.Commercial(driver);
		Thread.sleep(2000);
		commercialMenu.FIGroup(driver);
		
		commercialMenu.Commercial(driver);
		Thread.sleep(2000);
		commercialMenu.Healthcare(driver);
		
		commercialMenu.Commercial(driver);
		Thread.sleep(2000);
		commercialMenu.TMT(driver);
		
		commercialMenu.Commercial(driver);
		Thread.sleep(2000);
		commercialMenu.ExploreIE(driver);
	}
	
	@Test
	public void CBS () throws InterruptedException{
		commercialMenu.Commercial(driver);
		Thread.sleep(2000);
		commercialMenu.CapitalMarkets(driver);
		
		commercialMenu.Commercial(driver);
		Thread.sleep(2000);
		commercialMenu.CommercialLending(driver);
		
		commercialMenu.Commercial(driver);
		Thread.sleep(2000);
		commercialMenu.Corpratecard(driver);
		
		commercialMenu.Commercial(driver);
		Thread.sleep(2000);
		commercialMenu.Depositoryservices(driver);
		
		commercialMenu.Commercial(driver);
		Thread.sleep(2000);
		commercialMenu.TreasuryMgmt(driver);
		
		commercialMenu.Commercial(driver);
		Thread.sleep(2000);
		commercialMenu.ExploreCBS(driver);
	}
	
	@Test
	public void IandR () throws InterruptedException{
		commercialMenu.Commercial(driver);
		Thread.sleep(2000);
		commercialMenu.aboutCapitalOne(driver);
		
		commercialMenu.Commercial(driver);
		Thread.sleep(2000);
		commercialMenu.commercialInsights(driver);
		
		commercialMenu.Commercial(driver);
		Thread.sleep(2000);
		commercialMenu.contactUs(driver);
		
		commercialMenu.Commercial(driver);
		Thread.sleep(2000);
		commercialMenu.CBsignin(driver);
		driver.navigate().back();
		
		commercialMenu.Commercial(driver);
		Thread.sleep(2000);
		commercialMenu.LearnMore(driver);
		
	}
	
	@AfterMethod
	public void close() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}
	}
	
	

