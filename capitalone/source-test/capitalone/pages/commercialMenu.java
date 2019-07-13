package capitalone.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class commercialMenu {

	WebDriver driver;

	static WebElement element;

	public static void Commercial(WebDriver driver) {
		WebElement commercialtab = driver.findElement(By.xpath("//span[contains(text(),'Commercial')]"));
		Actions action = new Actions(driver);
		action.moveToElement(commercialtab).build().perform();

	}

	public static void CandIndustrial(WebDriver driver) {
		element = driver.findElement(By.xpath("//a[@id='navtest-b-l2-list-industryexpertise-commercialindustrial']"));
		element.click();
	}

	public static void CRealEstate(WebDriver driver) {
		element = driver.findElement(By.xpath("//a[@id='navtest-b-l2-list-industryexpertise-commercialrealestate']"));
		element.click();
	}

	public static void Energy(WebDriver driver) {
		element = driver.findElement(By.xpath("//a[@id='navtest-b-l2-list-industryexpertise-energy']"));
		element.click();
	}

	public static void FIGroup(WebDriver driver) {
		element = driver
				.findElement(By.xpath("//a[@id='navtest-b-l2-list-industryexpertise-financialinstitutionsgroup']"));
		element.click();
	}

	public static void Healthcare(WebDriver driver) {
		element = driver.findElement(By.xpath("//a[@id='navtest-b-l2-list-industryexpertise-healthcare']"));
		element.click();
	}

	public static void TMT(WebDriver driver) {
		element = driver.findElement(By.xpath("//a[@id='navtest-b-l2-list-industryexpertise-technologymediatelecom']"));
		element.click();
	}

	public static void ExploreIE(WebDriver driver) {
		element = driver.findElement(By.xpath("//a[@id='navtest-b-l2-list-industryexpertise-exploreotherindustries']"));
		element.click();
	}

	public static void CapitalMarkets(WebDriver driver) {
		element = driver
				.findElement(By.xpath("//a[@id='navtest-b-l2-list-commercialbankingsolutions-capitalmarkets']"));
		element.click();
	}

	public static void CommercialLending(WebDriver driver) {
		element = driver
				.findElement(By.xpath("//a[@id='navtest-b-l2-list-commercialbankingsolutions-commerciallending']"));
		element.click();
	}

	public static void Corpratecard(WebDriver driver) {
		element = driver.findElement(By.xpath("//a[@id='navtest-b-l2-list-commercialbankingsolutions-corporatecard']"));
		element.click();
	}

	public static void Depositoryservices(WebDriver driver) {
		element = driver
				.findElement(By.xpath("//a[@id='navtest-b-l2-list-commercialbankingsolutions-depositoryservices']"));
		element.click();
	}

	public static void TreasuryMgmt(WebDriver driver) {
		element = driver
				.findElement(By.xpath("//a[@id='navtest-b-l2-list-commercialbankingsolutions-treasurymanagement']"));
		element.click();
	}

	public static void ExploreCBS(WebDriver driver) {
		element = driver
				.findElement(By.xpath("//a[@id='navtest-b-l2-list-commercialbankingsolutions-exploreothersolutions']"));
		element.click();
	}

	public static void aboutCapitalOne(WebDriver driver) {
		element = driver.findElement(
				By.xpath("//a[@id='navtest-b-l2-list-insightsresources-aboutcapitalonecommercialbanking']"));
		element.click();
	}

	public static void commercialInsights(WebDriver driver) {
		element = driver.findElement(By.xpath("//a[@id='navtest-b-l2-list-insightsresources-commercialinsights']"));
		element.click();
	}

	public static void contactUs(WebDriver driver) {
		element = driver.findElement(By.xpath("//a[@id='navtest-b-l2-list-insightsresources-contactustolearnmore']"));
		element.click();
	}

	public static void CBsignin(WebDriver driver) {
		element = driver
				.findElement(By.xpath("//a[@id='navtest-b-l2-list-insightsresources-commercialbankingsignin']"));
		element.click();
	}

	public static void LearnMore(WebDriver driver) {
		element = driver.findElement(
				By.xpath("//button[@class='ods-unav-hp-button--text-directional-right site-L2__tabbable']"));
		element.click();
	}
}
