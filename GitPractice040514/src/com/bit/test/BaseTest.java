package com.bit.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest
{
	
	static FirefoxDriver dr =new FirefoxDriver();
<<<<<<< HEAD
	public static void main(String[] args) throws InterruptedException
	{
		start();
	}
	public static void start() throws InterruptedException 
=======
	public static void main(String[] args) throws Throwable
	{
		start();
	}
	public static void start() throws Exception 
>>>>>>> 9e5605d846bc0f26b3d82b4325c53ed556fb8867
	{
		dr.get("http://www.bluefly.com");
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		System.out.println(dr.getTitle());
<<<<<<< HEAD
		
		Thread.sleep(3000);
		
=======
		boolean b=dr.getPageSource().contains("bluefly");
		System.out.println(b);
		System.out.println(dr.getTitle().contains("bluefly"));
		Thread.sleep(3000);
>>>>>>> 9e5605d846bc0f26b3d82b4325c53ed556fb8867
		dr.quit();
	}
	

}
