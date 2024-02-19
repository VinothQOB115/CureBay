package com.Fintoo.bdd.web.screens;

import org.testng.Assert;

import com.Fintoo.bdd.ccl.PlayActions;
import com.Fintoo.bdd.integrations.common_utils.ConfigReader;

public class LoginWP {

	String loginButton = "(//li[text()=\"Login\"])[2]";
	String welcomeText = "//h2[text()=\"Welcome!!\"]";
	String emailText = "//input[@id=\"emailmobile\"]";
	String captcha = "//input[@placeholder=\"Captcha*\"]";
	String sendOTPBtn = "//input[@value=\"Send OTP\"]";
	String otp="//input[@id=\"otp_v1\"]";
	String otp1="//input[@id=\"otp_v1\"]";
	String otp2="//input[@id=\"otp_v2\"]";
	String otp3 ="//input[@id=\"otp_v3\"]";
	String otp4 ="//input[@id=\"otp_v4\"]";
	String otp5 ="//input[@id=\"otp_v5\"]";
	String submitBtn = "//input[@value=\"Submit\"]";
	String dashboardbtn = "(//div[text()='Dashboard'])[1]";
	String username = "//strong[text()='abc']";
	String logout = "(//p[text()=\"Logout\"])[1]";
	String txtcaptchaError="//span[text()=\"Please enter valid captcha\"]";
	String txtinvalidotpError="//a[@id=\"otperrormsg\"]";

	PlayActions play = new PlayActions();

	public void Fintoo_URL() {
		play.openURL(ConfigReader.getValue("fintoo_URL"));
	}

	public void clickOnLoginButton() throws InterruptedException {
		play.waitForVisible(loginButton, 60000, "login button");
		play.click(loginButton, "login button");
	}

	public void getText() throws InterruptedException {
		play.waitForVisible(welcomeText, 60000, "welcome text message");
	}

	public void enterMobileNumber() throws InterruptedException {
		Thread.sleep(3000);
		play.enterText(emailText, ConfigReader.getValue("mobileNumber"), "mobile Number");
	}
	public void enterEmailId() throws InterruptedException {
		Thread.sleep(3000);
		play.enterText(emailText, ConfigReader.getValue("emailID"), "email Id");
	}

	public void enterCaptch() {
		play.enterText(captcha,ConfigReader.getValue("captcha"), "captcha");
	}

	public void clickOnSendOTP() {
		play.click(sendOTPBtn, "send OTP");
	}

	public void clickOnSubmitBtn() {
		play.click(otp, "otp");
		//play.enterText(otp,ConfigReader.getValue("otp"), "OTP");
		play.sendKeys(otp1,ConfigReader.getValue("otp1"), "OTP");
		play.sendKeys(otp2,ConfigReader.getValue("otp2"), "OTP");
		play.sendKeys(otp3,ConfigReader.getValue("otp3"), "OTP");
		play.sendKeys(otp4,ConfigReader.getValue("otp4"), "OTP");
		play.sendKeys(otp5,ConfigReader.getValue("otp5"), "OTP");
		play.click(submitBtn, "submit button");
	}

	public void homepage() {
		play.waitForVisible(dashboardbtn, 60000, "dashboard");
	}

	public void username() {
		play.mouseHover(username, "username Field");
	}

	public void cickOnLogout() {
		play.click(logout, "logout");
	}

	public void loginpage() throws InterruptedException {
		play.waitForVisible(loginButton, 60000, "loginButton");
	}
	public void invalidcapthca() {
		play.enterText(captcha,ConfigReader.getValue("invalidcaptcha"), "Invalid captcha");
	}
	public void invalidcaptchamsg() {
		boolean captchaError=play.isDisplayed(txtcaptchaError, "invalid captcha error");
		Assert.assertTrue(captchaError);
	}
	public void invaliotptext() throws InterruptedException {
		play.click(otp, "otp");
		play.enterText(captcha,ConfigReader.getValue("invalidOTP"), "Invalid OTP");
		play.click(submitBtn, "submit button");
	}
	public void invalidOTPmsg() {
		boolean OTPError=play.isDisplayed(txtinvalidotpError, "invalid OTP error");
		Assert.assertTrue(OTPError);
	}

}
