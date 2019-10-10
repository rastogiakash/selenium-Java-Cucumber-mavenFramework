package com.automation.steps;

import com.automation.pages.AmzBookHomePage;

import cucumber.api.java.en.When;

public class AmzBookHomePageSteps {
	
	AmzBookHomePage bookHomePage = new AmzBookHomePage();

	@When("^User adds book to basket$")
	public void user_adds_book_to_basket() throws Throwable {
		bookHomePage.addBookToBasket();
	}
}
