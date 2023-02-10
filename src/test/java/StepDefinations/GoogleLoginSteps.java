package StepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import drivers.WebDriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleLoginSteps {
	
	WebDriver driver = null;
	
	@Given("browser is loaded")
	public void browser_is_loaded() {
		driver = WebDriverFactory.getDriver();

	}

	@Given("user is on google search page")
	public void user_is_on_google_search_page() {
		driver.navigate().to("http://www.google.com");
	}

	@When("user enters search text")
	public void user_enters_search_text() {
		driver.findElement(By.name("q")).sendKeys("Automation Step By Step");
	}

	@When("user hits search button")
	public void user_hits_search_button() {
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}

	@Then("user is navigated to search results page")
	public void user_is_navigated_to_search_results_page() {
		driver.getPageSource().contains("Online Courses");
		//driver.quit();
	}

}
