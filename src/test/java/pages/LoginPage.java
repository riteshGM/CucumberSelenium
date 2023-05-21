package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import drivers.DriverManager;

public class LoginPage {
	
	private static final By nameTB = By.id("name");
	private static final By passwordTB = By.id("password");
	private static final By loginBtn = By.id("login");
	private static final By logoutBtn = By.id("logout");
	
	public void clickLogin() {
		DriverManager.getDriver().findElement(loginBtn).click();
	}
	
	public void navigateTOurl(String url) {
		DriverManager.getDriver().navigate().to(url);
	}

	public void enterCredentials(String username, String password) {
		DriverManager.getDriver().findElement(nameTB).sendKeys(username);
		DriverManager.getDriver().findElement(passwordTB).sendKeys(password);
		
	}

	public void verifyLogoutBtnDisplayed() {
		Assert.assertTrue(DriverManager.getDriver().findElement(logoutBtn).isDisplayed());
		
	}
}
