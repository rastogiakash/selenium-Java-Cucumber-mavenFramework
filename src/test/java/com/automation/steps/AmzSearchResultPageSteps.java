package com.automation.steps;

import com.automation.pages.AmzSearchResultPage;
import cucumber.api.java.en.When;

public class AmzSearchResultPageSteps {
	
	AmzSearchResultPage searchResultPage = new AmzSearchResultPage();

	@When("^User click on search button$")
	public void user_click_on_search_button() throws Throwable {
		searchResultPage.gotoBookHomePage();
	}
}
