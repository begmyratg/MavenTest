package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utilities.TestBase;

public class HoverTest extends TestBase {

	@Test
	public void hover() {
		driver.get("https://amazon.com");
		// creating webelement where i want to hover over my mouse
		WebElement signIn = driver.findElement(By.xpath("//a[@data-nav-ref='nav_ya_signin']"));
		// hover overing mouse
		actions.moveToElement(signIn).perform();
		// clicing the element inside the hover over
		driver.findElement(By.xpath("//span[.='Create a List']")).click();
		// verify title has the neaded word
		//Assert.assertTrue(driver.getTitle().toLowerCase().contains("list"));
	}

	@Test
	public void test2() {
		driver.get("https://amazon.com");
		WebElement help = driver.findElement(By.xpath("//a[.='Help']"));
		actions.moveToElement(help).perform();

	}
}
