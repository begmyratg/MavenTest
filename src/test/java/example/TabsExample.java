package example;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TabsExample {
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
		Thread.sleep(20000);
		driver.quit();
	}

	@Test
	public void changeTab() {
		driver.get("http://the-internet.herokuapp.com/windows");
		// print size of all opened widnows
		System.out.println(driver.getWindowHandles().size());
		// print string Id of current window
		System.out.println(driver.getWindowHandle());
		driver.findElement(By.linkText("Click Here")).click();
		// change to the new tab(2) using Set of String--Set is just like Array list,
		// but No dublicate and No get() method.
		Set<String> windowHandles = driver.getWindowHandles();
		// looping to switch to very new opened window
		for (String handle : windowHandles) {
			System.out.println(handle);
			driver.switchTo().window(handle);
			if (driver.getTitle().equals("New Window")) {
				break;
			}
		}
		Assert.assertEquals(driver.getTitle(), "New Window");
		Assert.assertNotEquals(driver.getTitle(), "The Internet");
	}

	@Test
	public void changeTab2() {
		driver.get("https://www.w3schools.com/html/");

		driver.findElement(By.linkText("Try it Yourself »")).click();
		Set<String> list = driver.getWindowHandles();
		System.out.println(list.size());
		for (String handle : list) {
			
			driver.switchTo().window(handle);
			
			if (driver.getTitle().equals("W3Schools Tryit Editor")) {
			System.out.println(driver.getTitle());
			break;
			}
		}	
			System.out.println(driver.getTitle());
			Assert.assertTrue(driver.getCurrentUrl().contains("default"));
	}

}
