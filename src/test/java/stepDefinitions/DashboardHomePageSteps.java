package stepDefinitions;

import org.openqa.selenium.By;

import cucumber.TestContext;
import cucumber.api.java.en.Then;
import pageObjects.DashboardHomePage;

public class DashboardHomePageSteps {
	TestContext testContext;
	DashboardHomePage dashboardHomePage;
	
	public DashboardHomePageSteps(TestContext context) {
		testContext = context;
		dashboardHomePage = testContext.getPageObjectManager().getDashboardHomePage();
	}
	
	@Then("^user should be able to login with valid credentials$")
	public void user_should_be_able_to_login_with_valid_credentials() throws Throwable {
		dashboardHomePage.linkLogoutisDisplayed();
	}
}
