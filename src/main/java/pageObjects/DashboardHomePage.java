package pageObjects;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class DashboardHomePage {
	
	public DashboardHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.ID, using = "lnkLogout")
	private WebElement lnkLogout;
	
	@FindBy(how = How.ID, using = "ManageJobs")
	private WebElement JobMenu;
	
	public void linkLogoutisDisplayed() {
		lnkLogout.isDisplayed();		
	}
	
		
}
