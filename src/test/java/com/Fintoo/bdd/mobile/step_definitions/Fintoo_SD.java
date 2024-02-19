package com.Fintoo.bdd.mobile.step_definitions;


import com.Fintoo.bdd.mobile.screens.Fintoo_WP;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Fintoo_SD {
    Fintoo_WP fintoo = new Fintoo_WP();
    

@When("user clicks on onboarding premission buttons")
public void user_clicks_on_onboarding_premission_buttons() {
    fintoo.clickOnboardingPermissionBtns();
}

@And("user clicks on Next buton")
public void user_clicks_on_next_buton() {
    fintoo.clickNextImgBtn();
}

@And("enters valid Email id and clicks on proceed button")
public void enters_valid_email_id_and_clicks_on_proceed_button() {
   fintoo.enterEMailIdAndClickProceedBtn();
}

@And("enters four digit Otp and clicks on procedd button")
public void enters_four_digit_otp_and_clicks_on_procedd_button() throws Throwable {
    fintoo.enterOTPAndClickProceedbtn();
}

@And("user clicks biometric authentication cancel option")
public void user_clicks_biometric_authentication_cancel_option() {
    fintoo.clickCancelBtn();
}


@Then("user should able to see advisory plans")
public void s_should_able_to_see_advisory_plans() {
   fintoo.verifyAdvisoryPage();
   
}
/*
 * Advisory financial
 */
@When("user clicks on financial planning option")
public void user_clicks_on_financial_planning_option() {
    fintoo.clickFinancialPlanning();
}

@Then("user enters into Robo Advisory page")
public void user_enters_into_robo_advisory_page() {
   fintoo.verRoboADvisory();
}

@When("user swipe right")
public void user_swipe_right() throws Throwable {
   fintoo.swipeUpAndScrollRight();
}

@Then("user should able to see Assisted Advisory")
public void user_should_able_to_see_assisted_advisory() throws Throwable {
   fintoo.verAssisatnceAdvisory();
}

@When("user scroll up and clicks on get started button")
public void user_scroll_up_and_clicks_on_get_started_button() {
   fintoo.clickGetStartedBtn();
}

@When("user clicks on filter option and select delhi")
public void user_clicks_on_filter_option_and_select_delhi() {
   fintoo.clickFilterAndSelectDelhi();
}

@When("user clicks on star rating and selects five star")
public void user_clicks_on_star_rating_and_selects_five_star() {
   fintoo.clickStartAndSelctFiveStarOption();
}

@When("user clicks on Apply button")
public void user_clicks_on_apply_button() {
   fintoo.clickApplyBtn();
}

@Then("user should able to see top five star rating person name")
public void user_should_able_to_see_top_five_star_rating_person_name() {
   fintoo.verFiveStarPerson();
}

@When("user clicks on the person and clicks on book an appointment")
public void user_clicks_on_the_person_and_clicks_on_book_an_appointment() throws Throwable {
    fintoo.clickRatedPerson();
}

@Then("user should able to see {string} page")
public void user_should_able_to_see_page(String string) {
     fintoo.verSelectADay(string);
}

@When("user clicks on available date")
public void user_clicks_on_available_date() {
   fintoo.selectAvailableDate();
}
@Then("user should able to see {string} page in time slecting page")
public void user_should_able_to_see_page_in_time_selecting_page(String string) {
     fintoo.verSelectTime(string);
}
@When("user clicks the time and clicks on Next button")
public void user_clicks_the_time_and_clicks_on_next_button() {
    fintoo.selectTimeFromAvaliableTimings();
}
@Then("user should able to see {string} msg in consultation page")
public void user_should_able_to_see_page_in_consultation(String string) {
     fintoo.ver15MinConsultation(string);
}

@When("user selects More than {int} crore option")
public void user_selects_more_than_crore_option(Integer int1) {
   fintoo.clickincomeSlabOneCr();
}

@When("user clicks on Schedule Event button")
public void user_clicks_on_schedule_event_button() {
   fintoo.clickOnScheduleAppointment();
}

@Then("user should able to see {string} message")
public void user_should_able_to_see_message(String string) {
   fintoo.verThankYoupage(string);
}

@When("user clicks on cross popup symbol and navigate back to homepage")
public void user_clicks_on_cross_popup_symbol_and_navigate_back_to_homepage() {
   fintoo.clickClosepopUp();
}
/*
 * Mumbai
 */
@When("user clicks on filter option and select mumbai")
public void user_clicks_on_filter_option_and_select_mumbai() {
    fintoo.clickMumbaiCheckBox();
}
@Then("user should able to see list of top five star rating persons name")
public void user_should_able_to_see_list_of_top_five_star_rating_persons_name() {
    fintoo.getListOfTopFiveAdvisorys();
}

@When("user clicks on the first person and clicks on book an appointment")
public void user_clicks_on_the_first_person_and_clicks_on_book_an_appointment() {
   fintoo.selectTopAdvisoryInMumbai();
}
/*
 * Four star mumbai
 */
@When("user clicks on star rating and selects four star")
public void user_clicks_on_star_rating_and_selects_four_star() {
	fintoo.clickStartAndSelctFourStarOption();
}
@Then("user should able to see list of top four star rating persons name")
public void user_sould_able_to_see_list_of_top_four_star_rating_persons_name() {
	fintoo.getListOfTopFourStarAdvisorys();
}
@When("user clicks on four star rated person and clicks on book an appointment")
public void user_clicks_on_four_star_rated_person_and_clicks_on_book_an_appointment() {
	fintoo.selectTopFourStarAdvisoryInMumbai();
}
}
