package com.auto.learn.stepDefinations;

import org.testng.Assert;

import com.auto.learn.config.properties.propertiesSwagLags;
import com.auto.learn.pages.LoginPage;
import com.auto.learn.pages.ProductsPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageStepDefinition {
	public static final String url = null;
	public LoginPage pagelogin;
	public ProductsPage products;

	public LoginPageStepDefinition(LoginPage pagelogin, ProductsPage products) {
		this.pagelogin = pagelogin;
		this.products = products;
	}

	@Given("I am on the swagLog Login Page")
	public void i_am_on_the_swagLog_Login_Page() {
		pagelogin.navigateToUrl("https://www.saucedemo.com/");

	}

	@When("I enter the valid user and valid password of swagLog")
	public void i_enter_the_valid_user_and_valid_password_of_swagLog() {
		pagelogin.enterUserName("standard_user");
		pagelogin.enterPassword("secret_sauce");
		pagelogin.clickLogin();
	}

	@Then("I display the openMenu fields")
	public void i_display_the_swagLag_all_items_fields() {
		products.clickmenuBar();

	}

}
