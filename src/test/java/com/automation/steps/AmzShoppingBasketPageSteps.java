package com.automation.steps;

import com.automation.pages.AmzShoppingBasketPage;

import cucumber.api.java.en.Then;

public class AmzShoppingBasketPageSteps {
	AmzShoppingBasketPage shoppingBasketPage= new AmzShoppingBasketPage();
	
	@Then("^User verify that same book added$")
	public void user_verify_that_same_book_added() throws Throwable {
		shoppingBasketPage.verifyBookTitleInBasket();
	}
}