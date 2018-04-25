package stepDefinitions;

import cucumber.TestContext;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import managers.FileReaderManager;

public class Hooks {
	TestContext testContext;
	public Hooks(TestContext context) {
		testContext = context;
	}
	
	@Before
	public void BeforeSteps() {
		testContext.getWebDriverManager().getDriver().get(FileReaderManager.getInstance().getConfigFileReader().getUrl());
	}
	
	@After
	public void AfterSteps() {
		testContext.getWebDriverManager().CloseDriver();
	}
}
