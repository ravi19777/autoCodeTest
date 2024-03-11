package AutomationWebFramework.TestComponents;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import commonClasses.landingPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class baseTest {

	public WebDriver driver; // Here, "driver" is a variable which will contains the WebDriver

//	This method will provide the driver, maximize the window and apply implicit wait for 5 sec
	public WebDriver initializationAndImplicitlyWaiting() throws IOException {

//		properties class
		Properties prop = new Properties();

//		Convert into inputStream
		FileInputStream fileToInputStream = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\main\\java\\resourceFiles\\GlobalData.properties");

		prop.load(fileToInputStream); // load the global property file

		String browserName = prop.getProperty("browser"); // store the value which is stored in 'browser' key in global
															// file

		if (browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver(); // "driver" variable get updated
		} else if (browserName.equalsIgnoreCase("firefox")) {
//			code for firefox
		} else if (browserName.equalsIgnoreCase("edge")) {
//			code for edge
		}

//		These two method will be applied for all the browser
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		return driver;

//		NOTE: All the driver pointing the same driver variable `global`
	}

//	Class to launch the application page on which you have to initiate work

	public void launchApplicationPage(String url) throws IOException {
		driver = initializationAndImplicitlyWaiting();
		landingPage landingPage = new landingPage(driver);
		landingPage.redirectTo(url);
	}
}
