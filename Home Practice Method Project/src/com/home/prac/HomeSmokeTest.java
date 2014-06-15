package com.home.prac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HomeSmokeTest 
{
	static FirefoxDriver ff=new FirefoxDriver();
	public static void main (String [] args) throws InterruptedException
	{
		ff.get("http://www.facebook.com");
		ff.manage().window().maximize();
		WebElement fname=ff.findElement(By.id("u_0_1"));
		WebElement lname=ff.findElement(By.id("u_0_3"));
		WebElement db=ff.findElement(By.id("month"));
		WebElement dbd=ff.findElement(By.id("day"));
		WebElement dby=ff.findElement(By.id("year"));
		WebElement fm=ff.findElement(By.xpath("//input[@id='u_0_d']"));
		
		
		
		
		
		
		HomeBasePrac hm=new HomeBasePrac();
		hm.typing(fname, "Onamika");
		hm.typing(lname, "Firoz");
		hm.select(db,"May");
		hm.select(dby, "2014");
		hm.select(dbd, "20");
		hm.click(fm);
		Thread.sleep(3000);
		ff.quit();
		
		FirefoxDriver ffd=new FirefoxDriver();
		ffd.get("http://www.macys.com");
		ffd.manage().window().maximize();
		WebElement we=ffd.findElement(By.xpath("//li[@id='flexLabel_22672']/a"));
		hm.mover(ffd, we);
		Thread.sleep(2000);
		hm.back(ffd);
		WebElement wf=ffd.findElement(By.xpath("//li[@id='flexLabel_1']/a"));
		hm.mover(ffd, wf);
		Thread.sleep(2000);
		hm.back(ffd);
		WebElement cl=ffd.findElement(By.xpath("//li[@id='flexLabel_13247']/a"));
		hm.click(cl);
		Thread.sleep(3000);
		
		
		
		
		
		
	}

}
