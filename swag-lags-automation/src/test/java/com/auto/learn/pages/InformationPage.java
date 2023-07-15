package com.auto.learn.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.auto.hooks.HooksApplication;

public class InformationPage extends BasePage {

	public InformationPage(HooksApplication appHooks) {
		super(appHooks);
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}

	@FindBy(id = "first-name")
	private WebElement firstName;
	@FindBy(id = "last-name")
	private WebElement lastName;
	@FindBy(id = "postal-code")
	private WebElement postalCode;
	@FindBy(id = "finish")
	private List<WebElement> finish;

	public boolean enterFinishButton() {
		int value = finish.size();
		if (value > 0) {
			return true;

		}
		return false;
	}

	public void enterFirstName(String first) {
		firstName.sendKeys(first);

	}

	public void enterLastName(String last) {
		lastName.sendKeys(last);

	}

	public void enterPostalCode(String postal) {
		postalCode.sendKeys(postal);

	}
}
