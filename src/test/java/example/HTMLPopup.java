package example;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HTMLPopup {
	WebDriver driver;

	@BeforeClass
	public void setUp() {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}

	@AfterClass
	public void leanUp() throws InterruptedException {
		Thread.sleep(5000);
		driver.quit();
	}
	
	@Test
	public void test1 () {
		driver.get("https://www.primefaces.org/showcase/ui/overlay/confirmDialog.xhtml");
		driver.findElement(By.xpath("//span[.='Confirm']")).click();
		driver.findElement(By.xpath("//span[.='No']")).click();
	}
	
	@Test
	public void oppsTest () throws InterruptedException {
		driver.get("https://sweetalert.js.org/");
		driver.findElement(By.xpath("(//button [@class='preview'])[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[.='OK']")).click();
	}
	
	
	
	
}
