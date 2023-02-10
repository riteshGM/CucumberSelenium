package StepDefinations;

import org.openqa.selenium.WebDriver;

import drivers.WebDriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage_PF;

public class LoginDemoSteps_PF {


	WebDriver driver = null;
	LoginPage_PF loginPageObj = new LoginPage_PF();
	@Given("browser is open_PF")
	public void browser_is_open_PF() {

		System.out.println("Inside Step - browser is open");
		driver = WebDriverFactory.getDriver();

	}

	@And("user is on login page_PF")
	public void user_is_on_login_page_PF() {
		//Move this URL to Config Properties
		loginPageObj.navigateTOurl("https://example.testproject.io/web/");

	}
	/**
	 * Scenario Outline Step Example How we use the parameters in our Selenium Code
	 * @param username
	 * @param password
	 * @throws InterruptedException
	 */
	@When("^user enters (.*) and (.*)_PF$")
	public void user_enters_username_and_password_PF(String username, String password) throws InterruptedException  {
		loginPageObj.enterCredentials(username,password);
		Thread.sleep(2000);
	}

	@And("user clicks on login_PF")
	public void user_clicks_on_login_PF() {
		loginPageObj.clickLogin();
	}


	@Then("user is navigated to the home page_PF")
	public void user_is_navigated_to_the_home_page_PF() throws InterruptedException {
		loginPageObj.verifyLogoutBtnDisplayed();
		Thread.sleep(2000);	
	}
}
