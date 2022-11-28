package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example   {
	
	public static void main(String[] args) {
		
		System.out.println("Singleton: " + Singleton.get());////
		
		String one= Singleton.get();
		System.out.println("one: "+ one);
		System.out.println("====================================");
		
		System.out.println("Singleton: " + Singleton.get());////
		
		String two= Singleton.get();
		System.out.println("two: "+ two);
		
		System.out.println("Singleton: " + Singleton.get());
		
		
		
		
		
		
	}
		
}
