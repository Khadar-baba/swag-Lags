package com.auto.learn.stepDefinations;

import org.testng.Assert;

import com.auto.learn.pages.CartItemsPage;
import com.auto.learn.pages.InformationPage;
import com.auto.learn.pages.LoginPage;
import com.auto.learn.pages.ProductsPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class ContinueShoppingStepDefinition {

	public static final String url = null;
	public LoginPage loginPage;
	public ProductsPage productsPage;
	public InformationPage information;
	public CartItemsPage cartItem;

	public ContinueShoppingStepDefinition(LoginPage loginPage, ProductsPage productsPage, InformationPage information,
			CartItemsPage cartItem) {
		this.loginPage = loginPage;
		this.productsPage = productsPage;
		this.information = information;
		this.cartItem = cartItem;
	}

	@Given("I add the some more items and continue shopping")
	public void i_add_the_some_more_items_and_continue_shopping() {
		cartItem.clickContinueShopping();
		productsPage.clickBoltTshirt();
		productsPage.clickBoltTShirtCart();
		productsPage.clicBackTo();
		productsPage.clickFleeceJacket();
		productsPage.clickFleeceJacketCart();
		productsPage.clicBackTo();
		productsPage.clickBikeLight();
		productsPage.clickBikeLikeCart();
		productsPage.clicBackTo();
		productsPage.clickBackpack();
		productsPage.clickBackpackCart();
		productsPage.clicBackTo();
		productsPage.clickCartFiled();
		cartItem.clickCheckout();
		information.enterFirstName("khadar");
		information.enterLastName("baba");
		information.enterPostalCode("522124");
		cartItem.clickContinue();
	}
	@Then("I see the firstName field")
	public void i_see_the_firstName_field() {
		boolean value= information.enterFinishButton();
		Assert.assertTrue(value);
	
	}
}