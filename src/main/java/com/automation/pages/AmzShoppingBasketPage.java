package com.automation.pages;

import static com.automation.utils.ConfigUtils.getPropertyByKey;
import static com.automation.utils.DriverUtils.getDriver;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmzShoppingBasketPage {

	public AmzShoppingBasketPage() {
        PageFactory.initElements(getDriver(), this);
    }
	
	@FindBy(linkText = "The Elephant Game (The War Planners Series)")
	 private WebElement bookTitleLbl;
		 
	 public void verifyBookTitleInBasket() {
	        String getTitle = bookTitleLbl.getText();
	    	System.out.println("TEST MSG  - 1" + getTitle); 
	        Assert.assertTrue(getTitle.contains(getPropertyByKey("bookName")));
	    }

	 
}
