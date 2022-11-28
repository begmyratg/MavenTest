package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
	
	private static Properties properties;

	static {
		String path = "configuration.properties";

		try {
					// java cannot read files directly, it needs inputStream to read.
					// inputstream takes the location of the file as a constructor
			FileInputStream fileInputStream = new FileInputStream(path);
					// properties is used to read specifically properties files, files with
					// key-value pairs
			properties = new Properties();
					// file contents are load properties from the inputStream
			properties.load(fileInputStream);
					// all input streams must be closed
			fileInputStream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static String getProperty(String property) {
		return properties.getProperty(property);
	}
	
	
	
	
}
