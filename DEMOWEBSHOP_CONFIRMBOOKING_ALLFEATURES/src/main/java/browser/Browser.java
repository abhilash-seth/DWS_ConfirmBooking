package browser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Browser {
	public static WebDriver driver;
	public static WebDriverWait wait;
	
	//Chrome WebDriver Setup
		public static WebDriver setDriver()
		{
			String driverPath = System.getProperty("user.dir") + "\\Drivers\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", driverPath);
			driver = new ChromeDriver();
			return driver;
		}
		
		//Url Setup Method
		public static void getUrl(String url)
		{
			driver.get(url);
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		}
		
		//Driver CLose Method
		public static void closeBrowser()
		{
			driver.close();
		}

}