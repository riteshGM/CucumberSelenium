package drivers;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

//We do not want anyone to extend this class
public final class WebDriverFactory {
	
	//We Do not want Any one to Initialize object of this call
	private WebDriverFactory(){
		
	}
	
	/**
	 * Create Instances of WebDriver
	 * @return
	 */
	public static WebDriver getDriver() {
		if(DriverManager.getDriver()==null) {
			System.out.println("WebDriver was not yet initiated");
			
			WebDriver driver = new ChromeDriver();
			//Remove this Step Later On Once Framework is Mattured
			DriverManager.setDriver(driver);
			return driver;
		}else {
			System.out.println("Live Thread of Webdriver is already in supplying same");
			return DriverManager.getDriver();
		}

		
	}
	
	public static void setWebDriverConfig(WebDriver driver) {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}

}
