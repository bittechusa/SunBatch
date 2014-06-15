package com.bit.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest
{
	
	static FirefoxDriver dr =new FirefoxDriver();
	public static void main(String[] args) throws Exception
	{
		start();
	}
	public static void start() throws Exception
	{
		dr.get("http://www.bluefly.com");
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		System.out.println(dr.getTitle());
		boolean b=dr.getPageSource().contains("bluefly");
		System.out.println(b);
		System.out.println(dr.getTitle().contains("Bluefly"));
		Thread.sleep(3000);
		dr.quit();
	}
	
}
