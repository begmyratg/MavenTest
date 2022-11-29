package utilities;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Driver {
	
	private static WebDriver driver; //private because we dont want anyone to use this variable directly. 
	
	private Driver() {}// this is private contractor, and no one will be able to create driver
						// Driver driver=new Driver();NO
						//only Driver.getDriver();
	
	public static WebDriver getDriver() {
		if (driver==null) {
			String browser= ConfigurationReader.getProperty("browser");
			switch (browser) {
			case "chrome":
				WebDriverManager.chromedriver().setup();
				driver= new ChromeDriver();
				break;
			case "edge":
				WebDriverManager.edgedriver().setup();
				driver= new EdgeDriver();
				break;
			}
		}
		return driver;
	}
	
	
	
	public static void closeDriver() {// we have to create closeDriver method because driver is static
		if (driver!=null) {				//and it is not null, and try to give closed Webdriver. 
			driver.quit();				// Because we had in afterMethod() driver.quite();
			driver=null;
		}
	}
	
	//========this method making the driver null. Can use it+driver.quite, instead closeDriver============
	
//	public static WebDriver nullDriver() {
//		driver=null;
//		return driver;
//	}
}
