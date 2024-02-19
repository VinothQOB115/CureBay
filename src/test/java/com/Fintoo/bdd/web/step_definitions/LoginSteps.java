package com.Fintoo.bdd.web.step_definitions;

import com.Fintoo.bdd.web.screens.LoginWP;

import io.cucumber.java.en.*;


public class LoginSteps {
	LoginWP login = new LoginWP();

	@Given("User is in fintoo page")
	public void user_is_in_fintoo_page() {
		login.Fintoo_URL();
	}

	@When("user cicks on login button")
	public void user_cicks_on_login_button() throws InterruptedException {
		login.clickOnLoginButton();
	}

	@Then("user should be able to see the Welcome page")
	public void user_should_be_able_to_see_the_welcome_page() throws InterruptedException {
		login.getText();
	}

	@When("user enter username and captcha and clicks on SendOTP button")
	public void user_enter_username_and_captcha_and_clicks_on_send_otp_button() throws InterruptedException {
		login.enterMobileNumber();
		login.enterCaptch();
		login.clickOnSendOTP();
	}
	@When("user enters valid username and captcha and clicks on SendOTP button")
	public void user_enters_valid_username_and_captcha_and_clicks_on_send_otp_button() throws Throwable {
	   login.enterEmailId();
	   login.enterCaptch();
		login.clickOnSendOTP();
	}

	@And("user enter OTP and clicks on Submit button")
	public void user_enter_otp_and_clicks_on_submit_button() throws InterruptedException {
		login.clickOnSubmitBtn();
	}

	@Then("user should able to see HomePage")
	public void user_should_able_to_see_home_page() {
		login.homepage();
	}

	@When("user clicks on username and clicks on logout")
	public void user_clicks_on_username_and_clicks_on_logout() {
		login.username();
		login.cickOnLogout();
	}

	@Then("user should able to see login page")
	public void user_should_able_to_see_login_page() throws InterruptedException {
		login.loginpage();
	}
	
	@When("user enter invalid username and valid captcha and clicks on SendOTP button")
	public void user_enter_invalid_username_and_valid_captcha_and_clicks_on_send_otp_button() {
	    
	}

	@Then("user should able to see invalid user name error message")
	public void user_should_able_to_see_invalid_user_name_error_message() {
	
	}

	@When("user enter valid username and Invalid captcha and clicks on SendOTP button")
	public void user_enter_valid_username_and_invalid_captcha_and_clicks_on_send_otp_button() throws InterruptedException {
		login.enterMobileNumber();
	    login.invalidcapthca();
	    login.clickOnSendOTP();
	}

	@Then("user should able to see invalid captcha error message")
	public void user_should_able_to_see_invalid_captcha_error_message() {
	    login.invalidcaptchamsg();
	}

	@When("user enter Invalid OTP and clicks on Submit button")
	public void user_enter_invalid_otp_and_clicks_on_submit_button() throws InterruptedException {
	    login.invaliotptext();
	}
	@Then("user should able to see invalid OTP error message")
	public void user_should_able_to_see_invalid_otp_error_message() {
	    login.invalidOTPmsg();
	}


}
