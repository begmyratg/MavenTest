package tests;


import org.junit.Test;

import utilities.ConfigurationReader;

public class LoginTestWithProperties {
	
	@Test
	public void readPropertyTest() {
		String browser=ConfigurationReader.getProperty("url");
		
		System.out.println(browser);
	}

}
