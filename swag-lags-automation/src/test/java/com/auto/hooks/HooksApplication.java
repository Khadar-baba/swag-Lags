package com.auto.hooks;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksApplication {
	private WebDriver driver;
	private Properties properties;

	public Properties getProperties() {
		return properties;
	}

	public WebDriver getDriver() {
		return driver;
	}

	@Before(order = 2)
	public void initializeDriver() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@Before(order = 1)
	public void readPropertyFile() throws IOException {
		properties = new Properties();
		FileInputStream files = new FileInputStream("src\\main\\resources\\config.properties");
		properties.load(files);
	}

	@After
	 public void quitDriver() {
	 driver.quit();
	}

}
