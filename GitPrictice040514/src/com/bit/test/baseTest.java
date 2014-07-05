package com.bit.test;

import org.openqa.selenium.firefox.FirefoxDriver;

public class baseTest
{
	FirefoxDriver dr = new FirefoxDriver();
	public static void main(String[] args)
		{
		start();
		
		
		
		}
	public void start()
		{
		dr.get("http://www.bluefly.com");
		dr.quit();
	
	
		}
}
