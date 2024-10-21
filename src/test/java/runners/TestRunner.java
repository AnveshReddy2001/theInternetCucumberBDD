package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "src/test/java/features",
		glue = {"stepDefinitions"},
		plugin = {"pretty", "html:target/cucmber-reports"},
		monochrome = true
		
		)


public class TestRunner extends AbstractTestNGCucumberTests{

}
