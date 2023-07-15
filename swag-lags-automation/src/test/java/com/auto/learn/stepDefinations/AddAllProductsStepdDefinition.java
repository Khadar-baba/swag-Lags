package com.auto.learn.stepDefinations;

import com.auto.learn.pages.LoginPage;
import com.auto.learn.pages.ProductsPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddAllProductsStepdDefinition {
	public static final String url = null;
	public LoginPage loginPage;
	public ProductsPage productsPage;

	public AddAllProductsStepdDefinition(LoginPage loginPage, ProductsPage productsPage) {
		this.loginPage = loginPage;
		this.productsPage = productsPage;
	}

	@Given("I am on the products page")
	public void i_am_on_the_products_page() {
		productsPage.clickCloseMenubar();
	}

	@When("I select all the products by using cart")
	public void i_select_all_the_products_by_using_cart() {
		productsPage.clickBackpackCart();
		productsPage.clickBikeLikeCart();
		productsPage.clickBoltTShirtCart();
		productsPage.clickFleeceJacketCart();
		productsPage.clickOnesieCart();
		productsPage.clickTShirtRedCart();
	}

	@Then("I display items in cart")
	public void i_display_items_in_cart() {
		productsPage.clickCartFiled();
	}

}
