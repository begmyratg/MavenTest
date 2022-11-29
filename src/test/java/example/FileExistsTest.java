package example;

import org.testng.annotations.Test;

public class FileExistsTest {
	
	@Test
	public void test () {
		String current= System.getProperty("user.dir");
		System.out.println(current);
	
	
	String userFolder= System.getProperty("user.home");
	System.out.println(userFolder);
	}

}
