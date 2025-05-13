package com.automatedSaucedemo.co.steps.products;


import com.automatedSaucedemo.co.pages.products.SelectProductPage;

import net.serenitybdd.annotations.Step;

public class SelectProductStep extends SelectProductPage{
	
	
	@Step("Agregar producto al carrito de compras")
	public void addProducts() {
		product.click();
	}
	
	@Step("Click en el icono de carrito de compras")
	public void clickShoppingCartIcon() {
		shopingCartIcon.click();
	}

}
