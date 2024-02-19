package com.Fintoo.bdd.web.step_definitions;

import com.Fintoo.bdd.web.screens.Advisory_InvestmentWP;
import com.Fintoo.bdd.ccl.PlayActions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Advisory_InvestmentSD {

	Advisory_InvestmentWP invest = new Advisory_InvestmentWP();

	@When("User MouseHover on Advisory and clicks on Investment planning")
	public void user_mouse_hover_on_advisory_and_clicks_on_investment_planning() {
		invest.clickInvestmentPlan();
	}

	@Then("user should able to see the invest greeting message")
	public void user_should_able_to_see_the_greeting_message() {
		invest.validateInvestPage();
	}

	@Then("user should able to see {string} text message")
	public void user_should_able_to_see_text_message(String string) {
         invest.verifySelctADay(string);
	}

	@Then("user should navigate to thank you page")
	public void user_should_navigate_to_thank_you_page() throws Throwable {
		invest.validateThankYouPage();
	}

@Then("user should able to see the plans text as {string}")
public void user_should_able_to_see_the_plans_text_as(String string) {
   invest.validate360InvestableSavings(string);
}

@Then("user should able to see private plans {string}")
public void user_should_able_to_see_private_plans(String string) {
   invest.valiatePrivateMgt(string);
}

@Then("user should able to see equity plans {string}")
public void user_should_able_to_see_equity_plans(String string) {
    invest.validateEquityoff(string);
}

@Then("user should able to see debt investments plans {string}")
public void user_should_able_to_see_debt_investments_plans(String string) {
    invest.validateDebtInvesments(string);
}

@Then("user should able to see alternate investment plans {string}")
public void user_should_able_to_see_alternate_investment_plans(String string) {
    invest.validateAlternateInvstmentPlans(string);
}
/*
 * Negative 
 */
@When("User clicks on submit button without passing data")
public void user_clicks_on_submit_button_without_passing_data() {
    invest.clickSubmitBtnWithOutEnteringData();
}

@Then("User should able to see error msg {string}")
public void user_should_able_to_see_error_msg(String string) {
    invest.validateSubmitBtnErrmsg(string);
}
@Then("User should able to see income slab error msg as {string}")
public void user_should_able_to_see_income_slab_error_msg_as(String string) {
   invest.verIncomeSlabError(string);
}
/*
 * Invalid Phone number
 */

@When("User enters data in name, email id, text field")
public void user_enters_data_in_name_email_id_text_field() {
   invest.enterDetails();
}


@And("^User  enters invalid (.+)$")
public void user_enters_invalid(String Phonenumber) {
	invest.enterInvalidMobilenum(Phonenumber);
}

@When("User clicks on submit button")
public void user_clicks_on_submit_button() {
    invest.clickSubmitBtnWithOutEnteringData();

}

@Then("User should able to see the error msg as {string}")
public void user_should_able_to_see_the_error_msg_as(String string) {
   invest.verInvalidMobileErrMsg(string);
}




}
