package com.Fintoo.bdd.web.step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import com.Fintoo.bdd.web.screens.AdvisoryWP;

public class AdvisoryStep {

	AdvisoryWP dashboard = new AdvisoryWP();

	@When("User MouseHover on Advisory and clicks on Financial planning")
	public void user_mouse_hover_on_advisory_and_clicks_on_financisl_planning() {
		dashboard.clickOnFinancialPlanning();
	}

	@Then("user should able to see the greeting message")
	public void user_should_able_to_see_the_greeting_message() {
		dashboard.validationOnFinancialPlanIntro();
	}

	@When("User clicks on Get Started button")
	public void user_clicks_on_get_started_button() {
		dashboard.clickOnGetStartInFinancialPlan();
	}

	@When("User clicks on  Get Started in Assisted Advisory")
	public void user_clicks_on_get_started_in_assisted_advisory() {
		dashboard.clickOnGetStaredinAssistedAdvsiory();
	}

	@When("User clicks on Filter option Location as Delhi")
	public void user_clicks_on_filter_option_location_as_delhi() {
		dashboard.clickonDelhiLocation();
	}

	@Then("User should able to see the Experts available in Delhi location")
	public void user_should_able_to_see_the_experts_available_in_delhi_location() {
		dashboard.validationinBookingExpertAnilVerma();
	}

	@When("User  clicks on the Expert and clicks on Book an Appointment")
	public void user_clicks_on_the_expert_and_clicks_on_book_an_appointment() {
		dashboard.clickingonBookanAppointmentforverma();
	}

	@Then("User should see the text message as {string}")
	public void user_should_see_the_text_message_as(String string) {
		dashboard.validateSelectDateinAssist(string);
	}

	@When("User selects the Date for consultancy")
	public void user_selects_the_date_for_consultancy() {
		dashboard.selectingTheDateinAssist();
	}

	@Then("User should able to see the Text message {string} for consultancy Time")
	public void user_should_able_to_see_the_text_message_for_consultancy_time(String string) {
		dashboard.validateTimeinAssist(string);
	}

	@When("User selects the consultancy Time for Expert Anil")
	public void user_selects_the_consultancy_time_for_expert_anil() {
		dashboard.commonTime();// selectonTimeinAnilAssist();

	}

	@When("User selects the consultancy Time for Expert Shama")
	public void user_selects_the_consultancy_time_for_expert_shama() {
		dashboard.commonTime();// selectonTimeinShamaAssist();
	}

	@When("User selects the consultancy Time for Expert Mayuri")
	public void user_selects_the_consultancy_time_for_expert_mayuri() {
		dashboard.commonTime();// selectonTimeinMayuriAssist();
	}

	@When("User selects the consultancy Time for Expert Yash")
	public void user_selects_the_consultancy_time_for_expert_yash() {
		dashboard.commonTime();// selectonTimeinYashAssist();
	}

	@When("User selects the consultancy Time for Expert Kosar")
	public void user_selects_the_consultancy_time_for_expert_kosar() {
		dashboard.commonTime();// selectonTimeinKosarAssist();
	}

	@When("User selects the consultancy Time for Expert Maitri")
	public void user_selects_the_consultancy_time_for_expert_maitri() {
		dashboard.commonTime();// selectonTimeinMaitriAssist();
	}

	@When("User selects the consultancy Time for Expert Meghna")
	public void user_selects_the_consultancy_time_for_expert_meghna() {
		dashboard.commonTime();// selectonTimeinMeghnaAssist();
	}

	@Then("User should able to see the duration as {string}")
	public void user_should_able_to_see_the_duration_as(String string) {
		dashboard.validateOnConsultTimeinAssist(string);
	}

	@When("User enters details for booking an appointment  and clicks on Schedule Event")
	public void user_enters_details_for_booking_an_appointment_and_clicks_on_schedule_event() {
		dashboard.bookanAppointmentinAssistedAdvisory();
	}

	@Then("User should able to see message as {string}")
	public void user_should_able_to_see_message_as(String string) {

		dashboard.validationOnSchedule(string);
	}

