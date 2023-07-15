package com.auto.learn.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.auto.hooks.HooksApplication;

public class CartItemsPage extends BasePage {

	public CartItemsPage(HooksApplication appHooks) {
		super(appHooks);
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}

	@FindBy(id = "remove-sauce-labs-backpack")
	private WebElement backpackRemove;
	@FindBy(id = "remove-sauce-labs-bike-light")
	private WebElement bikeLightRemove;
	@FindBy(id = "remove-sauce-labs-bolt-t-shirt")
	private WebElement tShirtRemove;
	@FindBy(id = "remove-sauce-labs-fleece-jacket")
	private WebElement jackerRemove;
	@FindBy(id = "remove-sauce-labs-onesie")
	private WebElement onseieRemove;
	@FindBy(id = "remove-test.allthethings()-t-shirt-(red)")
	private WebElement tShirtRedRemove;
	@FindBy(id = "continue-shopping")
	private WebElement continueShopping;
	@FindBy(id = "checkout")
	private WebElement checkout;
	@FindBy(id = "continue")
	private WebElement continuebutton;

	public void clickContinue() {
		click(continuebutton);

	}

	public void clickBackpackRemove() {
		click(backpackRemove);

	}

	public void clickBikeLightRemove() {
		click(bikeLightRemove);
	}

	public void clickTShirtRemove() {
		click(tShirtRemove);
	}

	public void clickJackerRemove() {
		click(jackerRemove);
	}

	public void clickOnseieRemove() {
		click(onseieRemove);
	}

	public void clickTShirtRedRemove() {
		click(tShirtRedRemove);
	}

	public void clickContinueShopping() {
		click(continueShopping);
	}

	public void clickCheckout() {
		click(checkout);
	}
}
