package com.automatedSaucedemo.co.utilities.website;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.webdriver.WebDriverFacade;

public class WebSite {
	
	
	@Steps(shared=true)
	PageObject saucedemo;
	
    @Step("Abrir pagina en el navegador")
    public void navigateTo(String url) {
 
        saucedemo.setDefaultBaseUrl(url);
        saucedemo.open();
    }
    
 
  
}
