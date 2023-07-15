package com.auto.learn.pages;

import java.util.LinkedList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.auto.hooks.HooksApplication;

public class ProductsPage extends BasePage {

	public ProductsPage(HooksApplication appHooks) {
		super(appHooks);
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}

	@FindBy(id = "react-burger-menu-btn")
	private WebElement menuBar;
	@FindBy(id = "react-burger-cross-btn")
	private WebElement closeMenuBar;
	@FindBy(id = "shopping_cart_container")
	private WebElement cartField;
	@FindBy(xpath = "//select[contains(@data-test,'product_sort_container')]")
	private WebElement filter;
	@FindBy(xpath = "//div[text()='Sauce Labs Backpack']")
	private WebElement backpack;
	@FindBy(id = "add-to-cart-sauce-labs-backpack")
	private WebElement backpackCart;
	@FindBy(xpath = "//div[text()='Sauce Labs Bike Light']")
	private WebElement bikeLight;
	@FindBy(id = "add-to-cart-sauce-labs-bike-light")
	private WebElement bikeLikeCart;
	@FindBy(xpath = "//div[text()='Sauce Labs Bolt T-Shirt']")
	private WebElement boltTshirt;
	@FindBy(id = "add-to-cart-sauce-labs-bolt-t-shirt")
	private WebElement boltTShirtCart;
	@FindBy(xpath = "//div[text()='Sauce Labs Fleece Jacket']")
	private WebElement fleeceJacket;
	@FindBy(id = "add-to-cart-sauce-labs-fleece-jacket")
	private WebElement fleeceJacketCart;
	@FindBy(id = "//div[text()='Sauce Labs Onesie']")
	private WebElement onesie;
	@FindBy(id = "add-to-cart-sauce-labs-onesie")
	private WebElement onesieCart;
	@FindBy(xpath = "//div[text()='Test.allTheThings() T-Shirt (Red)']")
	private WebElement tShirtRed;
	@FindBy(id = "add-to-cart-test.allthethings()-t-shirt-(red)")
	private WebElement tShirtRedCart;
	@FindBy(id = "shopping_cart_container")
	private WebElement noOfItems;
	@FindBy(id = "back-to-products")
	private WebElement backToProducts;
	@FindBy(id = "cancel")
	private WebElement cancel;
	@FindBy(xpath = "//div[text()='7.99']")
	private WebElement lowprice;
	@FindBy(xpath = "//div[text()='49.99']")
	private WebElement highPrice;
	@FindBy(xpath = "//div[@class=\"inventory_list\"]/descendant::div[@class='inventory_item_price']")
	private List<WebElement> priceValue;

	public List<String> getIventoryPrices() {
		List<String> allInventoryPrices = new LinkedList<>();

		for (WebElement price : priceValue) {
			allInventoryPrices.add(getText(price).replace("$", ""));
		}
		return allInventoryPrices;

	}

	public void clickCancel() {
		click(cancel);
	}

	public void clicBackTo() {
		click(backToProducts);
	}

	public void clickmenuBar() {
		click(menuBar);
	}

	public void clickCartFiled() {
		click(cartField);
	}

	public void clickCloseMenubar() {
		click(closeMenuBar);

	}

	public void clickFilter(String value) {
		selectAnOptionInDropDown(filter, value);

	}

	public void clickBackpack() {
		click(backpack);
	}

	public void clickBackpackCart() {
		click(backpackCart);
	}

	public void clickBikeLight() {
		click(bikeLight);
	}

	public void clickBikeLikeCart() {
		click(bikeLikeCart);
	}

	public void clickBoltTshirt() {
		click(boltTshirt);
	}

	public void clickBoltTShirtCart() {
		click(boltTShirtCart);
	}

	public void clickFleeceJacket() {
		click(fleeceJacket);
	}

	public void clickFleeceJacketCart() {
		click(fleeceJacketCart);
	}

	public void clickOnesie() {
		click(onesie);
	}

	public void clickOnesieCart() {
		click(onesieCart);
	}

	public void ClickTShirtRed() {
		click(tShirtRed);
	}

	public void clickTShirtRedCart() {
		click(tShirtRedCart);

	}

	public void getNoOfItems() {
		getText(noOfItems);

	}

	public void getLowPrice() {
		getText(lowprice);
	}

	public void getHighPrice() {
		getText(highPrice);
	}

	public void getBackPack() {
		getText(backpack);
	}

}
