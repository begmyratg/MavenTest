package tests;

import org.junit.Test;
import org.openqa.selenium.Keys;

import utilities.TestBase;

public class ScrollTest extends TestBase {

	@Test 
	public void test() {
		driver.get("https://youtube.com");
		actions.sendKeys(Keys.PAGE_DOWN).perform();//scroll down
		actions.sendKeys(Keys.ARROW_DOWN).perform();//scroll down a bit
		//actions.sendKeys(Keys.PAGE_DOWN).perform();
		//actions.sendKeys(Keys.PAGE_DOWN).perform();
	}
}
