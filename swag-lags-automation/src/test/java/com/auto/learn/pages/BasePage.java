package com.auto.learn.pages;

import java.time.Duration;

import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.auto.hooks.HooksApplication;

public class BasePage {
	private HooksApplication appHooks;
	protected WebDriver driver;

	public BasePage(HooksApplication appHooks) {
		this.appHooks = appHooks;
		driver = appHooks.getDriver();
	}

	public void navigateToUrl(String url) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(url);

	}

	public void scrollToElement(WebElement webElement) {

		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true)", webElement);
	}

	public void click(WebElement element) {

		int attempts = 0;

		while (attempts < 10) {

			try {
				scrollToElement(element);
				element.click();

				break;

			} catch (StaleElementReferenceException e1) {

				System.out.println("Element has been staled, so retrying");

				if (attempts == 9) {

					throw new StaleElementReferenceException("Element has been staled. Tried to click 10 times.");

				}

			} catch (ElementClickInterceptedException e) {

				System.out.println("Element has been staled, so retrying");

				if (attempts == 9) {

					throw new ElementClickInterceptedException(

							"Element has not been clicked. Tried to click 10 times.");

				}

			}

			attempts++;

		}

	}

	public void sendkeys(WebElement element, String keys) {

		int attempts = 0;

		while (attempts < 5) {

			try {

				element.sendKeys(keys);

				break;

			} catch (StaleElementReferenceException e1) {

				System.out.println("Element has been staled, so retrying");

				if (attempts == 4) {

					throw new StaleElementReferenceException("Element has been staled. Tried to to sendkeys 5 times.");

				}

			} catch (ElementClickInterceptedException e) {

				System.out.println("Element has been staled, so retrying");

				if (attempts == 4) {

					throw new ElementClickInterceptedException(

							"Element has not been clicked. Tried to sendkeys 5 times.");

				}

			}

			attempts++;

		}

	}

	public String getText(WebElement element) {
		return element.getText();
	
	}
	public void selectAnOptionInDropDown(WebElement element,String visableText) {
		 Select selectDropDown = new Select(element);
		 selectDropDown.selectByVisibleText(visableText);
		 
		
	}
}
