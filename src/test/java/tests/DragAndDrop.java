package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utilities.TestBase;

public class DragAndDrop extends TestBase {

	@Test
	public void dragAndDrop() throws InterruptedException {
		driver.get("https://demoqa.com/droppable/");
		
		WebElement source= driver.findElement(By.id("draggable"));//the thing to drag
		WebElement target= driver.findElement(By.id("droppable"));//where to drop	
		actions.dragAndDrop(source, target).perform();
		//doing all action without dragAndDrop()method
		actions.clickAndHold(source).moveToElement(target).release().perform();
		
	}
}
