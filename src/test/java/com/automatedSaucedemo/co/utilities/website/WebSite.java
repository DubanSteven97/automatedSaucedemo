package com.automatedSaucedemo.co.utilities.website;


import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;


public class WebSite {
	
	
	@Steps(shared=true)
	PageObject saucedemo;
	
    @Step("Abrir pagina en el navegador")
    public void navigateTo(String url) {
        saucedemo.setDefaultBaseUrl(url);
        saucedemo.open();
    }
    
 
  
}
