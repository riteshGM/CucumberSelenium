package StepDefinations;

import org.openqa.selenium.WebDriver;

import drivers.WebDriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class LoginDemoSteps {


	WebDriver driver = null;
	LoginPage loginPageObj = new LoginPage();
	@Given("browser is open")
	public void browser_is_open() {

		System.out.println("Inside Step - browser is open");
		driver = WebDriverFactory.getDriver();

	}

	@And("user is on login page")
	public void user_is_on_login_page() {
		//Move this URL to Config Properties
		loginPageObj.navigateTOurl("https://example.testproject.io/web/");

	}
	/**
	 * Scenario Outline Step Example How we use the parameters in our Selenium Code
	 * @param username
	 * @param password
	 * @throws InterruptedException
	 */
	@When("^user enters (.*) and (.*)$")
	public void user_enters_username_and_password(String username, String password) throws InterruptedException  {
		loginPageObj.enterCredentials(username,password);
		Thread.sleep(2000);
	}

	@And("user clicks on login")
	public void user_clicks_on_login() {
		loginPageObj.clickLogin();
	}


	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() throws InterruptedException {
		loginPageObj.verifyLogoutBtnDisplayed();
		Thread.sleep(2000);	
	}
}
