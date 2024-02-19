package com.Fintoo.bdd.web.step_definitions;

import com.Fintoo.bdd.web.screens.DashboardWP;

import io.cucumber.java.en.*;

public class DashboardSteps {
	DashboardWP dashboard = new DashboardWP();

	@When("User clicks on StartNow button")
	public void user_clicks_on_start_now_button() {
		dashboard.clickOnStartNowBtn();
	}

	@Then("user should able to see different pricing options")
	public void user_should_able_to_see_different_pricing_options() {
		dashboard.roboAdvisoryTextValidation();
	}

	@When("User selects RoboAdvisory option and clicks on get started button")
	public void user_selects_robo_advisory_option_and_clicks_on_get_started_button() {
		dashboard.clickOnGetStartedBtn();
	}

	@Then("User should able to see subscription page")
	public void user_should_able_to_see_subscription_page() {
		dashboard.subscriptionTextValidation();
	}

	@When("User clicks on apply offer button")
	public void user_clicks_on_apply_offer_button() {
		dashboard.clickOnApplyCouponBtn();
	}

	@When("User enters coupon details and clicks on apply button")
	public void user_enters_coupon_details_and_clicks_on_apply_button() {
		dashboard.enterCouponValue();
		dashboard.clickOnApplyButton();
	}

	@When("User needs to click on checkbox for NDA")
	public void user_needs_to_click_on_checkbox_for_nda() {
		dashboard.ndaCheckBox();
	}

	@When("User clicks on pay button")
	public void user_clicks_on_pay_button() {
		dashboard.clickOnPayBtn();
	}

	@When("User needs to fill the details in yourinfo page and clicks on save and continue button")
	public void user_needs_to_fill_the_details_in_yourinfo_page_and_clicks_on_save_and_continue_button()
			throws InterruptedException {
		dashboard.yourInfo();
	}

	@When("User needs to enter details in know your risk module and clicks on next button")
	public void user_needs_to_enter_details_in_know_your_risk_module_and_clicks_on_next_button()
			throws InterruptedException {
		dashboard.knowYourRisk();
	}

	@When("User needs to enter details in Assumption and clicks on next button")
	public void user_needs_to_enter_details_in_assumption_and_clicks_on_next_button() throws InterruptedException {
		dashboard.AssumptionPage();
	}

	@When("User needs to enter yourfamily details and clicks on save button")
	public void user_needs_to_enter_yourfamily_details_and_clicks_on_save_button() {
		dashboard.YourFamilyPage();
	}

	// ========ADD GOAL============
	@When("User clicks on add goals button")
	public void user_clicks_on_add_goals_button() {
		dashboard.addGoal();
	}

	@Then("User should able to see Add goals form")
	public void user_should_able_to_see_add_goals_form() {
		dashboard.goalFormvalidation();
	}

	@When("User clicks on Emergency button and needs to fill the details and clicks on save button")
	public void user_clicks_on_emergency_button_and_needs_to_fill_the_details_and_clicks_on_save_button() {
		dashboard.emergencyInGoal();
	}

	// ===========INCOME==========
	@When("user clicks on add income button")
	public void user_clicks_on_add_income_button() {
		dashboard.addIncome();
	}

	@Then("user should able to see add income heading")
	public void user_should_able_to_see_add_income_heading() {
		dashboard.addincomevalidation();
	}

	@When("user clicks on salary and bonus and enter details and clicks on save button")
	public void user_clicks_on_salary_and_bonus_and_enter_details_and_clicks_on_save_button()
			throws InterruptedException {
		dashboard.salaryandbonusinINcome();
	}

	@When("user clicks on add asset button in dashboard")
	public void user_clicks_on_add_asset_button_in_dashboard() {
		dashboard.addAsset();
	}

	@When("user clicks on add asset button and enter all details and clicks on save")
	public void user_clicks_on_add_asset_button_and_enter_all_details_and_clicks_on_save() throws InterruptedException {

		dashboard.addAssetDetails();
	}

	@When("user clicks on car loan and enter details and clicks on save button")
	public void user_clicks_on_car_loan_and_enter_details_and_clicks_on_save_button() {
		dashboard.carloan();
	}

	@When("user clicks on insurance button enter particular details and clicks on continue button")
	public void user_clicks_on_insurance_button_enter_particular_details_and_clicks_on_continue_button() {
		dashboard.insurance();
	}

