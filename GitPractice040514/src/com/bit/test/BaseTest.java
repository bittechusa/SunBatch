package com.bit.test;

import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest
{
	
	static FirefoxDriver dr =new FirefoxDriver();
	public static void main(String[] args)
	{
		start();
	}
	public static void start()
	{
		dr.get("http://www.bluefly.com");
		dr.quit();
	}
	

}
