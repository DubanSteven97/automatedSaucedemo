package com.automatedSaucedemo.co.definitions.Shopping;

import com.automatedSaucedemo.co.steps.products.SelectProductStep;
import com.automatedSaucedemo.co.steps.shopping.ShoppingCartStep;
import com.automatedSaucedemo.co.steps.validations.ValidationStep;
import com.ibm.icu.impl.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class ShoppingDef {
	

	@Steps(shared=true)
	SelectProductStep selectProduct;
	
	@Steps(shared=true)
	ValidationStep validate;
	
	@Steps(shared=true)
	ShoppingCartStep shoppinCar;
	
	@And("agrega productos al carrito de compras")
	public void userAddProducts(){
		
		//selectProduct.pausarParaInspeccion();
		selectProduct.addProducts();
	}
	
	
	@And("da click en el icono del carrito")
	public void userClickShoppingCartIcon() {
		selectProduct.clickShoppingCartIcon();
	}
	
	@And("el sistema deberia listar los productos agregados en el carrito de compras")
	public void systemListProducts() {
		 Assert.assrt(validate.productsAreDisplayed());
	}

		
	@When("completa todo el registro de la orden")
	public void userCompleteOrder() {
		
		shoppinCar.clickCheckoutButton();
		shoppinCar.typeFirstName("Duban");
		shoppinCar.typeLastName("Estupiñan");
		shoppinCar.typePostalCode("111111");
		shoppinCar.clickContinue();
		shoppinCar.clickFinish();
		
	}
	
	@Then("El sistema deberia procesar la compra")
	public void systemCompleteOrder() {
		
		Assert.assrt(validate.orderTextIsDisplayed());
	}
	
}
