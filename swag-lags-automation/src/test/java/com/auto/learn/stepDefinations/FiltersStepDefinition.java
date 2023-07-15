package com.auto.learn.stepDefinations;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.testng.Assert;

import com.auto.learn.pages.CartItemsPage;
import com.auto.learn.pages.InformationPage;
import com.auto.learn.pages.LoginPage;
import com.auto.learn.pages.ProductsPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FiltersStepDefinition {
	public static final String url = null;
	public LoginPage loginPage;
	public ProductsPage productsPage;
	public InformationPage information;
	public CartItemsPage cartItem;

	public FiltersStepDefinition(LoginPage loginPage, ProductsPage productsPage, InformationPage information,
			CartItemsPage cartItem) {
		this.loginPage = loginPage;
		this.productsPage = productsPage;
		this.information = information;
		this.cartItem = cartItem;
	}

	@When("I apply the filter low to high price")
	public void i_apply_the_filter_low_to_high_price() {
		productsPage.clickFilter("Price (low to high)");
	}

	@When("I apply the filter high to low")
	public void i_apply_the_filter_high_to_low() {
		productsPage.clickFilter("Price (high to low)");
	}

	@When("I apply the filter alphabet order")
	public void i_apply_the_filter_alphabet_order() {
		productsPage.clickFilter("Name (A to Z)");

	}

	@Then("I see first item must have low price")
	public void i_see_first_item_must_have_low_price() {
		List<String> allPrices = productsPage.getIventoryPrices();
		List<String> sortedPrices = allPrices.stream().sorted(new Comparator<String>() {
			public int compare(String s1, String s2) {
				double d1 = Double.parseDouble(s1);
				double d2 = Double.parseDouble(s2);
				return Double.compare(d1, d2);
			}
		}).collect(Collectors.toList());
		Assert.assertEquals(allPrices, sortedPrices);

	}

	@Then("I see first item must have high price")
	public void i_see_first_item_must_have_high_price() {
		List<String> allPrices = productsPage.getIventoryPrices();
		List<String> sortedPrices = allPrices.stream().sorted(new Comparator<String>() {
			public int compare(String s1, String s2) {
				double d1 = Double.parseDouble(s1);
				double d2 = Double.parseDouble(s2);
				return Double.compare(d1, d2);
			}
		}).collect(Collectors.toList());
		Assert.assertNotEquals(allPrices, sortedPrices);

	}

	@Then("I see first item must have first alphabet")
	public void i_see_first_item_must_have_first_alphabet() {
		productsPage.getBackPack();
	}
}
