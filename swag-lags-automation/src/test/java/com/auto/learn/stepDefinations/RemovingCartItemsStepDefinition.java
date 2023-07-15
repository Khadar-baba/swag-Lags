package com.auto.learn.stepDefinations;

import com.auto.learn.pages.CartItemsPage;
import com.auto.learn.pages.LoginPage;
import com.auto.learn.pages.ProductsPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RemovingCartItemsStepDefinition {
	public static final String url = null;
	public LoginPage loginPage;
	public ProductsPage product;
	public CartItemsPage cartitem;

	public RemovingCartItemsStepDefinition(LoginPage loginPage, ProductsPage products, CartItemsPage cartitem) {
		this.loginPage = loginPage;
		this.product = product;
		this.cartitem = cartitem;
	}

	@When("I remove some items in cart")
	public void i_remove_some_items_in_cart() {
		cartitem.clickBackpackRemove();
		cartitem.clickBikeLightRemove();
		cartitem.clickJackerRemove();
		cartitem.clickOnseieRemove();
		cartitem.clickTShirtRemove();

	}

	@Then("I get no of cart items value")
	public void i_get_no_of_cart_items_value() {
		cartitem.clickContinueShopping();
	

	}
}
