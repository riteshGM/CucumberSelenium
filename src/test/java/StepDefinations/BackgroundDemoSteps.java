package StepDefinations;

import io.cucumber.java.en.*;

public class BackgroundDemoSteps {

	@Given("Browser is Open")
	public void browser_is_open() {
		System.out.println("Browser is Open");
	}
	@Given("URL is loaded")
	public void url_is_loaded() {
		System.out.println("URL is loaded");
	}
	@When("User enters username and password")
	public void user_enters_username_and_password() {
		System.out.println("User enters username and password");
	}
	@Then("user is navigated to HomePage")
	public void user_is_navigated_to_home_page() {
		System.out.println("user is navigated to HomePage");
	}
	@Given("User Clicks on Dashboard link")
	public void user_clicks_on_dashboard_link() {
		System.out.println("User Clicks on Dashboard link");
	}
	@Then("Dashboard title is present")
	public void dashboard_title_is_present() {
		System.out.println("Dashboard title is present");
	}
	
	@Given("User Clicks on Address Link")
	public void user_clicks_on_address_link() {
		System.out.println("User Clicks on Address Link");
	}
	@Then("Address Title is present")
	public void address_title_is_present() {
		System.out.println("Address Title is present");
	}


}
