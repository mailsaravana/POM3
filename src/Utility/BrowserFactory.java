package Utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {

	
		static WebDriver driver;
		
		public static WebDriver startBrowser(String browserName, String sUrl)
		{
			if(browserName.equals("Chrome"))
			{
				System.setProperty("webdriver.chrome.driver", "G:/selenium/chromedriver_win32/chromedriver.exe");
				driver=new ChromeDriver();
			}
			else if(browserName.equals("Firfox"))
			{
				System.setProperty("webdriver.gecko.driver", "G:/selenium/geckodriver/geckodriver.exe");
				driver=new FirefoxDriver();
			}
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get(sUrl);
			
			return driver;
			
			
		}
		
		
		
		
}
