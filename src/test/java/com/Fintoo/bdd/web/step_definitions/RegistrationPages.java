package com.Fintoo.bdd.web.step_definitions;
import com.Fintoo.bdd.web.screens.RegistrationWP;

import io.cucumber.java.en.*;

public class RegistrationPages {
	
	RegistrationWP registration = new RegistrationWP();
	@When("user clicks on registerNow button")
	public void user_clicks_on_register_now_button() {
		registration.clickOnRegisterNow();
	}

	@When("user enter valid details and clicks on register button")
	public void user_enter_valid_details_and_clicks_on_register_button() throws InterruptedException {
		registration.enterdetails();
		registration.registernow();
	}
	@When("user enters OTP and clicks on Submit button")
	public void user_enters_otp_and_clicks_on_submit_button() {
	    registration.enterOTP();
	}
	
	
	@When("user enters existing email id and click on register button")
	public void user_enters_existing_email_id_and_click_on_register_button() throws InterruptedException {
	    registration.enterexistingdetail();
	    registration.registernow();
	}

	@Then("user should able to see error message")
	public void user_should_able_to_see_error_message() {
	   registration.emailerror();
	}
	@When("user enters existing mobile number and click on register button")
	public void user_enters_existing_mobile_number_and_click_on_register_button() throws InterruptedException {
		registration.enterexistingdetail();
	    registration.registernow();
	}

	@Then("user should able to see error message for existing mobile number")
	public void user_should_able_to_see_error_message_for_existing_mobile_number() {
	registration.mobileError();
	}
	@When("user enters invalid captcha and click on register button")
	public void user_enters_invalid_captcha_and_click_on_register_button() {
		registration.invalidcaptcha();
	    registration.registernow();
	}

	@Then("user should able to see error message for invalid captcha")
	public void user_should_able_to_see_error_message_for_invalid_captcha() {
		registration.captchError();
	}

	@When("user enters all credentials and with ut clicking terms and agree check boxes and click on register button")
	public void user_enters_all_credentials_and_with_ut_clicking_terms_and_agree_check_boxes_and_click_on_register_button() {
		registration.withoutcheckingterms();
	    registration.registernow();
	}

	@Then("user should able to see error message for error message of checkboxes")
	public void user_should_able_to_see_error_message_for_error_message_of_checkboxes() {
	    registration.termsAgreeError();
	}


}
