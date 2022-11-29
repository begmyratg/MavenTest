package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.TestBase;

public class FileUploadTest extends TestBase {
	
	@Test
	public void test() {
		driver.get("https://the-internet.herokuapp.com/upload");
		//locating choose file input
		WebElement chooseFile= driver.findElement(By.id("file-upload"));
		//creating string path where i want my file being uploaded.
		String path= "C:\\Users\\User\\Downloads\\dsd_a112.pdf";
		//sending the path to choosefile locator
		chooseFile.sendKeys(path);
		//clicking the download's locator
		driver.findElement(By.id("file-submit")).click();
		//verifying we did upload
		Assert.assertTrue(driver.findElement(By.xpath("//h3[.='File Uploaded!']")).isDisplayed());
	}

}
