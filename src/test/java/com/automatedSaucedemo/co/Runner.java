package com.automatedSaucedemo.co;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(

		features = "src/test/resources/features",
		glue = "com.automatedSaucedemo.co.definitions",
		//tags = "@Login"
		
		tags="@ShoppingCart and @ShoppinCartlist"
		
		
)
public class Runner {

}
