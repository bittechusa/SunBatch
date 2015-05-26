package com;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;




public class SmokeTest 
{
	//cross browsing or parallel using testng.xml file
	WebDriver dr;
	@Parameters("browser")
	@Test
	public void m1(String browser)
	{
//String s=System.getProperty("browser");
		
		if(browser.equals("f"))
		{
			dr=new FirefoxDriver();
			dr.get("http://www.facebook.com");
		}
		else if(browser.equals("mamo"))
				{
			
					System.setProperty("webdriver.chrome.driver", "C:/Users/bittech/Desktop/jarfile/chromedriver.exe");
					dr=new ChromeDriver();
		}
		else if(browser.equals("ie"))
		{
		System.setProperty("webdriver.ie.driver", "C:/Users/bittech/Desktop/jarfile/IEDriverServer.exe");
		dr=new InternetExplorerDriver();
		dr.get("http://www.facebook.com");
		}
		
	}
	

	}


