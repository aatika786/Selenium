package SeleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BasesPage extends webdriver
{

	public static void main(String[] args) throws Exception 
	{
		
		browserLaunch(getData("browser"),getData("url"));
		
		driver.manage().window().maximize();
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
	
		driver.manage().deleteAllCookies();
		
		//driver.navigate().back();
		
		//Thread.sleep(2000);
		
		//driver.navigate().forward();
		
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		
		/*for(int i=1;i<10;i++)
		{
		((RemoteWebDriver)driver).executeScript("window.scrollBy(0,100)");
		Thread.sleep(2000);
		}*/
		
		driver.findElement(By.id("loginsubmit")).click();
		
		Thread.sleep(2000);
		
		
		driver.quit();
		
		
		//driver.quit();all the windows will be closed
		
		//driver.close();it will close only current window
		
	}

}
