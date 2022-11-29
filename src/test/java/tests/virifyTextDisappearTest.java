package tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.github.dockerjava.api.model.Frame;

import utilities.TestBase;

public class virifyTextDisappearTest extends TestBase {

	@Test
	public void verify1() {
		driver.get("https://www.w3schools.com/howto/howto_js_toggle_hide_show.asp");
		WebElement text = driver.findElement(By.id("myDIV"));
		Assert.assertTrue(text.isDisplayed());
		WebElement button = driver.findElement(By.xpath("//button[.='Toggle Hide and Show']"));
		button.click();
		Assert.assertFalse(text.isDisplayed());
	}

	@Test
	public void verify2() throws InterruptedException {
		driver.get("https://www.w3schools.com/jquery/tryit.asp?filename=tryjquery_html_remove");
		driver.switchTo().frame("iframeResult");
		WebElement text = driver.findElement(By.xpath("//body/p"));
		WebElement button=driver.findElement(By.xpath("//body/button"));
		button.click();
		Assert.assertFalse(elementDisplayed(By.xpath("//body/p")));

//		try {
//			Assert.assertFalse(text.isDisplayed());
//		} catch (StaleElementReferenceException e) {
//			System.out.println("PASS");
//		}

	}

	public boolean elementDisplayed(By by) {
		try {
			driver.findElement(by);
			return true;
		} catch (NoSuchElementException e) {
			System.out.println("found exception");
			return false;
		}
	}

}
