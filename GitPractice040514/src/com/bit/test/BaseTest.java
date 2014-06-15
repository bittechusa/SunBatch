package com.bit.test;

import java.util.concurrent.TimeUnit;

<<<<<<< HEAD
import org.openqa.selenium.By;
=======
>>>>>>> b8e9c72f3ee0b984553d4a6558272d4f4953a8c7
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest
{
	
	static FirefoxDriver dr =new FirefoxDriver();
<<<<<<< HEAD
<<<<<<< HEAD
	public static void main(String[] args) throws Exception
	{
		start();
	}
	public static void start() throws Exception
=======
	public static void main(String[] args) throws InterruptedException
	{
		start();
	}
	public static void start() throws InterruptedException 
>>>>>>> 268903e75bc505c437eedf860c028b8e25f9a6dc
=======
	public static void main(String[] args) throws Throwable
	{
		start();
	}
	public static void start() throws Exception 
<<<<<<< HEAD
>>>>>>> b8e9c72f3ee0b984553d4a6558272d4f4953a8c7
=======
>>>>>>> 9e5605d846bc0f26b3d82b4325c53ed556fb8867
>>>>>>> 268903e75bc505c437eedf860c028b8e25f9a6dc
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
<<<<<<< HEAD
		System.out.println(dr.getTitle().contains("Bluefly"));
=======
		System.out.println(dr.getTitle().contains("bluefly"));
>>>>>>> b8e9c72f3ee0b984553d4a6558272d4f4953a8c7
		Thread.sleep(3000);
>>>>>>> 9e5605d846bc0f26b3d82b4325c53ed556fb8867
		dr.quit();
	}
	
}
