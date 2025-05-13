package com.automatedSaucedemo.co.steps.products;


import com.automatedSaucedemo.co.pages.products.SelectProductPage;

import net.thucydides.core.annotations.Step;


public class SelectProductStep extends SelectProductPage{
	
	
	@Step("Agregar producto al carrito de compras")
	public void addProducts() {
		product.waitUntilVisible().click();
	}
	
	@Step("Click en el icono de carrito de compras")
	public void clickShoppingCartIcon() {
		shopingCartIcon.click();
	}
	
	@Step("Pausa para inspección manual del navegador")
	public void pausarParaInspeccion() {
	    System.out.println("==> Pausando para inspección manual del navegador...");
	    waitFor(60).seconds(); // pausa 20 segundos
	}

}
