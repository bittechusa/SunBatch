package com.git.test;

import java.util.concurrent.TimeUnit;

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
	public static void test2() throws InterruptedException
	{
		fdr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		System.out.println(fdr.getTitle());
		boolean b=fdr.getPageSource().contains("blufly");
		System.out.println(b);
		boolean c=fdr.getTitle().contains("BLUEFLY");
		System.out.println(c);
		Thread.sleep(3000);
		fdr.quit();
		
	}

}
