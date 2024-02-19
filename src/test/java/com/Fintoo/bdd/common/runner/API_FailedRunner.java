package com.Fintoo.bdd.common.runner;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Fintoo.bdd.integrations.NG_listners.*;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.FeatureWrapper;

import io.cucumber.testng.PickleWrapper;
import io.cucumber.testng.TestNGCucumberRunner;

@Listeners({ SuiteEvent.class, APIEvent.class })

@CucumberOptions(features = { "@target/api_rerun.txt" }, glue = {

		"com/Fintoo/common/bdd/hooks", "com/Fintoo/api/bdd/step_definitions" }, tags = "@riskcovry", plugin = {
				"pretty", "html:target/site/cucumber-pretty/cucumber_api.html", "json:target/cucumber/cucumber_api.json","io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"}, monochrome = true, publish = true, dryRun = false)
//
public class API_FailedRunner {

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


