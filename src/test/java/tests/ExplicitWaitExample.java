package tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import utilities.Driver;

public class ExplicitWaitExample {

	

	
		
	@Test
	public void test() {
		Driver.getDriver().get("https://the-internet.herokuapp.com/dynamic_controls");
		
		//enable
		Driver.getDriver().findElement(By.xpath("//button[.='Enable']")).click();
		
		//this wait will not work because, the element found, but wi have to wait 
		//till it changes from one to another element
		//Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//explicit waits.Just creating object
		WebDriverWait wait= new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(100));
		
		//this is when wait happens
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='text']")));
		
	
			
		//write smth
		Driver.getDriver().findElement(By.xpath("//input[@type='text']")).sendKeys("aaaaaaaaaa");
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
