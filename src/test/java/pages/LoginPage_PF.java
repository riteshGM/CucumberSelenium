package pages;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import drivers.DriverManager;

/**
 * This Class Depicts Usage of PageFactory
 * @author rites
 *
 */
public class LoginPage_PF {
	@FindBy (id="name")
	@CacheLookup
	//Cache Lookup is used to Store the Element in Cache once found - infuture we wont go to DOM to find eement again
	//Use this basically for elements which are purely static
	WebElement nameTB;

	@FindBy (id="password")
	WebElement passwordTB;

	@FindBy (id="login")
	WebElement loginBtn;

	@FindBy (id="logout")
	WebElement logoutBtn;
	
	//Find Elements it is used
	@FindBy(partialLinkText = "Ritesh")
	List<WebElement> links;
	
	public LoginPage_PF() {
		PageFactory.initElements(DriverManager.getDriver(), this);
	}

	public void clickLogin() {
		loginBtn.click();
	}

	public void navigateTOurl(String url) {
		DriverManager.getDriver().navigate().to(url);
	}

	public void enterCredentials(String username, String password) {
		nameTB.sendKeys(username);
		passwordTB.sendKeys(password);
	}

	public void verifyLogoutBtnDisplayed() {
		Assert.assertTrue(logoutBtn.isDisplayed());

	}
}
