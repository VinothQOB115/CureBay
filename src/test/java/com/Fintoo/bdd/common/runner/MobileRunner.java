package com.Fintoo.bdd.common.runner;

import org.testng.annotations.AfterClass;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Fintoo.bdd.integrations.NG_listners.SuiteEvent;
import com.Fintoo.bdd.integrations.NG_listners.MobileEvent;


import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.FeatureWrapper;
import io.cucumber.testng.PickleWrapper;
import io.cucumber.testng.TestNGCucumberRunner;

@Listeners({ SuiteEvent.class, MobileEvent.class })

@CucumberOptions(features = "src/test/java/com/Fintoo/Mobile/bdd/feature", glue = {
		"com/Fintoo/Mobile/bdd/step_definitions", "com/Fintoo/common/bdd/hooks" }, tags = "@fintoo",

		plugin = { "pretty", "json:target/cucumber/cucumber.json", "html:target/site/cucumber-pretty/cucumberMobile.html",
				"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"
				 }, monochrome = true, publish = true, dryRun = false)
public class MobileRunner {
	private TestNGCucumberRunner testNGCucumberRunner;

	@BeforeClass(alwaysRun = true)
	public void setUpClass() throws Exception {
		testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
		System.out.println("@Before class");
	}

	@Test(groups = "cucumber", description = "Run Cucumber Scenario", dataProvider = "scenarios")
	public void scenario(PickleWrapper pickleEventWrapper, FeatureWrapper cucumberFeatureWrapper) throws Throwable {
		testNGCucumberRunner.runScenario(pickleEventWrapper.getPickle());
	}

	@DataProvider(parallel = false)
	public Object[][] scenarios() {
		System.out.println("@Data provider");
		if (testNGCucumberRunner == null) {
			testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
		}

		return testNGCucumberRunner.provideScenarios();
	}

	@AfterClass(alwaysRun = true)
	public void tearDownClass() {
		System.out.println("@Afterclass");
		testNGCucumberRunner.finish();
	}
}
