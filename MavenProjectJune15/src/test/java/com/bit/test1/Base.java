package com.bit.test1;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base
{
	 FirefoxDriver dr=new FirefoxDriver();
	@Before
	public void start()
	{
		
		dr.get("http://www.facebook.com");
		
	}
	@After
	public void end()
	{
		dr.quit();
		
	}

}
