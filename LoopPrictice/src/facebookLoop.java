import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class facebookLoop {

	FirefoxDriver dr=new FirefoxDriver(); 
	@Test 
	public void m1() 
	{
		dr.get("http:www.facebook.com");
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Select s= new Select(dr.findElement(By.id("month")));
		//s.selectByVisibleText("Jan");
		int size = s.getOptions().size();
		
	}
	
	
	
	
	
	
	
}
