package com.bit.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class B 
{
	@Test
	public void moga3()
	{
		System.out.println("Hello moga3");
	}
	@Ignore
	@Test
	public void moga5()
	{
		System.out.println("Hello moga5");
	}
	
	@Test
	public void moga6()
	{
		System.out.println("Hello Bangladesh");
	}
	@Before
	public void before()
	{
		System.out.println("I want to see world cup football 2014");
	}
	@After
	public void after()
	{
		System.out.println("Finally i like Brazil");
	}
	@BeforeClass
	public static void bef()
	{
		System.out.println("BeforeClass");
		
	}
	@AfterClass
	public static  void afc()
	{
		System.out.println("AfterClass");
	}

}
