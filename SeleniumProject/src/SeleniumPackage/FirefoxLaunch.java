package SeleniumPackage;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class FirefoxLaunch
{
		
	public static void main(String[] args) 
	{
	
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.amazon.in");
		
		//System.setProperty("webdriver.Firefox.Driver", "C:\\Selenium\\geckodriver-v0.20.0-win32\\geckodriver.exe");
		
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"//Drivers//geckodriver.exe");
		FirefoxDriver driver1=new FirefoxDriver();
		driver1.get("https://www.flipkart.com");
		
		System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"//Drivers//IEDriverServer.exe");
		InternetExplorerDriver driver2=new InternetExplorerDriver();
		driver2.get("http://www.ebay.com");
		
		

	}

}
