import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class Header
{
	FirefoxDriver dr;
	@FindBy(how=How.XPATH, using="html/body/div[4]/header/section[3]/div/nav/ul/li[1]/a")
	WebElement theMenLink;
 public	Header(FirefoxDriver dr){
		this.dr = dr;
		PageFactory.initElements(dr, this);
	}

}
