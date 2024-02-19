package com.Fintoo.bdd.web.screens;

import com.Fintoo.bdd.ccl.PlayActions;
import com.Fintoo.bdd.integrations.common_utils.BrowserFactory;
import com.Fintoo.bdd.integrations.common_utils.ConfigReader;
import com.Fintoo.bdd.integrations.common_utils.RandomGenerator;
import com.microsoft.playwright.ElementHandle;
import com.microsoft.playwright.Frame;
import com.microsoft.playwright.FrameLocator;
import com.microsoft.playwright.Page;

public class DemoWP {

	public static String quote_ID;
	public static String OTP;

	String txt_UserName = "[placeholder=\"Enter your user ID\"]";
	String txt_Password = "[placeholder=\"Enter your code\"]";
	String btn_Login = "button:has-text(\"Sign In\")";
	String txt_ErrorMessage = "//*[@class='help-block']";
	String txt_notErrorMessage="//*[@class='help-blok']";
	PlayActions play = new PlayActions();

	public void Riskcovry_URL() {
		play.openURL(ConfigReader.getValue("riskcovry_URL"));
	}


	public void enter_Riskcovry_ValidUserName(String username) {
		play.sendKeys(txt_UserName, username, "Username");
	}

	public void enter_Riskcovry_ValidPassword(String password) {
		play.sendKeys(txt_Password, password, "Password");
	}

	public void verify_ErrorMessage() {
		play.getText(txt_ErrorMessage);
	}


	public void click_On_Login_Btn() {
		play.click(btn_Login, "Login_Btn");
	}


	public void user_should_able_not_to_see_error_message() {
		play.getText(txt_notErrorMessage);
		
	}
}