package TestRunner;


import java.util.Date;
import java.util.Set;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import BaseRunner.BaseClass;

//prequest--


//Browser---chrom firfox edge opera etc

//Application -url
//Navigate to home page



//1)Hp laptop adding to cart--- Expected Result iteam add successfull 
//2)Dell laptop adding to cart
//3)Lenovo laptop
//4) Asus laptop





public class Test001 extends BaseClass {
	
	

	static Logger log = Logger.getLogger(Test001.class);

	
	@BeforeMethod
	private void TestCaseStartedTime() {
		// TODO Auto-generated method stub
		PropertyConfigurator.configure("C:\\wp.sdet.15\\Test\\src\\test\\resources\\ConfigFiles\\Config.properties");
		
		System.out.println("NAVIGATE TO AMAZON HOME PAGE I.E + https://www.amazon.in/ ");
		driver.navigate().to("https://www.amazon.in/");
		
		log.info("Amazon Application was be lunched");
	}
	
	@AfterMethod
	private void TestCaseEndedTime() {
		// TODO Auto-generated method stub
		
		
		//Validate current url using assert
		
		System.out.println("ASSERATION FOR TO FIND EXPECTED RESULT");

	}
	
	
	
	
	//1)Hp laptop
	@Test
	private void Tc1() {
		// TODO Auto-generated method stub
		
		
		
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("HP Laptop");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		
		// click second product from list
		driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]")).click();
		
		//move to next win and click on add to cart
		
		String parentwin = driver.getWindowHandle();
		
		System.out.println(parentwin);
		
		Set<String> windowHandles = driver.getWindowHandles();
		
		for (String nextwins : windowHandles) {
		
			if (!parentwin.equals(nextwins)) {
				driver.switchTo().window(nextwins);
			}
			
		}
		//scrool down
		
		//click on add cart button
		
		//Successfull message
		
//		String addcart = driver.findElement(By.xpath("//span[@class='a-size-medium-plus a-color-base sw-atc-text a-text-bold']")).getText();
		
//		Assert.assertEquals("Added to Cart", addcart);
		
		

	}
	//2)Dell laptop
	@Test
	private void Tc2() {
		// TODO Auto-generated method stub

		System.out.println("Search for DELL LAPTOP IN SEARCH BOX "
				+ "2) CLICK ON SECOND PRODUT "
				+ "3) ADD TO CART"
				+ "4) PRINT SUCCESSFFUL MESSAGE"
				+ "5) VALIDATE SUCCESSFULL MESSAGE");
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("dell Laptop");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		
		// click second product from list
		driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]")).click();
		
		//move to next win and click on add to cart
		
		String parentwin = driver.getWindowHandle();
		
		System.out.println(parentwin);
		
		Set<String> windowHandles = driver.getWindowHandles();
		
		for (String nextwins : windowHandles) {
		
			if (!parentwin.equals(nextwins)) {
				driver.switchTo().window(nextwins);
			}
			
		}

	}
	//3)Lenovo laptop
	@Test
	private void Tc3() {
		// TODO Auto-generated method stub

		
		System.out.println("Search for LENOVO LAPTOP IN SEARCH BOX "
				+ "2) CLICK ON SECOND PRODUT "
				+ "3) ADD TO CART"
				+ "4) PRINT SUCCESSFFUL MESSAGE"
				+ "5) VALIDATE SUCCESSFULL MESSAGE");

		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("lenovo Laptop");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		
		// click second product from list
		driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]")).click();
		
		//move to next win and click on add to cart
		
		String parentwin = driver.getWindowHandle();
		
		System.out.println(parentwin);
		
		Set<String> windowHandles = driver.getWindowHandles();
		
		for (String nextwins : windowHandles) {
		
			if (!parentwin.equals(nextwins)) {
				driver.switchTo().window(nextwins);
			}
			
		}
		
	}
	//4) Asus laptop
	@Test
	private void Tc4() {
		// TODO Auto-generated method stub
		
		System.out.println("Search for ASSUS LAPTOP IN SEARCH BOX "
				+ "2) CLICK ON SECOND PRODUT "
				+ "3) ADD TO CART"
				+ "4) PRINT SUCCESSFFUL MESSAGE"
				+ "5) VALIDATE SUCCESSFULL MESSAGE");
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("assus Laptop");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		
		// click second product from list
		driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]")).click();
		
		//move to next win and click on add to cart
		
		String parentwin = driver.getWindowHandle();
		
		System.out.println(parentwin);
		
		Set<String> windowHandles = driver.getWindowHandles();
		
		for (String nextwins : windowHandles) {
		
			if (!parentwin.equals(nextwins)) {
				driver.switchTo().window(nextwins);
			}
			
		}


	}
	
	

}
