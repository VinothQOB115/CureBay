package com.Fintoo.bdd.web.step_definitions;

import com.Fintoo.bdd.web.screens.Dashboard_Goal_Screens;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Dashboard_Goal_SD {
	Dashboard_Goal_Screens dbvalidations = new Dashboard_Goal_Screens();

	@Then("user should able to see homepage {string}")
	public void user_should_able_to_see_homepage(String string) {
		dbvalidations.verifyHomePage(string);
	}

	/*
	 * Cash flow
	 */
	@And("user clicks on cashflow")
	public void user_clicks_on_cashflow() {
		dbvalidations.clickCashFlowBtn();
	}

	@Then("user should able to see the gross inflow details")
	public void user_should_able_to_see_the_gross_inflow_details() {
		dbvalidations.verifyGrossInFlowDetails();
	}

	@And("user should able to see gross outflow details")
	public void user_should_able_to_see_gross_outflow_details() {
		dbvalidations.verifyGrossOutFlowDetails();
	}
	@And("user clicks on saving deflict option")
	public void user_clicks_on_saving_deflict_option() {
		dbvalidations.btnSavingDeflcit();
	}
	@Then("user should able to see gross inflow and outflow details")
	public void user_should_able_to_see_gross_inflow_and_outflow_details() {
		//dbvalidations.validateSavingDeflictGrossInflowAndOutFlow();
		dbvalidations.validateExistingInsuranceDetails();
		dbvalidations.validateinvestableSurplus();
	}

@And("user clicks on score card option")
public void user_clicks_on_score_card_option() {
	dbvalidations.btnScoreCard();

}

@Then("user should able to see saving ratio details")
public void user_should_able_to_see_saving_ratio_details() {
	dbvalidations.validateSavingRatioDetails();

}

@Then("user should able to see expense ratio details")
public void user_should_able_to_see_expense_ratio_details() {
	dbvalidations.validateExpenseRatioDetails();
}

@Then("user should able to see network ratio details")
public void user_should_able_to_see_network_ratio_details() {
    dbvalidations.validateNetworkRatioDetails();

}

@Then("user should able to see liquidity ratio details")
public void user_should_able_to_see_liquidity_ratio_details() {
   dbvalidations.validateLiquidityRatioDetails();
}

@Then("user should able to see solvency ratio details")
public void user_should_able_to_see_solvency_ratio_details() {
    dbvalidations.validateSolvencyRatioDetails();
}

	/*
	 * Goal Analysis
	 */
	@And("user clicks on goals analysis button")
	public void user_clicks_on_goals_analysis_button() {
		dbvalidations.clickGoalAnalysisBtn();
	}

	@Then("user should able to see emergency goal details")
	public void user_should_able_to_see_emergency_goal_details() {
		dbvalidations.validateGoalAnalysisEmergencyDetails();
	}

	@And("user should able to see contigency goal details")
	public void user_should_able_to_see_contigency_goal_details() {
		dbvalidations.validateContigencyInGoalAnalysis();
	}

	@And("user should able to see retirement goal details")
	public void user_should_able_to_see_retirement_goal_details() {
		dbvalidations.validateRetirementInGoalAnalysis();
		dbvalidations.validateTotalGoalAnalysis();

	}
	/*
	 * Goal Assets
	 */

	@When("user clicks on goal asset mapping button")
	public void user_clicks_on_goal_asset_mapping_button() {
		dbvalidations.clickGoalAssetAMppingBtn();
	}

	@Then("user should able to see emergency goal asset details")
	public void user_should_able_to_see_emergency_goal_asset_details() {
		dbvalidations.validateEmgInGoalAsset();
	}

	@And("user should able to see contigency goal asset details")
	public void user_should_able_to_see_contigency_goal_asset_details() {
		dbvalidations.validateContigencyInGoalAssetsMapping();
		dbvalidations.validateTotalGoalAssetMapping();
	}

	/*
	 * Asset Goal Mapping
	 */
	@And("user clicks on asset goal mapping button")
	public void user_clicks_on_asset_goal_mapping_button() {
		dbvalidations.clickAssetGoalMappingbtn();
	}

	@Then("user should able to see asset goal mapping details")
	public void user_should_able_to_see_asset_goal_mapping_details() {
		dbvalidations.validateAssetGoalMappingDetails();
	}
	/*
	 * Asset Mapping Analysis and What if
	 */

	@And("user clicks on goal mapping analysis button")
	public void user_clicks_on_goal_mapping_analysis_button() {
		dbvalidations.clickGoalMappingAnalysisBtn();

	}

	@Then("user should able to see assest mapping analysis details")
	public void user_should_able_to_see_assest_mapping_analysis_details() {
		dbvalidations.validateGoalMappingAnalysis();

	}

	@When("user clicks on what if analysis button")
	public void user_clicks_on_what_if_analysis_button() {
		dbvalidations.clickWhatIfAnalysisbtn();

	}

	@Then("user should able to see the details or coming soon text")
	public void user_should_able_to_see_the_details_or_coming_soon_text() {
            dbvalidations.fintooRecValidationYearAndAge();
	}
    /*
     * Retirement plans
     */
	@And("user clicks on retirement planning")
	public void user_clicks_on_retirement_planning() {
	    dbvalidations.btnRetirementPlanning();
	}

	@Then("user should able to see info summary details")
	public void user_should_able_to_see_info_summary_details() {
	    dbvalidations.validateInfoSummaryDetails();

	}

	@When("user clicks on retirement corpus")
	public void user_clicks_on_retirement_corpus() {
	    dbvalidations.btnretirementCorpus();

	}

	@Then("user should able to see complete retirement expenses and validate if present")
	public void user_should_able_to_see_complete_retirement_expenses_and_validate_if_present() {
	    dbvalidations.validateCompleteRetirementExpensse();

	}

	@When("user clicks on cash flow in retirement")
	public void user_clicks_on_cash_flow_in_retirement() {
	    dbvalidations.btnCashFlowInRtment();

	}

	@And("user clicks on fintoo recommends cash flow")
	public void user_clicks_on_fintoo_recommends_cash_flow() {
	    dbvalidations.btnFintooRecomCashflow();

	}
}