	@When("User clicks on Filter option Location as Mumbai")
	public void user_clicks_on_filter_option_location_as_mumbai() {
		dashboard.clickOnMumbailocation();
	}

	@Then("User should able to see the Experts available in Mumbai location")
	public void user_should_able_to_see_the_experts_available_in_mumbai_location() {
		dashboard.validationinBookingExpertShama();
	}

	@When("User  clicks on the Expert and clicks on Book an Appointment button")
	public void user_clicks_on_the_expert_and_clicks_on_book_an_appointment_button() {
		dashboard.clickingonBookanAppointmentforShama();
	}

	@When("User clicks on Filter option Start rating as five")
	public void user_clicks_on_filter_option_start_rating_as_five() {
		dashboard.clickOnfivestarRating();
	}

	@Then("User should able to see the Experts available in five star rating")
	public void user_should_able_to_see_the_experts_available_in_five_star_rating() {
		dashboard.validationinBookingExpertMayuri();
	}

	@When("User  clicks on the Expert and clicks the Book an Appointment button")
	public void user_clicks_on_the_expert_and_clicks_the_book_an_appointment_button() {
		dashboard.clickingonBookanAppointmentforMayuri();
	}

	@When("User clicks on Filter option Start rating as four")
	public void user_clicks_on_filter_option_start_rating_as_four() {
		dashboard.clickOnfourstarRating();
	}

	@Then("User should able to see the Experts available in four star rating")
	public void user_should_able_to_see_the_experts_available_in_four_star_rating() {
		dashboard.validationinBookingExpertYash();
	}

	@When("User  clicks on the Expert and clicks on the Book an Appointment button.")
	public void user_clicks_on_the_expert_and_clicks_on_the_book_an_appointment_button() {
		dashboard.clickingonBookanAppointmentforYash();
	}

	@When("User clicks on Filter option Start rating as three")
	public void user_clicks_on_filter_option_start_rating_as_three() {
		dashboard.clickOnthreestarRating();
	}

	@Then("User should able to see  the response for Three star rating.")
	public void user_should_able_to_see_the_response_for_three_star_rating() {
		dashboard.validationinBookingExpertinthreestar();
	}

	@When("User clicks on Filter option Experience above four years")
	public void user_clicks_on_filter_option_experience_above_four_years() {
		dashboard.clickOnaboveFourYearExp();
	}

	@Then("User should able to see the Experts available in Experience above four years")
	public void user_should_able_to_see_the_experts_available_in_experience_above_four_years() {
		dashboard.validationinBookingExpertKosar();
	}

	@When("User  clicks on Expert and clicks Book an Appointment button.")
	public void user_clicks_on_expert_and_clicks_book_an_appointment_button() {
		dashboard.clickingonBookanAppointmentforKosar();
	}

	@When("User clicks on Filter option experience between two to four years")
	public void user_clicks_on_filter_option_experience_between_two_to_four_years() {
		dashboard.clickOnyearbetTwoandFouryearExp();
	}

	@Then("User should able to see the Experts available in experience between two to four years")
	public void user_should_able_to_see_the_experts_available_in_experience_between_two_to_four_years() {
		dashboard.validationinBookingExpertMaitri();
	}

	@When("User  clicks on Expert and clicks on the Book an Appointment button.")
	public void user_clicks_on_expert_and_clicks_on_the_book_an_appointment_button() {
		dashboard.clickingonBookanAppointmentforMaitri();
	}

	@When("User clicks on Filter option experience below two years")
	public void user_clicks_on_filter_option_experience_below_two_years() {
		dashboard.clickOnBelowTwoyearExp();
	}

	@Then("User should able to see the Experts available in experience below two years")
	public void user_should_able_to_see_the_experts_available_in_experience_below_two_years() {
		dashboard.validationinBookingExpertMeghna();
	}

	@When("User  clicks on the Expert and click on the Book an Appointment button.")
	public void user_clicks_on_the_expert_and_click_on_the_book_an_appointment_button() {
		dashboard.clickingonBookanAppointmentforMeghna();
	}

