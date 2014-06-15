package com.bit.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest
{
	
	static FirefoxDriver dr =new FirefoxDriver();
	public static void main(String[] args) throws InterruptedException
	{
		start();
	}
	public static void start() throws InterruptedException 
	{
		dr.get("http://www.bluefly.com");
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		System.out.println(dr.getTitle());
		
		Thread.sleep(3000);
		
		dr.quit();
	}
	

}
