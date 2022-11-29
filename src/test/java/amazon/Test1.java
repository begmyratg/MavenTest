package amazon;

import java.time.Duration;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import io.github.bonigarcia.wdm.WebDriverManager;


public class Test1 extends Locators {
	WebDriver driver;
	@Before
	public void before() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://amazon.com");
		PageFactory.initElements(driver, this);
	}

	@Test
	public void searchBarTestClick() {
		searchBar.sendKeys("iphone");
		searchButton.click();
		
	}
	@Test
	public void searchBarTestEnter() {
		searchBar.sendKeys("apple"+Keys.ENTER);
	}


	@After
	public void after() throws InterruptedException {
		Thread.sleep(4000);
		driver.close();
	}

}
