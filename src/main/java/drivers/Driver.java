package drivers;

import org.openqa.selenium.WebDriver;

public final class Driver {
	private Driver() {
		
	}
	
	/**
	 * Only Perform Driver Initialization
	 * @param url
	 */
	public static void initDriver(String url) {
		//First Check if ThreadLocal Instance is not Created Already
		if(DriverManager.getDriver()==null) {
			WebDriver driver = WebDriverFactory.getDriver();
			//Set ThreadLocal Instance
			DriverManager.setDriver(driver);
			DriverManager.getDriver().manage().window().maximize();
			DriverManager.getDriver().navigate().to(url);
		}
	}
	
	/**
	 * Only Perform Driver Quit Action
	 */
	public static void quitDriver() {
        if (DriverManager.getDriver() != null) {
            DriverManager.getDriver().quit();
            DriverManager.setDriver(null);
        }
		
	}

}
