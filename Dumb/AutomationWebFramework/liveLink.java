package PAF.AutomationWebFramework;

//import io.github.bonigarcia.wdm.WebDriverManager;

import java.io.IOException;
//import java.util.List;

//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import AutomationWebFramework.TestComponents.baseTest;
import PAF.AutomationWebFramework.lib.comps.homePage;
//import PAF.AutomationWebFramework.lib.comps.gitaPage;

public class liveLink extends baseTest {

	@Test
	public void liveLink() throws IOException {

		System.out.println("This is live link page!!");

//		homePage homePage = launchPage();

		homePage homePage = launchPage();

//		Create object for the home page
		homePage.implicitWait();
		homePage.openMenu();
		homePage.redirectToBhagavadGitaPage();

//		TODO: Check the url and then proceed further

//		Create object for Gita page
//		gitaPage gitaPage = new gitaPage(driver);
//		gitaPage.clickLiveLinkButton();
//	}

	}
}
