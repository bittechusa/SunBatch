package com.git.test;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTestGit 
{
	static FirefoxDriver fdr=new FirefoxDriver();
	
	@BeforeClass
	public static void test1()
	{
		fdr.get("http://www.bluefly.com");
		
	}
	@AfterClass
	public static void test2()
	{
		fdr.quit();
		
	}

}
