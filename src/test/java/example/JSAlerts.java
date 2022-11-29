package example;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JSAlerts {

	WebDriver driver;

	@BeforeClass
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}

	@AfterClass
	public void leanUp() throws InterruptedException {
		Thread.sleep(5000);
		//driver.quit();
	}
	
	@Test
	public void oppsTest() throws InterruptedException {
		driver.get("https://sweetalert.js.org/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//button [@class='preview'])[1]")).click();
		Thread.sleep(5000);
		Alert alert= driver.switchTo().alert();//create Alert object
		alert.accept();//----to OK
				
	}
	
	
	
}
