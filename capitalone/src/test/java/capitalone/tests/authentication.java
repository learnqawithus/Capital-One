package capitalone.tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import capitalone.basemethods.initialization;

public class authentication extends initialization {
	
	@Test
	public void login () throws InterruptedException {
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("fawad");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("anwar");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='btn btn-default']")).click();
		
	}

}
