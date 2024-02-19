package com.Fintoo.bdd.web.step_definitions;



import com.Fintoo.bdd.web.screens.AfterReportGenWP;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AfterReportGenSteps {
	AfterReportGenWP dashboard= new AfterReportGenWP();
	
	@When("User clicks on the Asset and liabilties")
    public void user_clicks_on_the_asset_and_liabilties() {
    	dashboard.clickOnAssetLiaablitiesBtnAfterRep();
    }
	
	@Then("User should see the stored Assets in  under Asset Summary")
	public void user_should_see_the_stored_assets_in_under_asset_summary() {
	   dashboard.assetSummaryValidation();
	}

	@When("User clicks on Current Equity Investments")
	public void user_clicks_on_current_equity_investments() {
		dashboard.clickONCurrEquityInvestment();
	}

	@Then("User should able to see CompleteAsset button")
	public void user_should_able_to_see_complete_asset_button() {
		dashboard.validateCurrEquityInvestment();
	}

	

	@When("User clicks on Current Debt Investments")
	public void user_clicks_on_current_debt_investments() {
		dashboard.clickONDebtInvestment();
	}

	@Then("User should able to see Add Equity in Assts in Debt")
	public void user_should_able_to_see_add_equity_in_assts_in_debt() {
		dashboard.validateDebtInvestment();
	}

	

	@When("User clicks on Alternate Investment")
	public void user_clicks_on_alternate_investments() {
		dashboard.clickOnAlthernateandRealEstate();
	}

	@Then("Use should able to see Complete Asset button in Alternate")
	public void use_should_able_to_see_complete_asset_button_in_alternate() {
		dashboard.validateAlthernateandRealEstate();
	}


	@When("User clicks on Real estate under Asset Summary")
	public void user_clicks_on_real_estate_under_asset_summary() {
		dashboard.clickonRealEstateinRep();
	}

	@Then("User should able to see Real Estate Summary")
	public void user_should_able_to_see_real_estate_summary() {
		dashboard.validateRealEstateinAssetSummary();
	}

	@When("User clicks on ULIP under Asset Summary")
	public void user_clicks_on_ulip_under_asset_summary() {
    	dashboard.clickONUlip();

	}
	@Then("User shoudl able to see the Complete Insurance button")
	public void user_shoudl_able_to_see_the_complte_insurance_button() {
		dashboard.validateUlip();
	}
	
		
	@When("User clicks on Liabilities statement")
	public void user_clicks_on_liabilities_statement() {
		dashboard.clickonLiabilityStatements();
	}

    @Then("User should see the stored Liabilites in the tabs under liabilities statement")
    public void user_should_see_the_stored_liabilites_in_the_tabs_under_liabilities_statement() {
        dashboard.validationInLiabilities();
    }
    
    @When("User clicks on Net Worth")
    public void user_clicks_on_net_worth() {
        dashboard.clickOnNetWorth();
    }


    @Then("User should see the net worth statement under NetWorth tab")
    public void user_should_see_the_net_worth_statement_under_net_worth_tab() {
    	dashboard.validationinNetWorth();
    }
    
    @When("USer clicks on Finto Recommends")
    public void u_ser_clicks_on_finto_recommends() {
       dashboard.clickOnFintoRecommends();
    }


    @Then("User should see the ideal and current percentage under Finto Recommends tab")
    public void user_should_see_the_ideal_and_current_percentage_under_finto_recommends_tab() {
       dashboard.validationinFRecommends();
    }

    @When("User clicks on  Portfolio Analysis")
    public void user_clicks_on_portfolio_analysis() {
    	dashboard.clickOninPortfolio();
    }
    
    

@When("User clicks on Portfolio")
public void user_clicks_on_portfolio() {
	dashboard.clickonPortfoliounderPort();
}

@Then("User should able to see Complete button")
public void user_should_able_to_see_complete_button() {
	dashboard.validatePortfoliounderPort();
}

@When("User clicks on Performance")
public void user_clicks_on_performance() {
	dashboard.clickonPerformnace();
}

@Then("User should able to see Complete Asset and Liabilities button")
public void user_should_able_to_see_complete_asset_and_liabilities_button() {
	dashboard.validatetxtPerformance();
}

@When("User clicks on Holdings")
public void user_clicks_on_holdings() {
	dashboard.clickonHoldings();
}

@Then("User should see the Complete Asset and Liabilities button")
public void user_should_see_the_complete_asset_and_liabilities_button() {
	dashboard. valiateHoldings();
}

@When("User clicks on Real estate")
public void user_clicks_on_real_estate() {
	dashboard.clickonRealEstateunderPort();
}

@Then("user should see Complete Asset and Liabilities button")
public void user_should_see_complete_asset_and_liabilities_button() {
	dashboard.valiateRealEstateunderPort();
}


    @When("User clicks on WhatIf Analysis.")
    public void user_clicks_on_what_if_analysis() {
       
    	dashboard.clickOnWhatIfAnalysisTab();
    }
    
    @When("user clicks on Contingency Planning.")
    public void user_clicks_on_contingency_planning() {
        dashboard.clickonContingencyPlanning();
    }

    @Then("User should able to see the Emergency Corpus details")
    public void user_should_able_to_see_the_emergency_corpus_details() {
        dashboard.validateContingencyPlanningDetails();
    }

    @When("User clicks on Current Insurance under Contingency Planning.")
    public void user_clicks_on_current_insurance_under_contingency_planning() {
    	dashboard.clickonCurrentInsurance();
    }

    @Then("User should able to see the Current Health Insurance details.")
    public void user_should_able_to_see_the_current_health_insurance_details() {
    	dashboard.validateCurrentInsurance();
    }

    @When("User clicks on Life Insurance tab under Contingency Planning.")
    public void user_clicks_on_life_insurance_tab_under_contingency_planning() {
        dashboard.clickOnLifeInsurance();
    }
    
    @Then("User should able to see Complete Expense button")
    public void user_should_able_to_see_complete_expense_button() {
        dashboard.validateLifeInsurance();
    }
    
    @When("User clicks on Medical Insurance under Contingency Planning.")
    public void user_clicks_on_medcal_insurance_under_contingency_planning() {
    	dashboard.clickonMedicalInsurance();
    }

    @Then("User should able to see the Medical Insurance coverage.")
    public void user_should_able_to_see_the_medical_insurance_coverage() {
        dashboard.validateMedicalInsurance();
    }

    @When("User clicks on What If Analysis under contingency planning.")
    public void user_clicks_on_what_if_analysis_under_contingency_planning() {
        dashboard.clickonWhatIfInsurance();
    }

    @When("user clicks on Cash flow Analysis")
    public void user_clicks_on_cash_flow_analysis() {
        dashboard.clickonCashFlowAnalysis();
    }

    @Then("user should able to see the cash flow details stored in Net Surplus\\/Shortfall")
    public void user_should_able_to_see_the_cash_flow_details_stored_in_net_surplus_shortfall() {
        dashboard.validateNetSurPlusandShortFall();
    }

    @When("user clicks on Cash In flow tab")
    public void user_clicks_on_cash_in_flow_tab() {
        dashboard.clickonCashInFlow();
    }

    @Then("User should able to see the Cash In flow details")
    public void user_should_able_to_see_the_cash_in_flow_details() {
        dashboard.validateCashInFlow();;
    }

    @When("User clicks on Cash out flow tab")
    public void user_clicks_on_cash_out_flow_tab() {
        dashboard.clickoncashOutFlow();
    }

    @Then("user should able to see the Cash out flow details")
    public void user_should_able_to_see_the_cash_out_flow_details() {
        dashboard.validateCashOutFlow();
    }

    @Then("User should able to see the Finto reommendation details")
    public void user_should_able_to_see_the_finto_reommendation_details() {
        dashboard.validateFintoRecommend();
    }


}
