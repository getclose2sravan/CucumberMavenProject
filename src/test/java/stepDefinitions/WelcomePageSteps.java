package stepDefinitions;

import javax.net.ssl.HostnameVerifier;

import cucumber.TestContext;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import pageObjects.WelcomePage;

public class WelcomePageSteps {
	TestContext testContext;
	WelcomePage welcomePage;
	
	public WelcomePageSteps(TestContext context) {
		testContext = context;
		welcomePage = testContext.getPageObjectManager().getWelcomePage();
	}
	
	@Given("^user is on the home page$")
	public void user_is_on_the_home_page() throws Throwable {
		welcomePage.getWelcomePage();
	}
	@When("^User selects the \"([^\"]*)\" portal$")
	public void user_selects_the_portal(String portal) throws Throwable {
		welcomePage.clickOrganisationPortal();
	}
	
}
