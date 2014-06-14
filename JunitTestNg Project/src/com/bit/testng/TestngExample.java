package com.bit.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestngExample 
{
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Hello beforeClass");
		
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("Hello After class");
	}
	
	@Test(priority=2)
	public void foysal2()
	{
		System.out.println("Hello foysal2");
	}
	
	@Test(groups = { "smoke" })
	public void foysal3()
	{
		System.out.println("Hello foysal3");
	}
	
	@Test
	public void foysal4()
	{
		System.out.println("Hello foysal4");
	}
	
	@Test
	public void foysal5()
	{
		System.out.println("Hello foysal5");
	}
	
	@Test
	public void foysal6()
	{
		System.out.println("Hello foysal6");
	}
	
	@Test(groups = { "smoke" })
	public void foysal7()
	{
		System.out.println("Hello foysal7");
	}
	
	@Test
	public void foysal8()
	{
		System.out.println("Hello foysal8");
	}
	
	@Test
	public void foysal9()
	{
		System.out.println("Hello foysal9");
	}
	
	@Test
	public void foysal10()
	{
		System.out.println("Hello foysal10");
	}
	
	
	@BeforeMethod(groups = { "smoke" })
	public void beforeMethod()
	{
		System.out.println("Hello beforeMethod");
	}
	
	@AfterMethod(groups = { "smoke" })
	public void afterMethod()
	{
		System.out.println("Hello afterMethod");
	}

}
