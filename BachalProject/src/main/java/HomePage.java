import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class HomePage {

	FirefoxDriver dr;
	@FindBy(how=How.XPATH, using="html/body/div[4]/header/section[3]/div/nav/ul/li[1]/a")
	WebElement theMenLink;
 public	HomePage(FirefoxDriver dr){
		this.dr = dr;
		PageFactory.initElements(dr, this);
	}
	
	public MenPage clickMen(){
		theMenLink.click();
		System.out.println("Men page clicked from HomePage");
		
		return new MenPage(dr);
	}
}
