package com.automatedSaucedemo.co.pages.products;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class SelectProductPage extends PageObject{
	
	//@FindBy(id="add-to-cart-sauce-labs-backpack")
	
	@FindBy(id="add-to-cart-sauce-labs-backpack")
	protected WebElementFacade product;
	
	@FindBy(xpath ="//a[@class='shopping_cart_link']")
	protected WebElementFacade shopingCartIcon;
	

}
