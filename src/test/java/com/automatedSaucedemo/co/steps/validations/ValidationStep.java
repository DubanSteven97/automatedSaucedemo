package com.automatedSaucedemo.co.steps.validations;

import com.automatedSaucedemo.co.pages.validations.ValidationPage;

import net.thucydides.core.annotations.Step;


public class ValidationStep extends ValidationPage{
	
	@Step("Validar visualización del modulo de productos")
	public Boolean titleIsVisible(){
		return lbl_product.isDisplayed();
		
	}
	
	@Step("Validar visualización de productos")
	public Boolean productIsVisible(){
		return productHome.isDisplayed();
	}
	
	@Step("Validar visualización de mensaje de error")
	public Boolean errorMessageIsDisplayed() {
		return lbl_errorMessage.isDisplayed();
	}
	
	
	@Step("Validar la existencia del producto")
	public Boolean productsAreDisplayed() {
		return productList.isDisplayed();
	}
	
	@Step("Validar la confirmación de la orden")
	public Boolean orderTextIsDisplayed(){
		return lbl_order.isDisplayed();
	}

}
