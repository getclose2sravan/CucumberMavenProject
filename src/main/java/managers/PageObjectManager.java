package managers;

import org.openqa.selenium.WebDriver;
import pageObjects.DashboardHomePage;
import pageObjects.WelcomePage;
import pageObjects.LoginPage;


public class PageObjectManager {
	
	private WebDriver driver;
	private WelcomePage welcomePage;
	private LoginPage loginPage;
	private DashboardHomePage dashboardHomePage;
	
	public PageObjectManager(WebDriver driver) {
		this.driver = driver;		
	}
	
	public WelcomePage getWelcomePage() {
		return (welcomePage == null) ? welcomePage = new WelcomePage(driver) : welcomePage;
	}
	
	public LoginPage getLoginPage() {
		return (loginPage == null) ? loginPage = new LoginPage(driver) : loginPage;
	}
	
	public DashboardHomePage getDashboardHomePage() {
		return (dashboardHomePage == null) ? dashboardHomePage = new DashboardHomePage(driver) : dashboardHomePage;
	}

}
