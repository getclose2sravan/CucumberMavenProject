package runners;
import org.junit.runner.RunWith;
import org.junit.runners.*;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		format= {"pretty"},
		features ="src/test/resources/functionalTests",
		glue= {"stepDefinitions"}
		)
public class TestRunner {
	

}
