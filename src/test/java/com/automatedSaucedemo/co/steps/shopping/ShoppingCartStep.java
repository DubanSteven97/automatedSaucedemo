package com.automatedSaucedemo.co.steps.shopping;

import com.automatedSaucedemo.co.pages.shopping.ShoppingCartPage;

import net.thucydides.core.annotations.Step;

public class ShoppingCartStep extends ShoppingCartPage{
	
	@Step("Clic en el botón ckeckout")
	public void clickCheckoutButton() {
		checkoutButton.click();
	}
	
	@Step("Ingresar nombre")
	public void typeFirstName(String firstname) {
		txt_firstname.sendKeys(firstname);
			
	}
	
	
	@Step("Ingresar Apellido")
	public void typeLastName(String lastname) {
		txt_lastname.sendKeys(lastname);
	}
	
	@Step("Ingresar código postal")
	public void typePostalCode(String postalCode) {
		txt_postalcode.sendKeys(postalCode);
	}
	
	@Step("Clic en el botón Continue")
	public void clickContinue() {
		continueButton.click();
	}

	@Step("Clic en el botón Finish")
	public void clickFinish() {
		finishButton.click();
	}
}
