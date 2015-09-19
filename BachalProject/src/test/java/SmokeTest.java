import org.junit.Test;


public class SmokeTest extends BaseTest
{
	HomePage homePage;
	@Test
	public void m1()
	{
		homePage=new HomePage(dr);
		MenPage menPage=homePage.clickMen().get();
		menPage.m1();
		MenProductDetailPage mdp=menPage.clickMenProduct();
	}

}
