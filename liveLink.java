package AutomationWebFramework.TestComponents;

import java.io.IOException;

import org.testng.annotations.Test;

import pageObjects.homePage;

public class liveLink {

	@Test
	public void liveLinkTest() throws IOException {
//	create object for homepage
		homePage homePage = new homePage();

		homePage.openPage();
	}
}
