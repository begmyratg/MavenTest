package example;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HTMLPopup {
	WebDriver driver;

	@BeforeMethod
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}

	@AfterMethod
	public void leanUp() throws InterruptedException {
		Thread.sleep(5000);
		//driver.quit();
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