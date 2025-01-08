package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(

		features = { "src/test/java/Features/SignUp.Feature/" }, 
		dryRun = !true,
		glue = { "StepsDef","Hooks"},
		snippets = SnippetType.CAMELCASE, 
		monochrome = true,
		plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        tags= "@smoke"
)

public class Runners extends AbstractTestNGCucumberTests {

}
