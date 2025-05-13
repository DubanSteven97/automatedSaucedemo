package com.automatedSaucedemo.co.definitions.Shopping;

import com.automatedSaucedemo.co.steps.products.SelectProductStep;
import com.automatedSaucedemo.co.steps.validations.ValidationStep;
import com.ibm.icu.impl.Assert;

import io.cucumber.java.en.And;
import net.serenitybdd.annotations.Steps;

public class ShoppingDef {
	

	@Steps(shared=true)
	SelectProductStep selectProduct;
	
	@Steps(shared=true)
	ValidationStep validate;
	
	@And("agrega productos al carrito de compras")
	public void userAddProducts() {
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

	
	
}
