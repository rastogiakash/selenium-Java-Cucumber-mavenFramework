package com.automation.pages;

import static com.automation.utils.CommonUtils.clickOnElement;
import static com.automation.utils.DriverUtils.getDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AmzSearchResultPage {

	public AmzSearchResultPage() {
        PageFactory.initElements(getDriver(), this);
    }
	
	@FindBy(xpath = "//div[3]//div[1]//div[1]//a[1]//div[1]//div[1]//img[1]")
	 private WebElement bookImageLnk;
	 
	 public void gotoBookHomePage() {
	   clickOnElement(bookImageLnk);
	 }
	 
}
