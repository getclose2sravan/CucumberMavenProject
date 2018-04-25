package stepDefinitions;

import cucumber.TestContext;
import cucumber.api.java.en.When;
import pageObjects.LoginPage;

public class LoginPageSteps {
	TestContext testContext;
	LoginPage loginPage;
	
	public LoginPageSteps(TestContext context) {
		testContext = context;
		loginPage = testContext.getPageObjectManager().getLoginPage();
	}
	
	@When("^provides the \"([^\"]*)\" and \"([^\"]*)\" to login$")
	public void provides_the_and_to_login(String username, String password) throws Throwable {
		loginPage.loginWithCredentials(username, password);
	}
}
