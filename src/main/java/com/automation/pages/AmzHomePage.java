package com.automation.pages;

import static com.automation.utils.CommonUtils.clickOnElement;
import static com.automation.utils.CommonUtils.sendKeysTo;
import static com.automation.utils.ConfigUtils.getPropertyByKey;
import static com.automation.utils.DriverUtils.getDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmzHomePage {
	
	 public AmzHomePage() {
	        PageFactory.initElements(getDriver(), this);
	    }
	
	 @FindBy(id = "twotabsearchtextbox")
	 private WebElement searchTextBox;
	 @FindBy(className = "nav-input")
	 private WebElement searchIconBtn;
	 
	 public void searchForBook() {
	    sendKeysTo(searchTextBox, getPropertyByKey("bookName"));
	    clickOnElement(searchIconBtn);
	}
}
