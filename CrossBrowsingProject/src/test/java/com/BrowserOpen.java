package com;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeMethod;

//cross browsing from command line usin maven
public class BrowserOpen
{
	WebDriver dr;
	@BeforeMethod
	public void start()
	{
		String s=System.getProperty("browser");
		
		if(s.equals("najnin"))
		{
			dr=new FirefoxDriver();
		}
		else if(s.equals("mamo"))
				{
			
					System.setProperty("webdriver.chrome.driver", "C:/Users/bittech/Desktop/jarfile/chromedriver.exe");
					dr=new ChromeDriver();
		}
		else if(s.equals("master"))
		{
		System.setProperty("webdriver.ie.driver", "C:/Users/bittech/Desktop/jarfile/IEDriverServer.exe");
		dr=new InternetExplorerDriver();
		}
	}
	

}
