package com.Fintoo.bdd.web.screens;

import org.testng.Assert;

import com.Fintoo.bdd.ccl.PlayActions;
import com.Fintoo.bdd.integrations.common_utils.ConfigReader;

public class RegistrationWP {
	
	String btnRegisterNow="//a[text()='Register Now']";
	String txtFirstName="//input[@placeholder=\"Full Name*\"]";
	String txtEmail="//input[@placeholder='Email*']";
	String txtMobileNumber="//input[@id='phone']";
	String txtCaptcha="//input[@placeholder=\"Captcha*\"]";
	String chkbxTerms="(//input[@class=\"custom-checkbox\"])[1]";
	String chkbxAgree="(//input[@class=\"custom-checkbox\"])[2]";
	String btnRegister="//input[@name=\"login\"]";
	String txtOTP="//input[@class=\"default-input\"]";
	String btnSubmitOtp="//input[@value=\"Submit\"]";
	String txtEmailError="//h6[text()=\"Email is already registered.\"]";
	String txtMobileError="//h6[text()=\"Mobile is already registered.\"]";
	String txtInvalidCaptcha="//h6[text()=\"Please enter valid captcha\"]";
	String txtInvalidTerms="//span[@id=\"faa_span\"]";
	String txtInvalidAgree="//span[@id=\"faa_span_sms\"]";
	
	PlayActions play = new PlayActions();
	
	public void clickOnRegisterNow() {
		play.click(btnRegisterNow, "register Now Button");
	}
	public void enterdetails() throws InterruptedException {
		play.sendKeys(txtFirstName,ConfigReader.getValue("firstname_reg") , "First Name");
		play.sendKeys(txtEmail,ConfigReader.getValue("email_reg") , "Email");
		Thread.sleep(3000);
		play.sendKeys(txtMobileNumber, ConfigReader.getValue("mobile_reg"), "Mobile NUmber");
		Thread.sleep(3000);
		play.sendKeys(txtCaptcha, ConfigReader.getValue("captcha"), btnRegister);
		play.click(chkbxTerms, "Agree");
		play.click(chkbxAgree, "Terms");
		
	}
	public void enterexistingdetail() throws InterruptedException {
		play.sendKeys(txtFirstName,ConfigReader.getValue("firstname_reg") , "First Name");
		play.sendKeys(txtEmail,ConfigReader.getValue("email_reg2") , "Email");
		Thread.sleep(3000);
		play.sendKeys(txtMobileNumber, ConfigReader.getValue("mobile_reg2"), "Mobile NUmber");
		Thread.sleep(3000);
		play.sendKeys(txtCaptcha, ConfigReader.getValue("captcha"), btnRegister);
		play.check(chkbxTerms, "Agree");
		play.check(chkbxAgree, "Terms");
	}
	public void registernow() {
		play.click(btnRegister, "Register Now");
	}
	public void enterOTP()
	{
		play.sendKeys(txtOTP, ConfigReader.getValue("otp"), "OTP");
		play.click(btnSubmitOtp, "SubmitOTP");
	}
	public void emailerror() {
		Boolean Actualemlerr=play.isDisplayed(txtEmailError, "email Error message");
		Assert.assertTrue(Actualemlerr);
	}
	public void mobileError() {
		Boolean Actualmblerr=play.isDisplayed(txtMobileError, "mobile Error Message");
		Assert.assertTrue(Actualmblerr);
	}
	public void invalidcaptcha() {
		play.sendKeys(txtFirstName,ConfigReader.getValue("firstname_reg") , "First Name");
		play.sendKeys(txtEmail,ConfigReader.getValue("email_reg") , "Email");
		play.sendKeys(txtMobileNumber, ConfigReader.getValue("mobile_reg"), "Mobile NUmber");
		play.sendKeys(txtCaptcha, ConfigReader.getValue("invalidcaptcha"), btnRegister);
		play.check(chkbxTerms, "Agree");
		play.check(chkbxAgree, "Terms");
	}
	public void captchError() {
		Boolean Actualcaptcha=play.isDisplayed(txtInvalidCaptcha, "captcha Error");
		Assert.assertTrue(Actualcaptcha);
	}
	public void withoutcheckingterms() {
		play.sendKeys(txtFirstName,ConfigReader.getValue("firstname_reg") , "First Name");
		play.sendKeys(txtEmail,ConfigReader.getValue("email_reg1") , "Email");
		play.sendKeys(txtMobileNumber, ConfigReader.getValue("mobile_reg1"), "Mobile NUmber");
		play.sendKeys(txtCaptcha, ConfigReader.getValue("captcha"), btnRegister);
	}
	public void termsAgreeError() {
		Boolean Actual=play.isDisplayed(txtInvalidTerms, "Invalid Terms");
		Assert.assertTrue(Actual);
		Boolean ActualAgree=play.isDisplayed(txtInvalidAgree, "Invalid Agree");
		Assert.assertTrue(ActualAgree);
	}
	
}
