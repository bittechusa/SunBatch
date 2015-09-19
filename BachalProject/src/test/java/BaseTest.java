import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest
{
	FirefoxDriver dr;
	
	@Before
	public void start(){
		dr = new FirefoxDriver();
		dr.get("http://www.eshopper24.com");
		dr.manage().window().maximize();
	}
	@After
	public void end() throws InterruptedException{
		dr.quit();
		Thread.sleep(5000);
	}

}
