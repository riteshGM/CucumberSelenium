package StepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

	@Given("User is on Login Page")
	public void user_is_on_login_page() {
		System.out.println("Inside Step User is on Login Page");
	}

	@When("User enters UserName and Password")
	public void user_enters_user_name_and_password() {
		System.out.println("Inside User Enters User Name and Password");
	}

	@When("Clicks on Login Button")
	public void clicks_on_login_button() {
		System.out.println("User Clicks on Login Button");
	}

	@Then("User is Navigated to HomePage")
	public void user_is_navigated_to_home_page() {
		System.out.println("User Navigated to Home Page");
	}

}
