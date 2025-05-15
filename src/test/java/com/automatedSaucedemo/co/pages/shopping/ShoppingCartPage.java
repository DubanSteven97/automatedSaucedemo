package com.automatedSaucedemo.co.pages.shopping;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class ShoppingCartPage extends PageObject{
	
	@FindBy(id="checkout")
	protected WebElementFacade checkoutButton;
	
	@FindBy(id="first-name")
	protected WebElementFacade txt_firstname;
			
	@FindBy(id="last-name")
	protected WebElementFacade txt_lastname;
	
	@FindBy(id="postal-code")
	protected WebElementFacade txt_postalcode;
	
	@FindBy(id="continue")
	protected WebElementFacade continueButton;
	
	@FindBy(id="finish")
	protected WebElementFacade finishButton;
	
	

}
