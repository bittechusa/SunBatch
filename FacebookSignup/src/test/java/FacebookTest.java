import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class FacebookTest 
{
	FirefoxDriver dr=new FirefoxDriver();
	@Before
	public void start() throws Exception
	{
		dr.get("http://www.facebook.com");
		dr.manage().window().maximize();
		Thread.sleep(5000);
		
	}
	@Test
	public void test1()
	{
		dr.findElement(By.xpath(".//*[@id='u_0_1']")).sendKeys("Mahamudul");
		dr.findElement(By.xpath(".//*[@id='u_0_3']")).sendKeys("Hasan");
		dr.findElement(By.xpath(".//*[@id='u_0_5']")).sendKeys("mhasan4796@hotmail.com");
		dr.findElement(By.xpath(".//*[@id='u_0_8']")).sendKeys("mhasan4796@hotmail.com");
		dr.findElement(By.xpath(".//*[@id='u_0_a']")).sendKeys("102030mh");
		new Select (dr.findElement(By.xpath(".//*[@id='month']"))).selectByVisibleText("Mar");
		new Select(dr.findElement(By.xpath(".//*[@id='day']"))).selectByVisibleText("15");
		new Select(dr.findElement(By.xpath(".//*[@id='year']"))).selectByVisibleText("1992");
		dr.findElement(By.xpath(".//*[@id='u_0_e']")).click();
		dr.findElement(By.xpath(".//*[@id='u_0_i']")).click();
		
	}
	
	
	@After
	public void end()
	{
		dr.quit();
	}
}
