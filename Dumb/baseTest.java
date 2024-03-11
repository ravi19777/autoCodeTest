package AutomationWebFramework.TestComponents;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import PAF.AutomationWebFramework.lib.comps.homePage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class baseTest {

	public WebDriver driver;
	public homePage home;
//	This file will contain all the common tests

	public WebDriver initializeDriverAndMaximizeWindow() throws IOException {
//		properties class, this will read all the key value pair of the file with the .resource extension
		Properties prop = new Properties(); // properties is a class
		FileInputStream fileToInputStream = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\main\\java\\automation\\resources\\GlobalData.properties");
		// FileInputStream
		// will
		// convert
		// the
		// file
		// to
		// InputStream
		// file
		prop.load(fileToInputStream);

		String browserName = prop.getProperty("browser");

		if (browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}

		if (browserName.equalsIgnoreCase("firefox")) {
//			fire fox
		}

		if (browserName.equalsIgnoreCase("edge")) {
//			edge
		}

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		return driver;
	}

	@BeforeMethod
	public homePage launchPage() throws IOException {
		driver = initializeDriverAndMaximizeWindow();

		home = new homePage(driver);
		home.redirect();
		return home;
	}

	@AfterMethod 
	public void closePage() {
		driver.close();
	}
}
