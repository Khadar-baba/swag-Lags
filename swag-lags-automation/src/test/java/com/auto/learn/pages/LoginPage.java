package com.auto.learn.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.auto.hooks.HooksApplication;

public class LoginPage extends BasePage {

	public LoginPage(HooksApplication appHooks) {
		super(appHooks);
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}

	@FindBy(id = "user-name")
	private WebElement userName;
	@FindBy(id = "password")
	private WebElement password;
	@FindBy(id = "login-button")
	private WebElement login;

	public void enterUserName(String username) {
		userName.sendKeys(username);
	}

	public void enterPassword(String passwordKeys) {
		password.sendKeys(passwordKeys);
	}

	public void clickLogin() {
		login.click();

	}
}
