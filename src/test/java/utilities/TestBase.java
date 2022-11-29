package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public abstract class TestBase {
  
   protected WebDriver driver;
   protected SoftAssert softAssert;
   protected Actions actions;

//    @BeforeClass
//    public void setUpClass(){
//        WebDriverManager.chromedriver().setup();
//    }

    @Before
    public void setUpMethod(){
    driver=Driver.getDriver();
    actions= new Actions(driver);
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.manage().window().maximize();
    softAssert=new SoftAssert();
    }

    @After
    public void tearDownMethod() throws InterruptedException {
       Thread.sleep(3000);
       Driver.closeDriver();
      //driver.quit();
      //Driver.nullDriver();
      // softAssert.assertAll();
    }
    
    
    
}
