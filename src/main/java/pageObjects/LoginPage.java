package pageObjects;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class LoginPage {
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.ID, using = "lnkGotoAllPortal")
	private WebElement lnkGotoAllPortal;
	
	@FindBy(how = How.ID, using = "txt_username")
	private WebElement txt_username;
	
	@FindBy(how = How.ID, using = "txt_password")
	private WebElement txt_password;
	
	@FindBy(how = How.ID, using = "btn_submit")
	private WebElement btn_submit;
	
	@FindBy(how = How.ID, using = "hpForgetPassword")
	private WebElement ForgetPassword;
	
	public void clickLoginButton() {
		btn_submit.click();
	}
	
	public void loginWithCredentials(String username, String password) {
		txt_username.sendKeys(username);
		txt_password.sendKeys(password);
		clickLoginButton();
	}
	
}
