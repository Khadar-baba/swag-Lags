package com.auto.learn.stepDefinations;
//package com.auto.learn.stepDefinations;
//
//import java.awt.print.Printable;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//
//import com.auto.learn.pages.CartItemsPage;
//import com.auto.learn.pages.LoginPage;
//import com.auto.learn.pages.ProductsPage;
//
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//public class DuplicateRemovingCartItemsStepDefination {
//	public static final String url = null;
//	private LoginPage loginPage;
//	private ProductsPage product;
//	private CartItemsPage cartitem;
//
//	public DuplicateRemovingCartItemsStepDefination(LoginPage loginPage, ProductsPage product, CartItemsPage cartitem) {
//		this.loginPage = loginPage;
//		this.product = product;
//		this.cartitem = cartitem;
//	}
//
//	@When("I remove some items in cart")
//	public void i_remove_some_items_in_cart() {
//		cartitem.clickBackpackRemove();
//		cartitem.clickBikeLightRemove();
//		cartitem.clickJackerRemove();
//		cartitem.clickOnseieRemove();
//		cartitem.clickTShirtRemove();
//
//	}
//
//	@Then("I get no of cart items value")
//	public void i_get_no_of_cart_items_value() {
//		product.getNoOfItems();
//
//	}
//
//}