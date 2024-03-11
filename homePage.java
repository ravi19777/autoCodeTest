package pageObjects;

import java.io.IOException;

import AutomationWebFramework.TestComponents.baseTest;

public class homePage extends baseTest {

	public void openPage() throws IOException {
		launchApplicationPage("https://dev-main1.vedant.life/");
	}

}