	@When("user clicks on general isurance button and enters particular details and clicks on save and continue button")
	public void user_clicks_on_general_isurance_button_and_enters_particular_details_and_clicks_on_save_and_continue_button() {
		dashboard.generealInsurance();
	}

	@When("user clicks on Generate Report button")
	public void user_clicks_on_generate_report_button() {
		dashboard.generatereport();
	}

	@When("user clicks on goals button")
	public void user_clicks_on_goals_button() {
		dashboard.clickgoals();
	}

	@When("User clicks on income and expenses button")
	public void user_clicks_on_income_and_expenses_button() {
		dashboard.clickincomeandexpenses();
	}

	@When("User clicks on assets and liabilities button")
	public void user_clicks_on_assets_and_liabilities_button() {
		dashboard.clickassetandliabilities();
	}

	@When("user clicks on edit data button and clicks on generate report button")
	public void user_clicks_on_edit_data_button_and_clicks_on_generate_report_button() {
		dashboard.editData();
	}

	@When("user clicks on next,Glossary,Disclaimer,Next button")
	public void user_clicks_on_next_glossary_disclaimer_next_button() {
		dashboard.introduction();
	}

	@When("user clicks on Your profile button")
	public void user_clicks_on_your_profile_button() {
		dashboard.yourprofile();
	}

	@Then("user needs to validate the data with entered data")
	public void user_needs_to_validate_the_data_with_entered_data() {
		dashboard.profilevalidation();
	}

	@When("user clicks on AboutyourFamily button")
	public void user_clicks_on_aboutyour_family_button() {
		dashboard.aboutYourfamily();
	}

	@Then("user needs to validate the family details")
	public void user_needs_to_validate_the_family_details() {
		dashboard.famdetailsValidation();
	}

	@When("User clicks on Marriage button and needs to fill the details and clicks on save button")
	public void user_clicks_on_marriage_button_and_needs_to_fill_the_details_and_clicks_on_save_button() {
		dashboard.addMarriageinGoals();
	}

	@When("user clicks on Gifts and enter details and clicks on save button")
	public void user_clicks_on_gifts_and_enter_details_and_clicks_on_save_button() {
		dashboard.addGiftsinIncome();
	}

	@When("user clicks on alternate button and enter all details and clicks on save")
	public void user_clicks_on_alternate_button_and_enter_all_details_and_clicks_on_save() {
		dashboard.addAlternateInIncome();
	}

	@When("user clicks on consumer loan and enter details and clicks on save button")
	public void user_clicks_on_consumer_loan_and_enter_details_and_clicks_on_save_button() {
		dashboard.addConsumerLoan();
	}

	@When("user clicks on guaranteed income plan button and enters particular details and clicks on save and continue button")
	public void user_clicks_on_guaranteed_income_plan_button_and_enters_particular_details_and_clicks_on_save_and_continue_button() {
		dashboard.addGuaranteedincomePlan();
	}

	@When("User clicks on Vehicle button and needs to fill the details and clicks on save button")
	public void user_clicks_on_vehicle_button_and_needs_to_fill_the_details_and_clicks_on_save_button() {
		dashboard.addVehicleInGoal();
	}

	@When("user clicks on Interest Income and enter details and clicks on save button")
	public void user_clicks_on_interest_income_and_enter_details_and_clicks_on_save_button() {
		dashboard.addInterestIncomeinIncome();
	}

	@When("user clicks on Gold button and enter all details and clicks on save")
	public void user_clicks_on_gold_button_and_enter_all_details_and_clicks_on_save() {
		dashboard.addGoldInassets();
	}

	@When("user clicks on Credit card and enter details and clicks on save button")
	public void user_clicks_on_credit_card_and_enter_details_and_clicks_on_save_button() {
		dashboard.addCreditCardInLiabilities();
	}

	@When("user clicks on Mediclaim button and enters particular details and clicks on save and continue button")
	public void user_clicks_on_mediclaim_button_and_enters_particular_details_and_clicks_on_save_and_continue_button() {
		dashboard.addMediclaimInInsurance();
	}

	@When("User needs to enter Father details and clicks on save button")
	public void user_needs_to_enter_father_details_and_clicks_on_save_button() {
		dashboard.addFatherinYourFamily();
	}

	@When("User clicks on Vacation button and needs to fill the details and clicks on save button")
	public void user_clicks_on_vacation_button_and_needs_to_fill_the_details_and_clicks_on_save_button() {
		dashboard.addVacationINGoal();
	}

