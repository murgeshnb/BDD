package util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyFile {
	public String getProperty(String key) throws IOException
	{
		FileInputStream fis=new FileInputStream(".\\src\\main\\java\\property.properties");
		Properties po=new Properties();
		po.load(fis);
		String browser = po.getProperty(key);
		return browser;
	}

}
