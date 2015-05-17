import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class LoopA {
	
	@Test 
	public void m1()
	{
		FirefoxDriver dr= new FirefoxDriver();
		
		dr.get("http://www.eshopper.com");
		int a=dr.findElements(By.xpath("html/body/div[4]/header/section[3]/div/nav/ul/li")).size();
		dr.findElement(By.xpath("html/body/div[4]/header/section[3]/div/nav/ul/li[1]"));
			for (int i= 1; i<=a; i++)
			{
			WebElement ele= dr.findElement(By.xpath("html/body/div[4]/header/section[3]/div/nav/ul/li["+1+"]/a"));
			Actions a1 = new Actions(dr); 
			a1.moveToElement(ele).perform();
			int s=dr.findElements(By.xpath("html/body/div[4]/header/section[3]/div/nav/ul/li[1]/div/div[1]/ul/li")).size();
			
			for (int j=1; j<=s; j++)
			{
				Actions a2 = new Actions(dr); 
				a2.moveToElement(ele).perform();
				dr.findElement(By.xpath("html/body/div[4]/header/section[3]/div/nav/ul/li[1]/div/div[1]/ul/li["+i+ "]/a"));
			}
			//dr.findElement(By.xpath("html/body/div[4]/header/section[3]/div/nav/ul/li["+ i +"]/a")).click();
		}
	
		
	}
	
}
