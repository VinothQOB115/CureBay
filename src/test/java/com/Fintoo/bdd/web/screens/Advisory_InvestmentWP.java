


	package com.Fintoo.bdd.web.screens;

	import com.Fintoo.bdd.ccl.PlayActions;
	import com.Fintoo.bdd.integrations.common_utils.ConfigReader;
	import com.microsoft.playwright.FrameLocator;

	import io.cucumber.datatable.DataTable;


	public class Advisory_InvestmentWP {
		PlayActions play = new PlayActions();
		
		String tx_tq="//div[@class='style_ThankyouText__dVJaA']";
	    String tx_Investment="//ul[@class='style_submenu__b0XOk']//a[text()='Investment Planning']";
		String op_Advisory="//div[@class='style_link-url__GMKjl'][text()='Advisory']";
	    String txt_SaveMoney="//h3[@class=\"style_section-sub-title__ig-C7\"]";
	    String txt_Wealth="//h3[text()='NURTURE Wealth.']";
		String btn_GetStarted="//button[text()='GET STARTED']";
		String txt_vefifySelectADay="//h2[text()='Select a Day']";
		String frame = "//iframe[@title='Calendly Scheduling Page']";
		String ver_Thanku = "//div[text()='Thank you']";
		String ver_Success = "//div[text()='We have successfully received your details.']";
		String ver_our_expert = "//div[text()='Our Expert will get in touch with you shortly.']";
	    String ver_360Deg="//span[text()='Let’s Turn Your Idle Savings Into Profitable Investments With Our 360 Degree Investment Solutions.']";
	    String ver_private_mgt="//h2[text()='Private Wealth Management Solutions']";
	    String ver_Debt="//h2[text()='Debt Investments']";
	    String ver_Alternate="//h2[text()='Alternate Investments']";
	    String ver_Equity="//h2[text()='Equity Offerings']";
	    String verMobileInvalid_Err_Msg="//*[text()='This phone number format is not recognized. Please check the country and number.']";
	    String verName_Err_Msg="(//div[text()=\"Error: \"]/parent::div[text()=\"Can't be blank.\"])[1]";
	    String verEmail_Err_Msg="(//div[text()=\"Error: \"]/following::div[text()=\"Can't be blank.\"])";
	    String verIncomeSlab_Err_Msg="(//div[text()=\"Error: \"]/following::div[text()='One answer must be selected.'])";
	    String verPhNO_Err_Msg="(//div[text()=\"Error: \"]/parent::div[text()=\"Can't be blank.\"])[3]";
		String btn_SubmitinAssist="//button[@type='submit']";
		String txt_NameinAssist="//input[@name='full_name']";
		String txt_EmailinAssist="//input[@type='email']";
		String btn_AddGuestinAssist="//div[text()='Add Guests']";
		String txt_GuestEmailinAssist="//input[@id='invitee_guest_input']";
		String txt_TextareainAssist="//textarea[@type='textarea']";
		String op_IncomeSlabinAssist="//div[text()='I do not wish to disclose']";
		String op1_IncomeSlab="//div[text()='0  to 10 Lac']";
		String txt_TelinAssist="//input[@type='tel']";

	    
	    public void clickInvestmentPlan() {
	    	play.mouseHover(op_Advisory, "Mouse hovering on Advisory");
			play.click(tx_Investment, "Investment Planning");
	    }
	    public void validateInvestPage() {
			play.verifyText(play.getText(txt_SaveMoney), "Don’t Just SAVE Money, NURTURE Wealth.");	
	    }
	   public void verifySelctADay(String string) {
		   play.frameVerifyTxt(frame, txt_vefifySelectADay, string, string);	   
	   }
		public void validateThankYouPage() throws InterruptedException {
			Thread.sleep(10000);
			String actualTq =play.getText(tx_tq);
			String expectedTq ="Thank you";
			play.verifyText(actualTq,expectedTq);
			
//			String than =	play.framegettext(ver_Thanku);
			//play.frameVerifyTxt(frame, ver_Thanku, "Thank you");
//			FrameLocator framelocator = play.getPage().frameLocator(frame);
//			String actual = framelocator.locator(ver_Thanku).textContent();
			//play.verifyText(play.getText(actual), "Thank you");
//			String actual_1 = framelocator.locator(ver_Success).textContent();
//			play.verifyText(play.getText(actual_1), "We have successfully received your details.");
//			String actual_2 = framelocator.locator(ver_our_expert).textContent();
//			play.verifyText(play.getText(actual_2), "Our Expert will get in touch with you shortly.");
		}
		public void validate360InvestableSavings(String string) {
			play.verifyText(play.getText(ver_360Deg), string);	
		}
		public void valiatePrivateMgt(String string) {
			play.verifyText(play.getText(ver_private_mgt), string);
			
		}
		public void validateEquityoff(String string) {
			play.verifyText(play.getText(ver_Equity), string);
		}
		public void validateDebtInvesments(String string) {
			play.verifyText(play.getText(ver_Debt), string);
		}
		public void validateAlternateInvstmentPlans(String string) {
			play.verifyText(play.getText(ver_Alternate), string);
		}
		public void clickSubmitBtnWithOutEnteringData() {
			play.frameLocatorClick(frame, btn_SubmitinAssist, "Clicking on schedule");

		}
		public void validateSubmitBtnErrmsg(String string) {
			play.frameVerifyTxt(frame,verName_Err_Msg,string,string);
			play.frameVerifyTxt(frame,verEmail_Err_Msg,string,string);
			play.frameVerifyTxt(frame,verPhNO_Err_Msg,string,string);
		}
		public void verIncomeSlabError(String string) {
			play.frameVerifyTxt(frame,verIncomeSlab_Err_Msg,string,string);

		}
		 public void enterDetails()
		 {
			play.framelocatorFillByLocator(frame, txt_NameinAssist, ConfigReader.getValue("nameinAssistedadvisory"), "Entering  NAme");
			play.framelocatorFillByLocator(frame, txt_EmailinAssist, ConfigReader.getValue("emailinAssistedadvisory"), "Entering Email");
			play.frameLocatorClick(frame, btn_AddGuestinAssist, "Clicking on Add Guest");
			play.framelocatorFillByLocator(frame, txt_GuestEmailinAssist, ConfigReader.getValue("guestemailinassistedadvisory"), "Entering GuestEmail");
			play.framelocatorFillByLocator(frame, txt_TextareainAssist, ConfigReader.getValue("textareainAssisted"), "Entering text");
			
			 	
		 }
		 public void enterInvalidMobilenum(String Phonenumber) {
				play.framelocatorFillByLocator(frame, txt_TelinAssist, Phonenumber,"Invalid Phone number");
				play.frameLocatorClick(frame, op1_IncomeSlab, "Clicking on income salb");

		 }
		 public void verInvalidMobileErrMsg(String string) {
				play.frameVerifyTxt(frame,verMobileInvalid_Err_Msg,string,string);

		 }
	}

