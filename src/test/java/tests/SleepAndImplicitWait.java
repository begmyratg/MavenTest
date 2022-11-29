package tests;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import utilities.Driver;

public class SleepAndImplicitWait {

	WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		driver=Driver.getDriver();
	}
	
	@AfterMethod
	public void tearDown() {
		Driver.closeDriver();
	}
	
	@Test
	public void testSleep() throws InterruptedException {
		Thread.sleep(10000);
	}
	
	@Test
	public void implicitWait() throws InterruptedException {
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
