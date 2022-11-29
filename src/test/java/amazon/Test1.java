package amazon;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Test1 extends Locators {
	WebDriver driver;
	@BeforeClass
	public void before() {
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://amazon.com");
		PageFactory.initElements(driver, this);
	}

	@Test
	public void searchBarTestClick() {
		searchBar.clear();
		searchBar.sendKeys("iphone"+Keys.ENTER);
		searchButton.click();
		
	}
	@Test
	public void searchBarTestEnter() {
		searchBar.clear();
		searchBar.sendKeys("apple"+Keys.ENTER);
	}


	@AfterClass
	public void after() throws InterruptedException {
		Thread.sleep(4000);
		driver.close();
	}

}