	@When("user clicks on Rental and enter details and clicks on save button")
	public void user_clicks_on_rental_and_enter_details_and_clicks_on_save_button() {
		dashboard.addRentalInIncome();
	}

	@When("user clicks on Liquid button and enter all details and clicks on save")
	public void user_clicks_on_liquid_button_and_enter_all_details_and_clicks_on_save() {
		dashboard.addLiquidInAssets();
	}

	@When("user clicks on Housing and enter details and clicks on save button")
	public void user_clicks_on_housing_and_enter_details_and_clicks_on_save_button() {
		dashboard.addHousingInLiabilities();
	}

	@When("user clicks on Pension Plan button and enters particular details and clicks on save and continue button")
	public void user_clicks_on_pension_plan_button_and_enters_particular_details_and_clicks_on_save_and_continue_button() {
		dashboard.addPensionPlaninInsurance();
	}

	@When("User needs to enter Mother details and clicks on save button")
	public void user_needs_to_enter_mother_details_and_clicks_on_save_button() {
		dashboard.addMotherInFamily();
	}

	@When("User clicks on Property button and needs to fill the details and clicks on save button")
	public void user_clicks_on_property_button_and_needs_to_fill_the_details_and_clicks_on_save_button() {
		dashboard.addPropertyInGoals();
	}

	@When("user clicks on Pension and enter details and clicks on save button")
	public void user_clicks_on_pension_and_enter_details_and_clicks_on_save_button() {
		dashboard.addPensionInIncome();
	}

	@When("user clicks on Debt button and enter all details and clicks on save")
	public void user_clicks_on_debt_button_and_enter_all_details_and_clicks_on_save() {
		dashboard.addDebtInAssets();
	}

	@When("user clicks on Business Loan and enter details and clicks on save button")
	public void user_clicks_on_business_loan_and_enter_details_and_clicks_on_save_button() {
		dashboard.addBusinessLoaninLiabilities();
	}

	@When("user clicks on Endowment button and enters particular details and clicks on save and continue button")
	public void user_clicks_on_endowment_button_and_enters_particular_details_and_clicks_on_save_and_continue_button() {
		dashboard.addEndowment();
	}

	@When("User clicks on Education button and needs to fill the details and clicks on save button")
	public void user_clicks_on_education_button_and_needs_to_fill_the_details_and_clicks_on_save_button() {
		dashboard.clickEducationInGoals();
	}

	// ============Income Business=====================//
	@When("user clicks on business and enter details and clicks on save button")
	public void user_clicks_on_business_and_enter_details_and_clicks_on_save_button() throws InterruptedException {
		dashboard.incomeBusinessDetails();
	}

	// =============Business Income and club expenses

	@And("User clicks club and membership button and fill the details and clicks on save button")
	public void user_clicks_club_and_membership_button_and_fill_the_details_and_clicks_on_save_button() {

	}

	@When("user clicks on Equity button and enter all details and clicks on save")
	public void user_clicks_on_equity_button_and_enter_all_details_and_clicks_on_save() {
		dashboard.assestsEquity();
	}

	@When("user clicks on Personal loan and enter details and clicks on save button")
	public void user_clicks_on_personal_loan_and_enter_details_and_clicks_on_save_button() {
		dashboard.personalLoanLiabilities();
	}

	@When("user clicks on Others button and enters particular details and clicks on save and continue button")
	public void user_clicks_on_others_button_and_enters_particular_details_and_clicks_on_save_and_continue_button() {
		dashboard.insurance();
		dashboard.insuranceOthers();
	}

//===================================Son Details in family details tab======================
	@When("User needs to enter your son deatils in family details and clicks on save button")
	public void user_needs_to_enter_your_son_deatils_in_family_details_and_clicks_on_save_button() {
		dashboard.familyDetailsOfSon();
	}
//====================================others==========================//

	@Then("User clicks on Other button and needs to fill the details and click on save button")
	public void user_clicks_on_other_button_and_needs_to_fill_the_details_and_click_on_save_button() {
		dashboard.goalOthersBtn();
	}

	@When("user clicks on other and enter details and clicks on save button")
	public void user_clicks_on_other_and_enter_details_and_clicks_on_save_button() {
		dashboard.incomeOther();

	}

