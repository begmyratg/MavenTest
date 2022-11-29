package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import utilities.Driver;

public class SleepAndImplicitWait {

	WebDriver driver;
	
	@BeforeClass
	public void setUp() {
		driver=Driver.getDriver();
	}
	
	@AfterClass
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
