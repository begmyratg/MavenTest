package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;

public class PrestashopHomePage {
	

	public PrestashopHomePage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	
	public WebElement product (String name) {
		String xpath= "(//h5//a[@ title='"+name+"'])[1]";
		return Driver.getDriver().findElement(By.xpath(xpath));
		
	}
}