	@When("user clicks on Others button and enter all details and clicks on save")
	public void user_clicks_on_others_button_and_enter_all_details_and_clicks_on_save() {
		dashboard.assestsOthers();
		// dashboard.liabilitiesOtherPropertyLoan();
	}

	@When("user clicks on Other Property loan and enter details and clicks on save button")
	public void user_clicks_on_other_property_loan_and_enter_details_and_clicks_on_save_button() {
		dashboard.liabilitiesOtherPropertyLoan();
	}

	@When("user clicks on term Plan button and enters particular details and clicks on save and continue button")
	public void user_clicks_on_term_plan_button_and_enters_particular_details_and_clicks_on_save_and_continue_button() {
		dashboard.insuranceTermPlan();
	}
	@When("User needs to enter your family other details and clicks on save button")
	public void user_needs_to_enter_your_family_other_details_and_clicks_on_save_button() {
	   dashboard.familyOtherDetails();
	}
   /*
    * Equity in Assets
    */
	@When("user clicks on all Equity button and enter all details and clicks on save")
	public void user_clicks_on_all_equity_button_and_enter_all_details_and_clicks_on_save() throws InterruptedException {
	    dashboard.assestsEquity();
	    dashboard.assetsEquityEquityShares();
	    dashboard.assetsEquityEquMutualFund();
	    dashboard.assetsEquityESOp();
	    dashboard.assetsEquityPMS();
	    dashboard.assetsEquityUnlisted();
	    dashboard.assetsEquityUS_Equity();
	    dashboard.assetsEquityOthers();
	}
	    @When("user clicks on  all Liquid button and enter all details and clicks on save")
	    public void user_clicks_on_all_liquid_button_and_enter_all_details_and_clicks_on_save() {
	       dashboard.addLiquidInAssets();
	       dashboard.addBankBalInLiquidAssets();
	       dashboard.addLiquidFundsInLiquidassets();
	       dashboard.addOthersInLiquidAssets();
	    	
	    }

	    @When("user clicks on  all Real Estate button and enter all details and clicks on save")
	    public void user_clicks_on_all_real_estate_button_and_enter_all_details_and_clicks_on_save() throws InterruptedException {
	       dashboard.addAssetDetails();
	       dashboard.addCommercicalInRealEstateAsset();
	       dashboard.addLandInRealEstateAsset();
	       dashboard.addResPremisesInRealEstAsset();
	       dashboard.addUnderConsPropInRealEstAsset();
	       dashboard.addOthersInRealEstAsset();
	    }
	    @When("user clicks on  all Alternate button and enter all details and clicks on save")
	    public void user_clicks_on_all_alternate_button_and_enter_all_details_and_clicks_on_save() {
		       dashboard.addCommodityInAlternateAssets();
		       dashboard.addCryptoCurrencyInAlternateAssets();
		       dashboard.addVintageInAlternateAssets();
		       dashboard.addOthersInAlternateAssets();
		       dashboard.addArtInvestmentInAlternateAssets();
		       dashboard.addAlternateInIncome();
	    }
	    @When("user clicks on  all Gold button and enter all details and clicks on save")
	    public void user_clicks_on_all_gold_button_and_enter_all_details_and_clicks_on_save() {
	       dashboard.addSovereignGoldAssets();
	       dashboard.addOthersInGoldAssets();
	       dashboard.addGoldETFInGoldAssets();
	       dashboard.addGoldMutFundInGoldAssets();
	       dashboard.addGoldInassets();
	    }
        @When("user clicks on  all Debt button and enter all details and clicks on save")

        public void user_clicks_on_all_debt_button_and_enter_all_details_and_clicks_on_save() {

           dashboard.addDebtInAssets();
           dashboard.addDebenturesinDebtAsset();
           dashboard.addMutualFundsinDebtAsset();
           dashboard.addEPFinDebtAsset();
           dashboard.addGratuityinDebtAsset();
           dashboard.addGovtBondinDebtAsset();
           dashboard.addGovtSchemeinDebtAsset();
           dashboard.addNPSinDebtAsset();
           dashboard.addNSCKVPinDebtAsset();
           dashboard.addPensionSchemeinDebtAsset();
           dashboard.addPostOfficeSchinDebtAsset();
           dashboard.addPPFGPFVPFinDebtAsset();
           dashboard.addSukanyaSamriddhiYojanainDebtAsset();
           dashboard.addRecurringDepositinDebtAsset();
           dashboard.addOthersinDebtAsset();

           

        }

	



}
