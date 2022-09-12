package TestRunner;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import BaseRunner.BaseClass;

public class DataProviders extends BaseClass {

	
	@Test(dataProvider = "SampleData")
	private void Tc1(String Username ,String Password) throws InterruptedException {
		// TODO Auto-generated method stub

		

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		System.out.println(" open addatic web application"
				+ "open url"
				+ "enter user name and password"
				+ "click on login button"
				+ "Take screenshot "
				+ "use assert and validate current url");
		
		driver.navigate().to("https://adactinhotelapp.com/");
		
		driver.findElement(By.id("username")).sendKeys(Username);
		
		driver.findElement(By.id("password")).sendKeys(Password);
		
		driver.findElement(By.id("login")).click();
		
		Thread.sleep(5000);
		
		String currentUrl = driver.getCurrentUrl();
		
		System.out.println(currentUrl);
		
		String ExpectedResult ="https://adactinhotelapp.com/SearchHotel.php";
		
		
	
		
		
		if (currentUrl.equals(ExpectedResult)) {
			Assert.assertTrue(true);
		}else {
			
			System.out.println("Validated with Invalidate username and password");
		}
		
		
	}
	
	
	
	@DataProvider(name ="SampleData")
	public Object[][] data(){
		
		return new Object[][]{
			
			{"jayachandrika","Krish@99"},{"jayachandrika","Krish@99"},{"jayachandrika","Krish@99"},{"rAJES","DASLKDAS"}
		};
	}
	
	
	
	
}
