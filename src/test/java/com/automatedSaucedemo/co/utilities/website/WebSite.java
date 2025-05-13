package com.automatedSaucedemo.co.utilities.website;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.core.pages.PageObject;

public class WebSite {
	
	
	@Steps(shared=true)
	PageObject saucedemo;
	
	@Step("Abrir pagina en el navegador")
	public void navigateTo(String url) {
		saucedemo.setDefaultBaseUrl(url);
		saucedemo.open();
	}
}
