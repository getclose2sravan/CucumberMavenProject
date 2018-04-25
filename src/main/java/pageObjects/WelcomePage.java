package pageObjects;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import managers.FileReaderManager;

public class WelcomePage {
	WebDriver driver;
	public WelcomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.ID, using = "lnkOrgPortal")
	private WebElement lnkOrgPortal;
	
	@FindBy(how = How.ID, using = "lnkCareerPortal")
	private WebElement lnkCareerPortal;
	
	@FindBy(how = How.ID, using = "lnkCandidatePortal")
	private WebElement lnkCandidatePortal;
	
	@FindBy(how = How.ID, using = "lnkAgencyPortal")
	private WebElement lnkAgencyPortal;
	
	public void clickOrganisationPortal() {
		lnkOrgPortal.click();
	}
	public void getWelcomePage() {
		driver.get(FileReaderManager.getInstance().getConfigFileReader().getUrl());
	}
}
