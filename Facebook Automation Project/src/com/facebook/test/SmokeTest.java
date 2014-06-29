package com.facebook.test;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SmokeTest 		
{
	public static void main(String[] args)
	{
	FirefoxDriver ms=new FirefoxDriver();
	ms.get("http://www.facebook.com");
	ms.findElement(By.name("firstname")).sendKeys("Fariha");
	ms.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Firoz");
	ms.findElement(By.id("u_0_5")).sendKeys("suchifiroz@yahoo.com");
	ms.findElement(By.xpath("//input[@id='u_0_8']")).sendKeys("suchifiroz@yahoo.com");
	ms.findElement(By.id("u_0_a")).sendKeys("12345");
	new Select(ms.findElement(By.id("month"))).selectByVisibleText("Apr");
	new Select(ms.findElement(By.id("day"))).selectByVisibleText("29");
	new Select(ms.findElement(By.id("year"))).selectByVisibleText("1983");
	ms.findElement(By.id("u_0_e")).click();
	ms.findElement(By.id("u_0_i")).click();
	//ms.quit();
		
	}

}
