package com.automatedSaucedemo.co.pages.validations;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class ValidationPage extends PageObject{
	
	@FindBy(xpath = "//span[@class='title']")
	protected WebElementFacade lbl_product;
	
	@FindBy(xpath = "//h3[@data-test=\"error\" and text()='Epic sadface: Username and password do not match any user in this service']")
	protected WebElementFacade lbl_errorMessage;
}
