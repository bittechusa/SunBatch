package com.read.data;
import java.io.File;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;


public class BaseClass 
{
	public WebDriver driver; 

	@Before
	public void browserOpen()
	{
	
		FirefoxBinary fb = new FirefoxBinary(new File("C:\\Program Files (x86)\\MozillaFirefox16\\firefox.exe"));
		driver = new FirefoxDriver(fb,null);
		driver.manage().window().maximize();
	  driver.get("http://www.facebook.com");
		
		
	}
	
	@After
	public void browserClose()
	{
		//driver.quit();
		
	}

}
