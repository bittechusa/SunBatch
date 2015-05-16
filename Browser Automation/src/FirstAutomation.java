import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;


public class FirstAutomation 
{
	

	public static void main(String[] args) 
	{
		FirefoxDriver x = new FirefoxDriver();
		x.get("https://www.facebook.com");
		
		x.findElement(By.xpath(".//*[@id='u_0_1']")).sendKeys("Sharmin");
		
		
		
		
		
		
		

	}

}
