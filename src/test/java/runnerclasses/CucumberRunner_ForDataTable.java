package runnerclasses;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resources/Features", 
		glue = {"StepDefinations"},
		monochrome = true,
		plugin = {"pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
		tags = ("@DataTable")
		//dryRun = true
		)
public class CucumberRunner_ForDataTable {

}
