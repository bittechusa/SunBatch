import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class DataDrivenTesting
{/*
	@DataProvider(name="Auth")
	public Object [][] m1()
	{
		return new Object[][]{{"shahidul","1234"},{"asad","12345"}};
	}
	
	@Test(dataProvider="Auth")
	public void getData(String x,String y)

	{
		FirefoxDriver dr=new FirefoxDriver();
		dr.get("http://www.facebook.com");
		dr.findElement(By.id("email")).sendKeys(x);
		dr.findElement(By.id("pass")).sendKeys(y);
		dr.quit();
	}
	@Test(dataProvider="Auth")
	public void getData1(String x,String y)

	{
		FirefoxDriver dr=new FirefoxDriver();
		dr.get("http://www.facebook.com");
		dr.findElement(By.id("email")).sendKeys(x);
		dr.findElement(By.id("pass")).sendKeys(y);
		dr.quit();
	}*/
	@Test()
	public void login()
	{
		FirefoxDriver dr=new FirefoxDriver();
		dr.get("http://www.facebook.com");
		dr.findElement(By.id("emil")).sendKeys("x");
		dr.findElement(By.id("pass")).sendKeys("y");
		dr.quit();
	}
	@Test(dependsOnMethods={"login"})
	public void logout()
	{
		System.out.println("logout");
	}

}
