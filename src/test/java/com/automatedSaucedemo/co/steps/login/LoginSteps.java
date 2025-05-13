package com.automatedSaucedemo.co.steps.login;

import com.automatedSaucedemo.co.pages.login.LoginPage;

import net.thucydides.core.annotations.Step;


public class LoginSteps extends LoginPage{
	
	@Step("Ingresar usuario")
	public void typeUsername(String username) {
		txt_username.sendKeys(username);	
	}
	
	@Step("Ingresar contaseña")
	public void typePassword(String password) {
		txt_password.sendKeys(password);
	}
	
	@Step("Click botón login")
	public void clickLogin() {
		btn_login.click();
	}

}
