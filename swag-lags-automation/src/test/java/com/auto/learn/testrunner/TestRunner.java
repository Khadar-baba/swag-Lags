package com.auto.learn.testrunner;

import io.cucumber.core.plugin.Options.Plugin;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

public class TestRunner {

	@CucumberOptions(features = { "src\\test\\resources\\swag-lags" }, glue = { "com\\auto\\learn\\stepDefinations",
			"com\\auto\\hooks" }, plugin = { "json:target/cucumber/cucumber.json",
					"html:target/cucumber-html-report" })
	public class TestRunnner extends AbstractTestNGCucumberTests {

	}

}
