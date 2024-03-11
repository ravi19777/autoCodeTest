package commonClasses;

import org.openqa.selenium.WebDriver;

public class landingPage {
	
	WebDriver driver;
	public landingPage(WebDriver driver) {
		this.driver = driver;
	}

	public void redirectTo(String url) {
		driver.get(url);
	}
}
