package tests;

import java.time.Duration;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import utilities.Driver;

public class ExplicitWaitTwo {
	
	@Test
	public void test() throws InterruptedException {
		Driver.getDriver().get("https://the-internet.herokuapp.com/dynamic_loading/1");
		WebDriverWait wait=  new WebDriverWait(Driver.getDriver(),Duration.ofSeconds(100));
		Driver.getDriver().findElement(By.xpath("//button[.='Start']")).click();
		WebElement text= Driver.getDriver().findElement(By.xpath("//h4[.='Hello World!']"));
				
		wait.until(ExpectedConditions.visibilityOf(text));
		
		System.out.println(text.getText());
		Assert.assertTrue(text.isDisplayed());
	}

	
	@Test
	public void test2()  {
		Driver.getDriver().get("https://the-internet.herokuapp.com/dynamic_loading/1");
		WebDriverWait wait=  new WebDriverWait(Driver.getDriver(),Duration.ofSeconds(100));
		Driver.getDriver().findElement(By.xpath("//button[.='Start']")).click();
		WebElement text= Driver.getDriver().findElement(By.xpath("//h4[.='Hello World!']"));
		
		
		wait.until(ExpectedConditions.invisibilityOf(Driver.getDriver().findElement(By.xpath("//*[.='Loading... ']"))));
		
		System.out.println(text.getText());
		Assert.assertTrue(text.isDisplayed());
	}
}
