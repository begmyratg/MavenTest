package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import utilities.Driver;

public class SleepAndImplicitWait {

	WebDriver driver;
	
	@Before
	public void setUp() {
		driver=Driver.getDriver();
	}
	
	@After
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
