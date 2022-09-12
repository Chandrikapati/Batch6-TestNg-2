package TestRunner;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import BaseRunner.BaseClass;
import Utilites.ReadConfig;

public class Test0011 extends BaseClass {
	
	
	ReadConfig readConfig = new ReadConfig();
	
	@Test(priority = 1)
	private void ValidateUrl() {
		// TODO Auto-generated method stub

		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		driver.manage().deleteAllCookies();
		
		driver.get(readConfig.TestURL());
		
		
		try {
			
			driver.findElement(By.xpath("(//button[@class='wpn_modal_actionButton'])[1]")).click();
		} catch (Exception e) {
			System.out.println("No Notification (Would you like to receive notifications and updates from Quikr? Subscribe and get )");
		}
		
		
//		Assert.assertEquals(driver.getCurrentUrl());
		
	}
	
	
	@Test(priority = 2)
	
	private void SearchBikeProductAndvalidateUrl() {
		
	String	TestData="https://www.quikr.com/bikes-scooters/used+Bikes+bikes-scooters+all-india+y1402";

		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@placeholder='Search in EastGodavari']")).sendKeys("Bykes");
		
		
		driver.findElement(By.xpath("//i[@class='icon-search']")).click();
		
		
		//Assert.assertEquals(driver.getCurrentUrl(),TestData);
	}
	
	
	
	
	
	
	

}
