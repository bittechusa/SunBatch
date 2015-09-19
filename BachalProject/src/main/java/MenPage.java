import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.LoadableComponent;

public class MenPage extends LoadableComponent<MenPage>
{

	FirefoxDriver dr;
	MenPage(FirefoxDriver dr){
		this.dr = dr;
	}
	public void m1 ()
	{
		System.out.println("men");
	}
	public MenProductDetailPage clickMenProduct()
	{
		dr.findElement(By.xpath(".//*[@id='slotMcolMain1']/div/div[2]/ul/li[1]/a/div/img")).click();
		return new MenProductDetailPage();
	}
	@Override
	protected void load() {
		// TODO Auto-generated method stub
		dr.get("http://www.bluefly.com/a/men-clothing-shoes-accessories");
		Header hp=new Header(dr);
		
	}
	@Override
	protected void isLoaded() throws Error {
		// TODO Auto-generated method stub
		
	  Assert.assertTrue(dr.getCurrentUrl().equals("http://www.bluefly.com/a/men-clothing-shoes-accessories"));
	  Header hp=new Header(dr);
	}
	

}
