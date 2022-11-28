package tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testBegmyrat {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		String uName="tomsmith";
		String uPass="SuperSecretPassword!";
		driver.findElement(By.id("username")).sendKeys(uName);
		driver.findElement(By.id("password")).sendKeys(uPass);
		driver.findElement(By.tagName("button")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//System.out.println(driver.findElement(By.xpath("//*[@id=\"content\"]/div/h2")).getText());
		System.out.println(driver.findElement(By.xpath("//h2[.=' Secure Area']")).getText());
		
		
		
		
		
		
	}
	
	

}
