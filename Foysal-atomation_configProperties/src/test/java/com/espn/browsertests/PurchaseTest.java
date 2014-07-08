package com.espn.browsertests;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.junit.Test;
import org.openqa.selenium.By;

public class PurchaseTest extends BaseTest
{
	

	@Test
	public void purchase() throws IOException
	{
		
		driver.get(mp.getProperty("url"));
	}
	@Test
	public void signup() throws IOException, Exception
	{
		driver.get(mp.getProperty("fburl"));
		driver.findElement(By.id("u_0_1")).sendKeys(mp.getProperty("fname"));
		Thread.sleep(2000);
		driver.findElement(By.id("u_0_3")).sendKeys(mp.getProperty("lname"));
		Thread.sleep(2000);
	}

}
