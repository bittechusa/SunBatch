package com.home.prac;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class HomeBasePrac
{
	public void typing(WebElement tp,String t)
	{
		tp.sendKeys(t);
	}
	public void select(WebElement se,String s)
	{
		new Select(se).selectByVisibleText(s);
	}
	public void click(WebElement cl)
	{
		cl.click();
	}
	public void mover(FirefoxDriver fdf,WebElement fd)
	{
		Actions oc=new Actions(fdf);
		oc.moveToElement(fd).perform();
	}
	public void back(FirefoxDriver bk)
	{
		bk.navigate().back();
	}
	

}
