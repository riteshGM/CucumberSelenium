package runnerclasses;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

/**
 * Both of these Annotations Needs Junit Dependency to be Added in POM.xml
 * @author rites
 *
 */
@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resources/Features", 
		glue = {"StepDefinations"},
		monochrome = true,
//plugin = {"pretty","html:target/HTMLReport/report.html",
//		"json:target/JSONReport/report.json",
//		"junit:target/XMLReport/report.xml"},
		plugin = {"pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
//		tags = ("@LoginDemo_PF")
		)
public class CucumberRunnerClass {

}
