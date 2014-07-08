package com.espn.browsertests;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BaseTest 
{
	public WebDriver driver; 
	Properties mp = new Properties();
	@Before
	public void browserOpen() throws IOException, IOException
	{
		
		mp.load(new FileInputStream("config.properties"));
		if(System.getProperty("Browser").equals("IE"))
		{
			System.setProperty("webdriver.ie.driver", "C:/driver/IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			
		}
		else if(System.getProperty("Browser").equals("F"))
			driver = new FirefoxDriver();
		
		
	}
	
	@After
	public void browserClose()
	{
		driver.quit();
		
	}

}
