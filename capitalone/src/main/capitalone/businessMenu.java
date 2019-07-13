import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class businessMenu {

	WebDriver driver;

	static WebElement element;

	public static void Business (WebDriver driver) {
    
    	WebElement businessButton = driver.findElement(By.xpath("//span[contains(text(),'Business')]");
    	Actions action = new Actions(driver);
    	action.moveToElement(businessmanu).build().perform();

    }

	public static void SprkBusCC(WebDriver driver) {

		WebElement SprkBusCC = driver
				.findElement(By.xpath("//a[@id='navtest-b-l2-list-businesscreditcards-sparkbusinesscreditcards']"));
		SprkBusCC.click();
	}

	public static void SprkCshBR(WebDriver driver) {

		WebElement SprkCshBR = driver
				.findElement(By.xpath("//a[@id='navtest-b-l2-list-businesscreditcards-sparkcashbackrewards']"));
		SprkCshBR.click();
	}

	public static void SprkRwd(WebDriver driver) {

		WebElement SprkRwd = driver
				.findElement(By.xpath("//a[@id='navtest-b-l2-list-businesscreditcards-sparkmilesrewards']"));
		SprkCshBR.click();
	}

	public static void CorpCrd(WebDriver driver) {

		WebElement CorpCrd = driver
				.findElement(By.xpath("//a[@id='navtest-b-l2-list-businesscreditcards-corporatecard']"));
		CorpCrd.click();
	}
	
	public static void SprkBB(WebDriver driver) {

		WebElement SprkBB = driver
				.findElement(By.xpath("//a[@id='navtest-b-l2-list-businessbankingservices-overviewofsparkbusinessbanking']"));
		SprkBB.click();
	}
	
	public static void SavAcc(WebDriver driver) {

		WebElement SavAcc = driver
				.findElement(By.xpath("//a[@id='navtest-b-l2-list-businessbankingservices-savingsaccounts']"));
		SavAcc.click();
	}
	
	public static void CkAcc (WebDriver driver) {

		WebElement CkAcc = driver
				.findElement(By.xpath("//a[@id='navtest-b-l2-list-businessbankingservices-checkingaccounts']"));
		CkAcc.click();
	}
	
	public static void Sprk401k (WebDriver driver) {

		WebElement Sprk401k = driver
				.findElement(By.xpath("//a[@id='navtest-b-l2-list-businessbankingservices-spark401k']"));
		Sprk401k.click();
	}
	
	public static void MercServ (WebDriver driver) {

		WebElement MercServ = driver
				.findElement(By.xpath("//a[@id='navtest-b-l2-list-businessbankingservices-merchantservices']"));
		MercServ.click();
	}
	
	public static void EE (WebDriver driver) {

		WebElement EE = driver
				.findElement(By.xpath("//a[@id='navtest-b-l2-list-businessbankingservices-escrowexpress']"));
		EE.click();
	}
	
	public static void SavAcc(WebDriver driver) {

		WebElement   = driver
				.findElement(By.xpath("//a[@id='navtest-b-l2-list-businessbankingservices-savingsaccounts']"));
		SavAcc.click();
	}
	
	public static void Lnd (WebDriver driver) {

		WebElement Lnd = driver
				.findElement(By.xpath("//a[@id='navtest-b-l2-list-businessbankingservices-lending']"));
		Lnd.click();
	}
	
	public static void CBST (WebDriver driver) {

		WebElement CBST = driver
				.findElement(By.xpath("//a[@id='navtest-b-l2-list-businessbankingservices-commercialbusinessservicestopics']"));
		CBST.click();
	}
}
