import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class MavenTest
{
	FirefoxDriver driver = new FirefoxDriver();
	
	
	
	@Before
	public void before()
	{
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		

	}
	@Test
	public void Test() throws Exception
	{
		driver.findElement(By.id("u_0_1")).sendKeys("touhid");
		Thread.sleep(3000);
		driver.findElement(By.id("u_0_3")).sendKeys("hossain");
		driver.findElement(By.id("u_0_5")).sendKeys("touhidhossain@ymail.com");
		driver.findElement(By.id("u_0_8")).sendKeys("touhidhossain@ymail.com");
		driver.findElement(By.id("u_0_a")).sendKeys("touhid123456");
		new Select(driver.findElement(By.id("month"))).selectByVisibleText("Apr");
		new Select(driver.findElement(By.id("day"))).selectByVisibleText("5");
		new Select(driver.findElement(By.id("year"))).selectByVisibleText("1985");
		driver.findElement(By.xpath("//input[@id='u_0_e']")).click();
		driver.findElement(By.xpath("//button[@id='u_0_i']")).click();
		
		
		
	}
	
	@After
	public void close()
	{
		driver.quit();
		
	}

}
