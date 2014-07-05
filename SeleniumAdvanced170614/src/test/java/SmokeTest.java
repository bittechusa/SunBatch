import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;


public class SmokeTest 
{
	@Test
	public void screenshoot() throws Throwable
	{
		FirefoxDriver dr=new FirefoxDriver();
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		dr.get("http://test.jiatro.com/mhs/");
		File sf=((TakesScreenshot)dr).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(sf, new File("C:/Users/ridwan/Desktop/scs/shot1.png"), true);
		dr.close();
		
	}
	
	@Test
	public void multiwindow()
	{
		FirefoxDriver dr=new FirefoxDriver();
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		dr.get("http://abc.co.in/");
		dr.findElement(By.xpath("html/body/table/tbody/tr[11]/td/b/a")).click();
		//parent window handle
		String handle=dr.getWindowHandle();
		//all window handle
		Set<String> handles=dr.getWindowHandles();
		//loop to all window
		for(String h:handles)
		{
			if(!h.equals(handle))
			{
				dr.switchTo().window(h);
				
			}
		}
		
		
		
		
	}
	
	@Test
	public void getAttribute()
	{
		FirefoxDriver dr=new FirefoxDriver();
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		dr.get("http:www.facebook.com");
		String s=dr.findElement(By.xpath(".//*[@id='email']")).getAttribute("id");
		System.out.println(s);
	}
	
	@Test
	public void rightClick()
	{
		FirefoxDriver dr=new FirefoxDriver();
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		dr.get("http:www.google.com");
		WebElement e=dr.findElement(By.linkText("Business"));
		new Actions(dr).contextClick(e).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
		
		
	}
	

}
