package com.automation.steps;

import com.automation.pages.AmzHomePage;

import cucumber.api.java.en.When;
import cucumber.api.java.en.Given;


public class AmzHomePageSteps {
	AmzHomePage homePage = new AmzHomePage();
	//homePage.searchForBook();

	@Given("^User is on Homepage of the amazon$")
	public void user_is_on_Homepage_of_the_amazon() throws Throwable {
	 
	}

	@When("^User enter desired book name in search box$")
	public void user_enter_desired_book_name_in_search_box() throws Throwable {
		homePage.searchForBook();
	}
}
