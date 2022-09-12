package TestRunner;
import java.time.Duration;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import BaseRunner.BaseClass;
import Utilites.ReadConfig;

public class PHP_Travels  extends BaseClass{
	
ReadConfig readConfig = new ReadConfig();
	
	
	@Test(priority=1)
	private void signUpTest() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get(readConfig.TestURL());
		driver.findElement(By.xpath("/html/body/header/div/nav/a[5]")).click();
		Thread.sleep(5000);
		System.out.println(driver.getCurrentUrl());
		Set<String> allHandles = driver.getWindowHandles();
		String currentWindowHandle = allHandles.iterator().next();
		allHandles.remove(allHandles.iterator().next());
		String childWindowHandle = allHandles.iterator().next();
		driver.switchTo().window(childWindowHandle);
		System.out.println(driver.getCurrentUrl());
		System.out.println("childWindowHandle = "+childWindowHandle);
		
		driver.findElement(By.name("firstname")).sendKeys(readConfig.firstName());
		driver.findElement(By.name("lastname")).sendKeys(readConfig.lastName());
		driver.findElement(By.name("phonenumber")).sendKeys(readConfig.phoneNumber());
		driver.findElement(By.name("email")).sendKeys(readConfig.emailId());
		driver.findElement(By.name("companyname")).sendKeys(readConfig.companyName());
		driver.findElement(By.name("address1")).sendKeys(readConfig.address());
		driver.findElement(By.name("address2")).sendKeys(readConfig.address());
		driver.findElement(By.name("city")).sendKeys(readConfig.city());
		driver.findElement(By.name("state")).sendKeys(readConfig.state());
		driver.findElement(By.name("postcode")).sendKeys(readConfig.pinCode());
		Select selection =new Select(driver.findElement(By.name("country")));
		selection.selectByVisibleText("India"); 
		driver.findElement(By.id("customfield2")).sendKeys(readConfig.phoneNumber());
		driver.findElement(By.name("password")).sendKeys(readConfig.PassWord());
		driver.findElement(By.name("password2")).sendKeys(readConfig.PassWord());			
	}
	
	
	@Test(priority=2)
	private void loginTest() {
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get(readConfig.TestURL());
		driver.findElement(By.xpath("/html/body/header/div/nav/a[4]")).click();
		Set<String> allHandles=driver.getWindowHandles();
		String parentWindowHandle=allHandles.iterator().next();
		allHandles.remove(allHandles.iterator().next());
		allHandles.remove(allHandles.iterator().next());
		String childWindow=allHandles.iterator().next();
		driver.switchTo().window(childWindow);
		driver.findElement(By.name("username")).sendKeys(readConfig.emailId());
		driver.findElement(By.name("password")).sendKeys(readConfig.PassWord());

	}
	
	@Test(priority=3)
	private void pricingBtnDemo() {
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get(readConfig.TestURL());
		driver.findElement(By.xpath("/html/body/header/div/nav/a[2]")).click();
	}
}
