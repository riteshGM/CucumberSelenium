package StepDefinations;

import drivers.Driver;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.BeforeStep;
import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * This Class Contains Common Methods Which we want to run before and after enach Scenario or a Test Case
 * @author rites
 *
 */

public class BaseStep {
	@Before (order = 1)
	public void initBrowser() {
		//Driver.initDriver(url);
		System.out.println("Before Each Scneario Method Invoked : Order 1");
	}
	
	@Before(order = 0)
	/***
	 * 0 is Highest priority
	 */
	public void setup() {
		System.out.println("Before Each Scneario Method Invoked : Order 0");
	}

	@After
	public void afterEachScenario() {
		System.out.println("After Each Scenario Method is Invoked");
		Driver.quitDriver();
	}
	
	@BeforeAll
	public static void beforeAllScenarios() {
		System.out.println("This Method is Run before All Scenarios");
		WebDriverManager.chromedriver().setup();
	}
	
	@AfterAll
	public static void afterAllScenarios() {
		System.out.println("This Method is Run After All Scenarios");
	}
	
	@BeforeStep
	public void beforeEachStep() {
		System.out.println("This Method Runs before Each Step");
	}
	
	@AfterStep
	public void afterEachStep() {
		System.out.println("This Method Runs After Each Step");
	}
	
}