	@When("User MouseHover on Advisory and clicks on Retirement plan")
	public void user_mouse_hover_on_advisory_and_clicks_on_retirement_plan() {
		dashboard.clickOnRetirementPlan();
	}

	@Then("User should able to see the message as {string}")
	public void user_should_able_to_see_the_message_as(String string) {
		dashboard.validateTxtRetire(string);
	}

	@When("User clicks on Get Started")
	public void user_clicks_on_get_started() {
		dashboard.clickOnGetStarted();
	}

	@When("User selects the available Date")
	public void user_selects_the_available_date() {
		dashboard.selectOnAvailDate();
	}

	@Then("USer should able to see the Text as {string}")
	public void u_ser_should_able_to_see_the_text_as(String string) {
		dashboard.validateTimetext(string);
	}

	@When("User selects the available Time")
	public void user_selects_the_available_time() {
		dashboard.mainCommonTime();
	}

	@Then("User should able to see the consultancy text message as {string}")
	public void user_should_able_to_see_the_consultancy_text_message_as(String string) {
		dashboard.validateConsultRetirePlanTime(string);
	}

	@When("User books an appointment")
	public void user_books_an_appointment() throws Throwable {
		Thread.sleep(5000);
		dashboard.bookAnAppointment();
	}

	@Then("user should able to see the text as {string}")
	public void user_should_able_to_see_the_text_as(String string) {
		dashboard.StepsinRetirementplan(string);
	}

	@Then("User should able to see the text {string}")
	public void user_should_able_to_see_the_text(String string) {
		dashboard.lookLikeCustomeFinancialReport(string);
	}

	@Then("user should able to see  text as {string}")
	public void user_should_able_to_see_text_as(String string) {
		dashboard.customeFinancialPlan(string);
	}

	@Then("User should able to see {string}")
	public void user_should_able_to_see(String string) {
		dashboard.validationSecurity(string);
	}

	@Then("user should able to see greeting for Introductory Call")
	public void user_should_able_to_see_greeting_for_introductory_call() {
		dashboard.validateIntroCall();
	}

	@Then("User should able to see as {string} and questions")
	public void user_should_able_to_see_as_and_questions(String string) {
		dashboard.validateonFAQs(string);
	}

	@When("User MouseHover on Advisory and clicks on Tax plan")
	public void user_mouse_hover_on_advisory_and_clicks_on_tax_plan() {
		dashboard.clickOnTAxPlanning();
	}

	@Then("User should able to see the greeting message as {string}")
	public void user_should_able_to_see_the_greeting_message_as(String string) {
		dashboard.validationonTaxPlan(string);
	}

	@Then("User should see the text as {string}")
	public void user_should_see_the_text_as(String string) {
		dashboard.validateTextinTaxPlanner(string);
	}

	@Then("User should able to see the consultancy text message {string}")
	public void user_should_able_to_see_the_consultancy_text_message(String string) {
		dashboard.validateConsultTimeInTaxPlanner(string);
	}

	@Then("User should able to see intro for Sample Report")
	public void user_should_able_to_see_intro_for_sample_report() {
		dashboard.validateFinancialSampleRepintro();
	}

	@When("User clicks on the Sample Report to download")
	public void user_clicks_on_the_sample_report_to_download() {
		dashboard.Samplefiledownload();
	}

	@When("User should able to see Auto Advisory as  {string}")
	public void user_should_able_to_see_auto_advisory_as(String string) {
		dashboard.validateAutoAdvisory(string);
	}

	@When("User clicks on Start in Automatic Advisory")
	public void user_clicks_on_start_in_automatic_advisory() {
		dashboard.clickonStartAutoAdvisory();
	}

	@Then("User should able to see Advisory tab as {string}")
	public void user_should_able_to_see_advisory_tab_as(String string) {
		dashboard.validateOnStartAutoAdvisory(string);
	}

	@Then("User should able to see Expert Advisory as {string}")
	public void user_should_able_to_see_expert_advisory_as(String string) {
		dashboard.validateExpertAdvisory(string);
	}

