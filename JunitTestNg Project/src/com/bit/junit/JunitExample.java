package com.bit.junit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class JunitExample 
{
	
	@Ignore
	@Test
	public void moga2()
	{
		System.out.println("Hello Moga2");
	}
	
	@Before
	public void before()
	{
		System.out.println("Hello before");
	}
	
	@Test
	public void moga1()
	{
		System.out.println("Hello Moga1");
	}
	
	@After
	public void shesh()
	{
		System.out.println("Hello Shesh");
	}
	
	@BeforeClass
	public static void classerProthome()
	{
		System.out.println("Hello Before class");
	}
	
	@AfterClass
	public static void classerShesh()
	{
		System.out.println("Hello After class");
	}

	
}
