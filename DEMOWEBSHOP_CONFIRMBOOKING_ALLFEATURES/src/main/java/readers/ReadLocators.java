package readers;

import java.io.FileInputStream;
import java.util.Properties;

import browser.Browser;

public class ReadLocators extends Browser{
	
	public static String getData(String Name) throws Exception
	{
		String fileLocation = System.getProperty("user.dir") + "\\Application_Configuration\\locators.properties";
        FileInputStream fis = new FileInputStream(fileLocation);
        Properties prop = new Properties();
        prop.load(fis);
        return prop.getProperty(Name);
	}
}
