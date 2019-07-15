package homepage.creditcardtest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;

public class creditCardPOM {
	
	static WebElement element = null; 
	
	@BeforeMethod(alwaysRun = true)
	public void setUp(WebDriver driver) {
		// Navigating to the page
		String URL = "https://www.capitalone.com/";
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\omdaw\\OneDrive\\Documents\\drivers\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(URL);

		// Mousing over the credit card tab
		element = driver.findElement(By.xpath("//span[contains(text(),'Credit Cards')]"));
		Actions action = new Actions(driver);
		action.moveToElement(element).build().perform();
	}


	// Mouse Hover on the credit card tab
	public static void mouseOverCC(WebDriver driver) {
		element = driver.findElement(By.xpath("//span[contains(text(),'Credit Cards')]"));
		Actions action = new Actions(driver);
		action.moveToElement(element).build().perform();
	}

	// Featured Credit Cards Section
	public static void ventureCCImage(WebDriver driver) {
		element = driver.findElement(By.xpath(
				"//a[@id='navtest-b-l2-featcard-image-venturetravelrewards']//img[@class='site-L2__feat-card-card-art']"));
		element.click();
	}

	public static void ventureTravelRewardsLink(WebDriver driver) {
		element = driver.findElement(By.xpath("//span[contains(text(),'Venture® Travel Rewards')]"));
		element.click();
	}

	public static void quicksilverCCImage(WebDriver driver) {
		element = driver.findElement(By.xpath(
				"//a[@id='navtest-b-l2-featcard-image-quicksilvercashrewards']//img[@class='site-L2__feat-card-card-art']"));
		element.click();
	}

	public static void quicksilverCashRewardsLink(WebDriver driver) {
		element = driver.findElement(By.xpath("//span[contains(text(),'Quicksilver® Cash Rewards')]"));
		element.click();
	}

	public static void savorCCImage(WebDriver driver) {
		element = driver.findElement(By.xpath(
				"//a[@id='navtest-b-l2-featcard-image-savorrewards']//img[@class='site-L2__feat-card-card-art']"));
		element.click();
	}

	public static void savorRewardsLink(WebDriver driver) {
		element = driver.findElement(By.xpath("//span[contains(text(),'Savor® Rewards')]"));
		element.click();
	}

	public static void sparkCCImage(WebDriver driver) {
		element = driver.findElement(By.xpath(
				"//a[@id='navtest-b-l2-featcard-image-sparkcashforbusiness']//img[@class='site-L2__feat-card-card-art']"));
		element.click();
	}

	public static void sparkCashForBusinessLink(WebDriver driver) {
		element = driver.findElement(By.xpath("//span[contains(text(),'Spark® Cash for Business')]"));
		element.click();
	}

	public static void compareAllCardsButton(WebDriver driver) {
		element = driver.findElement(By.xpath("//a[@id='navtest-b-l2-cta-compareallcards']"));
		element.click();
	}

	// Find a Credit Card Section
	public static void typesOfCreditCards(WebDriver driver) {
		element = driver.findElement(By.xpath("//a[@id='navtest-b-l2-list-findacreditcard-typesofcreditcards']"));
		element.click();
	}

	public static void seeIfPrequalified(WebDriver driver) {
		element = driver.findElement(By.xpath("//a[contains(text(),\"See if You're Pre-Qualified\")]"));
		element.click();
	}

	public static void travelRewardsCards(WebDriver driver) {
		element = driver.findElement(By.xpath("//a[@id='navtest-b-l2-list-findacreditcard-travelrewardscards']"));
		element.click();
	}

	public static void cashBackRewardsCards(WebDriver driver) {
		element = driver.findElement(By.xpath("//a[@id='navtest-b-l2-list-findacreditcard-cashbackrewardscards']"));
		element.click();
	}

	public static void businessRewardsCards(WebDriver driver) {
		element = driver.findElement(By.xpath("//a[@id='navtest-b-l2-list-findacreditcard-businessrewardscards']"));
		element.click();
	}

	public static void benefitsOfOurCards(WebDriver driver) {
		element = driver.findElement(By.xpath("//a[@id='navtest-b-l2-list-findacreditcard-benefitsofourcards']"));
		element.click();
	}

	public static void respondToAMailOffer(WebDriver driver) {
		element = driver.findElement(By.xpath("//a[@id='navtest-b-l2-list-findacreditcard-respondtoamailoffer']"));
		element.click();
	}

	// Tips & Tools Section
	public static void trackCredit(WebDriver driver) {
		element = driver.findElement(By.xpath("//a[@id='navtest-b-l2-list-tipstools-trackcreditwithcreditwise']"));
		element.click();
	}

	public static void howToBuildCredit(WebDriver driver) {
		element = driver.findElement(By.xpath("//a[@id='navtest-b-l2-list-tipstools-howtobuildcredit']"));
		element.click();
	}

	public static void howRewardsWork(WebDriver driver) {
		element = driver.findElement(By.xpath("//a[@id='navtest-b-l2-list-tipstools-howrewardswork']"));
		element.click();
	}

	public static void paymentCalculator(WebDriver driver) {
		element = driver.findElement(By.xpath("//a[@id='navtest-b-l2-list-tipstools-paymentcalculator']"));
		element.click();
	}

	public static void creditCardFAQ(WebDriver driver) {
		element = driver.findElement(By.xpath("//a[@id='navtest-b-l2-list-tipstools-creditcardfaq']"));
		element.click();
	}

	public static void exploreMore(WebDriver driver) {
		element = driver.findElement(By.xpath("//a[@id='navtest-b-l2-list-tipstools-exploremorecredittopics']"));
		element.click();
	}

	// Common Account Tasks Section
	public static void activateACard(WebDriver driver) {
		element = driver.findElement(By.xpath("//a[@id='navtest-b-l2-task-activateacard']"));
		element.click();
	}

	public static void downloadTheMobileApp(WebDriver driver) {
		element = driver.findElement(By.xpath("//a[@id='navtest-b-l2-task-downloadthemobileapp']"));
		element.click();
	}

	public static void learnAboutCreditLimitIncreases(WebDriver driver) {
		element = driver.findElement(By.xpath("//a[@id='navtest-b-l2-task-learnaboutcreditlimitincreases']"));
		element.click();
	}

	public static void payMyCreditCardBill(WebDriver driver) {
		element = driver.findElement(By.xpath("//a[@id='navtest-b-l2-task-paymycreditcardbill']"));
		element.click();
	}

	public static void fivePurchasesImage(WebDriver driver) {
		element = driver.findElement(By.xpath("//img[@class='site-header__marketing-tile-image']"));
		element.click();
	}

	public static void seeTheList(WebDriver driver) {
		element = driver.findElement(
				By.xpath("//button[@class='ods-unav-hp-button--text-directional-right site-L2__tabbable']"));
		element.click();
	}

}
