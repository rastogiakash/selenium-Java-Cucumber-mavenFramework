package com.automation.pages;

import static com.automation.utils.CommonUtils.clickOnElement;
import static com.automation.utils.DriverUtils.getDriver;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmzBookHomePage {
	static WebDriver driver;
	
	public AmzBookHomePage() {
        PageFactory.initElements(getDriver(), this);
    }

	 @FindBy(id = "a-autoid-8-announce")
	 private WebElement paperbkIconBtn;
	 @FindBy(id = "add-to-cart-button")
	 private WebElement addCartBtn;
	 @FindBy(id = "nav-cart")
	 private WebElement navCartBtn;
	 @FindBy(id = "p2dPopoverID-no-button-announce")
	 private WebElement popOverBtn;
	 
	 
	 
	 public void addBookToBasket() throws Exception {
		try {
			Thread.sleep(5000);
		    clickOnElement(paperbkIconBtn);
		    Thread.sleep(5000);

	    	// creating instance of Robot class (A java based utility)
	    	Robot rb =new Robot();
	    	Thread.sleep(2000);

	    	rb.keyPress(KeyEvent.VK_ENTER);
	    	rb.keyRelease(KeyEvent.VK_ENTER);
	    	Thread.sleep(2000);
		    
		    clickOnElement(addCartBtn);
		    Thread.sleep(5000);
		    clickOnElement(navCartBtn);
		    Thread.sleep(5000);

		} catch (InterruptedException e) {
			e.printStackTrace();
		} 
	}
}