	@When("User clicks on Start in Expert Advisory")
	public void user_clicks_on_start_in_expert_advisory() {
		dashboard.clickonStartExpertAdvisory();
	}

	@Then("User should able to see  the text message to bbok Appointment as {string}")
	public void user_should_able_to_see_the_text_message_to_bbok_appointment_as(String string) {
		dashboard.validateOnStartExpertAdvisory(string);
	}

	@Then("User should able to see step title as {string} and its steps")
	public void user_should_able_to_see_step_title_as_and_its_steps(String string) {
		dashboard.validateStepforFinanPlan(string);
		dashboard.validateonlistofStepsinFinanPlan();
	}

	@Then("User should able to see  text This Is How Your Customised Financial Report Will Look Like and its steps")
	public void user_should_able_to_see_text_this_is_how_your_customised_financial_report_will_look_like_and_its_steps() {
		dashboard.validateCustFinanPlan();
		dashboard.validateonlistinCustFinanPlan();
	}

	@Then("User shoudl able to see the Youtube link title for Financial Plan")
	public void user_shoudl_able_to_see_the_youtube_link_title_for_financial_plan() {
		dashboard.validateOnYoutubeTitleForFinanPlan();
	}

	@Then("User should able to see the Expert name as Anil Verma available in Delhi location")
	public void user_should_able_to_see_the_expert_name_as_anil_verma_available_in_delhi_location() {
		dashboard.validateOnAnilVerma();
	}

	@When("User  clicks on the Expert Anil Verma and clicks on Book an Appointment")
	public void user_clicks_on_the_expert_anil_verma_and_clicks_on_book_an_appointment() {
		dashboard.clickonExpert();
	}

	@Then("User should see the text message as {string} in ExpertPlan")
	public void user_should_see_the_text_message_as_in_expert_plan(String string) {
		dashboard.validateSelectDateinAssistUnderExpBtn(string);
	}

	@When("User selects the Date for consultancy in ExpertPlan")
	public void user_selects_the_date_for_consultancy_in_expert_plan() {
		dashboard.selectingTheDateinAssistUnderExpBtn();
	}

	@Then("User should able to see the Text message {string} for consultancy Time in ExpertPlan")
	public void user_should_able_to_see_the_text_message_for_consultancy_time_in_expert_plan(String string) {
		dashboard.validateTimeinAssistUnderExpBtn(string);
	}

	@When("User selects the consultancy Time in ExpertPlan")
	public void user_selects_the_consultancy_time_in_expert_plan() {
		dashboard.commonTimeUnderExpBtn();
	}

	@Then("User should able to see the duration as {string} in ExpertPlan")
	public void user_should_able_to_see_the_duration_as_in_expert_plan(String string) {

		dashboard.validateTimeinAssistUnderExpBtn(string);
	}

	@Then("User enters details for booking an appointment  and clicks on Schedule Event in ExpertPlan")
	public void user_enters_details_for_booking_an_appointment_and_clicks_on_schedule_event_in_expert_plan() {
		dashboard.bookanAppointmentinExpBtn();
	}

	@Then("User should able to see message as {string} in ExpertPlan")
	public void user_should_able_to_see_message_as_in_expert_plan(String string) {

		dashboard.validationOnScheduleUnderExpBtn(string);
	}

	
	@When("User enters the Name in the enter Details")
	public void user_enters_the_name_in_the_enter_details() {
		dashboard.enterTheNameforAppointment();
	}

	
	
	@When("User enters the Telnumber,IncomeExpense and clicks on ScheduleTime.")
	public void user_enters_the_telnumber_income_expense_and_clicks_on_schedule_time() {
	   
	}
	
	@Then("user should able to see the Email error message as {string}")
	public void user_should_able_to_see_the_email_error_message_as(String string) {
		dashboard.validateOnEmailError(string);
	}
	
	@When("^User enters the email id (.+) ,clicks on Add Guest and the enters the Guest email id (.+)$")
	public void user_enters_the_email_id_clicks_on_add_guest_and_the_enters_the_guest_email_id_(String string1, String string2)
	{
		dashboard.enterinvalidemailId( string1, string2);
	}

}
