package tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;

import pages.HomePage;
import pages.PrestashopHomePage;
import utilities.ConfigurationReader;
import utilities.Driver;
import utilities.TestBase;

public class ErrorMessageValidationTest extends TestBase{
	
	
	PrestashopHomePage prestoHomePage= new PrestashopHomePage();
	
	@Test
	public void wrongEmail() {
		HomePage homePage= new HomePage();
		driver.get(ConfigurationReader.getProperty("url"));
		homePage.username.sendKeys("wrong username");//username wrong
		homePage.password.sendKeys(ConfigurationReader.getProperty("password"));//password true
		homePage.loginButton.click();
		Assert.assertTrue(homePage.errorMessage.isDisplayed());
		
	}
	
	@Test
	public void wrongPassword() {
		HomePage homePage= new HomePage();
		driver.get(ConfigurationReader.getProperty("url"));
		homePage.username.sendKeys("tester");//true username
		homePage.password.sendKeys("testtttt");//password wrong
		homePage.loginButton.click();
		Assert.assertTrue(homePage.errorMessage.isDisplayed());
	}
	
	@Test
	public void blankUsername() {
		HomePage homePage= new HomePage();
		driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");
		homePage.login("", "test");
		Assert.assertTrue(homePage.errorMessage.isDisplayed());
	}
	
	@Test
	public void blankPassword() {
		HomePage homePage= new HomePage();
		homePage.open();
		homePage.login("tester", "");
		Assert.assertTrue(homePage.errorMessage.isDisplayed());
	}
	
	@Test
	public void test() {
		HomePage homePage= new HomePage();
		Driver.getDriver().get("http://automationpractice.com/index.php");
		prestoHomePage.product("Blouse");
		
	}
	

	
	
}
