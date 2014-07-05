package com.bit.test1;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Smoke extends Base
{
	@Test
	public void signIn() throws Exception
	{
		
		dr.manage().window().maximize();
		dr.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Firoz");
		dr.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Uddin");
		dr.findElement(By.xpath("//input[@id='u_0_5']")).sendKeys("Firoz_1990@gmail.com");
		dr.findElement(By.xpath("//input[@id='u_0_8']")).sendKeys("Firoz_1990@gmail.com");
		dr.findElement(By.xpath("//input[@id='u_0_a']")).sendKeys("456hgf");
		new Select(dr.findElement(By.id("month"))).selectByVisibleText("Feb");
		new Select(dr.findElement(By.id("day"))).selectByVisibleText("19");
		new Select(dr.findElement(By.id("year"))).selectByVisibleText("1990");
		Thread.sleep(3000);
		dr.findElement(By.xpath("//input[@id='u_0_e']")).click();
		Thread.sleep(2000);
		//dr.findElement(By.xpath("//input[@id='u_0_i']")).click();
		
		
		
		
		
		
	}

}
