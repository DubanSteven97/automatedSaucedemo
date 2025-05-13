package com.automatedSaucedemo.co.definitions;

import com.automatedSaucedemo.co.steps.login.LoginSteps;
import com.automatedSaucedemo.co.steps.validations.ValidationStep;
import com.automatedSaucedemo.co.utilities.website.WebSite;
import com.ibm.icu.impl.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;

public class LoginDef {
	
	@Steps(shared = true)
	WebSite url;
	
	@Steps(shared = true)
	LoginSteps login;
	
	@Steps(shared = true)
	ValidationStep validate;

	@Given("El usuario navega al sitio web")
	public void userNavigateTo() {
		
		url.navigateTo("https://www.saucedemo.com/");
		
	}
	
	@When("Ingresa credenciales validas")
	public void userLoginWhitValidCredentials() {
		login.typeUsername("standard_user");
		login.typePassword("secret_sauce");
		login.clickLogin();
	}
	
	@Then("La aplicacin muestra el modulo principal de productos")
	public void systemShowProductsModule() {
		Assert.assrt(validate.titleIsVisible());
	}
	
	@When("Ingresa credenciales invalidas")
	public void userLoginWhitInvalidCredentials() {
		login.typeUsername("standard_user");
		login.typePassword("123465");
		login.clickLogin();
	}
	
	@Then("La aplicación muestra un mensaje de error")
	public void systemShowErrorMessage() {
		Assert.assrt(validate.errorMessageIsDisplayed());
	}
}
