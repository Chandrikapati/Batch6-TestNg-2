package BaseRunner;

import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import Utilites.FilePath;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	
	@BeforeSuite
	public void SuiteStarted() {
		
//		System.out.println("AMAZON APPLICATION TESTCASE SUITE STARTED ");
		Date date = new Date();
		System.out.println( date.getTime());
		
	}
	
	@AfterSuite
	public void SuitedFinished() {
//		System.out.println("AMAZON APPLICATION TESTCASE SUITE ENDED ");
		Date date = new Date();
		System.out.println( date.getTime());
		driver.quit();
	}
	
	@BeforeTest
	private void TestStarted() {
		// TODO Auto-generated method stub

	}
	
	@AfterTest
	private void TestEnded() {
		// TODO Auto-generated method stub
		
	}
	
	
	
	@Parameters({"browserType"})
	@BeforeClass
	public void LunchBrowser(String browserName)
	{
		
	System.out.println("CHROME BROWSER LUNCHED");
	
	
	
	if (browserName.equals("chrome")) {
	
		
	//	WebDriverManager.chromedriver().setup();
		
		System.setProperty("webdriver.chrome.driver", FilePath.ChromePath);
		
		
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
	}else if (browserName.equals("fireFox")) {
		
		System.setProperty("webdriver.chrome.driver",FilePath.ChromePath);
		
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
	}else if (browserName.equals("Internetexploer")) {
			System.setProperty("webdriver.chrome.driver", "C:\\wp.sdet.15\\Test\\src\\test\\resources\\Drivers101\\chromedriver.exe");
		
		//WebDriverManager.iedriver().setup();
		driver = new InternetExplorerDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
	}else {
		System.out.println("No browser found");}
	}
	

	
	@AfterClass
	
	private void BrowserTeardown() {
		// TODO Auto-generated method stub
	
		System.out.println("CHROME BROWSER QUIT");
	}
	

}
