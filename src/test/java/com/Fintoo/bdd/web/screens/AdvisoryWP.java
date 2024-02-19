package com.Fintoo.bdd.web.screens;

import java.util.List;

import org.testng.Assert;
import org.xml.sax.Locator;
import com.Fintoo.bdd.ccl.PlayActions;

import com.Fintoo.bdd.integrations.common_utils.BrowserFactory;
import com.Fintoo.bdd.integrations.common_utils.ConfigReader;
import com.Fintoo.bdd.integrations.report_utils.ReportManager;
import com.microsoft.playwright.Page;

public class AdvisoryWP {
	
		
		PlayActions play= new PlayActions();
	

		
		String op_Advisory="//div[@class='style_link-url__GMKjl'][text()='Advisory']";
		String op_FinancialPlanning="//ul[@class='style_submenu__b0XOk']//a[text()='Financial Planning']";
		String op_RetirementPlanning="//ul[@class='style_submenu__b0XOk']//a[text()='Retirement Planning']";
		String op_InvestmentPlanning="//ul[@class='style_submenu__b0XOk']//a[text()='Investment Planning']";
		String op_TaxPlanningop="//ul[@class='style_submenu__b0XOk']//a[text()='Tax Planning']";
		String op_RiskManagement="//ul[@class='style_submenu__b0XOk']//a[text()='Risk Management']";
		String txt_Financialplaninto="//h3[text()='Al-Driven Financial Planning, Achieve Your Financial Goals.']";
		String btn_GetStarted="//button[text()='GET STARTED']";
		String btn_AssistedAdvisory="//div[@class='item sm-mb50 item-active']//button[text()='Get Started']";
		String txt_Experts="//div[@class='Style_BigText__qaO-p']";
		String op_Delhiloc="//input[@id='delhlocation']";
		String txt_ExpertAnilVerma="//div[@class='slick-slide slick-active slick-current']//div[text()='Anil Verma']";
		
		
		String txt_btnExpAnilVerma="//div[contains(@class,'owl-item active')]//div[text()='Anil Verma']";
		String btn_btnExpBooknAppoint="//div[@id='RMDATA1']//button[contains(@class,'AppointmentDate')][normalize-space()='Book Appointment']";
		String iframe_btnExp="//div[@class='RMPersonalData mb-4']//iframe[@title='Select a Date & Time - Calendly'][1]";
		
		String email_Error="//div[@id='invitee_guest_errors']";
		
		
		String btn_BookanAppointmentinAssist="//button[text()='Book Appointment']";
		String frame_CalenderIframeinAssist="//div[@class='calendly-inline-widget']//iframe";
		//String btn_MovetoNextMonthinAssist="//button[@aria-label='Go to next month']";
		String txt_vefifySelectADay="//h2[text()='Select a Day']";
		String btn_MovetoNextMonthinAssist="//div[@class='nY1UdpJ_iaOmUQG5au5a F28Z1DL_NPeHHaq1Hnsx'][2]";
		String btn_CalenderDateinAssist="//button[@aria-label='Wednesday, August 23 - Times available']";
		//String btn_CalenderDateinAssist="//button[@aria-label='Tuesday, August 22 - Times available']";
		
		String btn_popup="//button[text()='Reject all']";
		
		
//		===================consulting Time==================================
		String btn_TimeinAnilAssist="//button[@data-start-time='11:30am']";
		String btn_NextTimeinAnilAssist="//button[@aria-label='Next 11:30am']";
		String btn_TimeinShamaAssist="//button[@data-start-time='11:45am']";
		String btn_NextTimeinShamaAssist="//button[@aria-label='Next 11:45am']";
		String btn_TimeinYashAssist="//button[@data-start-time='12:15pm']";
		String btn_NextTimeinYashAssist="//button[@aria-label='Next 12:15pm']";
		String btn_TimeinMayuriAssist="//button[@data-start-time='12:30pm']";
		String btn_NextTimeinMayuriAssist="//button[@aria-label='Next 12:30pm']";
		String btn_TimeinMaitriAssist="//button[@data-start-time='12:45pm']";
		String btn_NextTimeinMaitriAssist="//button[@aria-label='Next 12:45pm']";
		String btn_TimeinMeghnaAssist="//button[@data-start-time='1:00pm']";
		String btn_NextTimeinMeghnaAssist="//button[@aria-label='Next 1:00pm']";
		String btn_TimeinKosarAssist="//button[@data-start-time='1:30pm']";
		String btn_NextTimeinKosarAssist="//button[@aria-label='Next 1:30pm']";
	
		String btn_TimeCommon="//div[@role='listitem'][1]";
		String btn_TimeNextCommon="//div[@role='listitem'][1]/following::button[@role='button' and @aria-label='Next 2:30pm' ]";
		
		
		String btn1_TimeinAssist="//button[@data-start-time='2:30pm']";
		String btn1_NextTimeinAssist="//button[@aria-label='Next 3:30pm']";
		String btn2_TimeinAssist="//button[@data-start-time='1:30pm']";
		String btn2_NextTimeinAssist="//button[@aria-label='Next 1:30pm']";
		String txt_SelectTime="//h2[text()='Select a Time']";
		String btn_time="//div[@class=\"j1sPElHG5fkgLNJPo_Q_ BZeqDQO37C9rcYzv8s5n\"][text()='10:30am']";
		String btn_timenext="//button[@aria-label='Next 10:30am']";
		String txt_TimeconfirminAssist="//h1[text()='15 MINUTES CONSULTATION']";
		String txt_consultTime="//h1[@class='aJYfwRAjpy85vGyjTA_k aNTWZDYqtNuY8Y3A0Rlw nCQmpQ3zRtu1xXb_x8YC R1isNh0uc_tOLdsYmkAw']";
		String txt_NameinAssist="//input[@name='full_name']";
		String txt_EmailinAssist="//input[@type='email']";
		String btn_AddGuestinAssist="//div[text()='Add Guests']";
		String txt_GuestEmailinAssist="//input[@id='invitee_guest_input']";
		String txt_TextareainAssist="//textarea[@type='textarea']";
		String op_IncomeSlabinAssist="//div[text()='I do not wish to disclose']";
		String op1_IncomeSlab="//div[text()='0  to 10 Lac']";
		String txt_TelinAssist="//input[@type='tel']";
		String btn_SubmitinAssist="//button[@type='submit']";
		String txt_RespinAssist="//div[text()='You are scheduled with Fintoo.']";
		
		String op_MumLocation="//input[@id='mumblocation']";
		String txt_ExpertShama="//div[@class='slick-slide slick-active slick-current']//div[text()='Shama']";
		String op_fivestar="//input[@id='5star']";
		String txt_Expertmayuri="//div[@class='slick-slide slick-active slick-current']//div[text()='Mayuri Singh']";
		String op_fourstar="//input[@id='4star']";
		String txt_ExpertYash="//div[@class='slick-slide slick-active slick-current']//div[text()='Yash Jain']";
		String op_ThreeStar="//input[@id='3star']";
		String txt_threestar="//div[@class='d-none d-md-block Style_rmlist__qDQQV']";

		String op_abovefouryr="//input[@id='abovefour']";
		String txt_ExpertKosar="//div[@class='slick-slide slick-active slick-current']//div[text()='Kosar Tidiwala']";
		String op_bettwoandfour="//input[@id='btwtwotofour']";
		String txt_ExpertMaitri="//div[@class='slick-slide slick-active slick-current']//div[text()='Maitri Panchal']";
		String op_belowTwo="//input[@id='belowtwo']";
		String txt_ExpertMeghna="//div[@class='slick-slide slick-active slick-current']//div[text()='Meghna Jain']";
		
		
		String Txt_RetirementPlan="//h3[@class='style_section-sub-title__A2cv5']";
		String txt_title="//span[@class='style_section-title__PhfYL']";
		String Txt_StepsinRetirementplan="//span[@class='style_section-title__PhfYL'][text()='Steps To Create A Perfect Retirement Plan']";
		String txt_Planning="//div[text()='Planning']";
		String txt_designing="//div[text()='Designing']";
		String txt_Execution="//div[text()='Execution']";
		String txt_Review="//div[text()='Review']";
		String txt_custome="//span[text()='This Is How Your Customised Financial Report Will Look Like']";
		String txt_req="//p[text()='Requirements']";
		String txt_ReqCorpus="//p[text()='Retirement Corpus']";
		String txt_post="//p[text()='Projected Post Retirement Cashflow']";
		String txt_video="//span[text()='How Fintoo’s Customised Retirement Planning Helps You To  Achieve Your Goals.']";
		String txt_Security="//span[text()='Security']";
		String txt_DataSecurity="//p[text()='Data Security']";
		String txt_CloudInfra="//p[text()='Cloud Infrastructure']";
		String txt_AuthAccess="//p[text()='Authorized Access']";
		String txt_SecurityAudit="//p[text()='Security Audited']";
		String steps_createRetirePlan="//div[@class='style_StepsInvestmentPlancontent__r+b4B']";
		String steps_coustomiseReport="//p[@class='style_FPReportBoxContentTitle__cggES']";
		String security_info="//p[@class='style_SecurityContentTextHead__OtErk']";
		String Confused="//p[@class='text-center style_SectionTitle__0gdRa']";
		String Plan_Appoinment="//div[@class=' text-center style_appointment-section-text__OSYqY']";
		String Main_iFrame="//iframe[@title='Calendly Scheduling Page']";
		String txt_FAQs="//span[text()='FAQs']";
		String txt_quest="//div[@class='accordian-item']";
		
		String txt_TaxPlanner="//h2[@class='undefined']";
		String txt_EffectiveTaxPlam="//p[@class='style_FPtitle__IwB8u']";
		String txt_personalisedPlanner="//span[text()='Personalised Tax Planning Solutions for every Individual, Entrepreneur, Professional and Business. ']";
		String txt_plans="//h3[@class='style_widget-item-heading__Ki8It']";
		
		String txt_FinancialSampleRepintro="//p[@class='style_FPtitle__rk5jV']";
		String btn_SampleReport="//a[text()='Sample Report']";
		String txt_AutoAdvisory="//p[text()='Automated Advisory']";
		String txt_ExpertAdvisory="//p[text()='Expert Advisory']";
		String op_ExpertanilVermaa="//div[contains(@class,'owl-item active')]//div[contains(@class,'rmName ng-binding')][normalize-space()='Anil Verma']";
		String iframeExpertAd="//div[@id='calendly']//iframe[@title='Select a Date & Time - Calendly']";
		String btn_bookAppointmentforAnil="//button[@class='AppointmentDate']";
		String btn_AutoStart="//button[@class='ms-3  style_AdvisorycardBtn__mX08I' and text()='Start']";
		String btn_ExpStart="//button[@class=' style_AdvisorycardBtn__mX08I']";
		String txt_StartAutoAdvisory="//h2[text()='Advisory']";
		String txt_StartExpAdvisory="//div[text()=' Book Your Appointment with Expert Now']";
		String txt_StepsinFinancialPlan="//span[text()='Steps For Financial Planning']";
		String txt_listofStepsinFinanPlan="//div[@class='style_StepsInvestmentPlancontent__fgLyt']";
		String txt_listinCustFinanPlan="//p[@class='style_FPReportBoxContentTitle__+qVgC']";
		String txt_youtubetitleinFinanPlan="//div[@class=\"style_YoutubevideoContent__i2gWu\"]//span[@class='style_section-title__PhfYL']";
		
		
		public void enterTheNameforAppointment()
		 {
			play.framelocatorFillByLocator(Main_iFrame, txt_NameinAssist, ConfigReader.getValue("nameinAssistedadvisory"), "Entering  NAme");
						 		
		 }
		public void enterinvalidemailId(String string1, String string2)
		{
		play.framelocatorFillByLocator(Main_iFrame, txt_EmailinAssist, string1, "Entering Email");
		
			play.frameLocatorClick(Main_iFrame, btn_AddGuestinAssist, "Clicking on Add Guest");
			play.framelocatorFillByLocator(Main_iFrame, txt_GuestEmailinAssist, string2, "Entering GuestEmail");
			play.framelocatorFillByLocator(Main_iFrame, txt_TextareainAssist, ConfigReader.getValue("textareainAssisted"), "Entering text");
			
			
		}
		
		public void enterTelandIncome()
		{
			play.framelocatorFillByLocator(Main_iFrame, txt_TelinAssist, ConfigReader.getValue("telinAssitedAdvisory"), "Entering Contact number");
			play.frameLocatorClick(Main_iFrame, op1_IncomeSlab, "Clicking on income salb");
			play.frameLocatorClick(Main_iFrame, btn_SubmitinAssist, "Clicking on schedule");
		}
		
		
		public void commonTime()
		{
			play.frameLocatorClick(frame_CalenderIframeinAssist, btn_TimeCommon, "Clicking on Time");
			play.frameLocatorClick(frame_CalenderIframeinAssist, btn_TimeNextCommon, "Clicking on Next");
		}
		
		
		public void mainCommonTime()
		{
			play.frameLocatorClick(Main_iFrame, btn_TimeCommon, "Clicking on Time");
			try {
				play.frameLocatorClick(Main_iFrame, btn_TimeNextCommon, "Clicking on Next");
	
			}catch(Exception e) {
			play.frameLocatorClick(Main_iFrame,btn1_NextTimeinAssist, "Clicking on Next");}
		}
		
		public void validateOnAnilVerma()
		{
			String txt=play.getText(txt_btnExpAnilVerma);
			play.verifyText(play.getText(txt_btnExpAnilVerma), txt);
		}
		public void clickonExpert()
		{
			play.click(txt_btnExpAnilVerma, "Clicking on the Expert");
			play.click(btn_btnExpBooknAppoint, "clicking on the book an Appointment");
		}
		
		public void validateSelectDateinAssistUnderExpBtn(String string)
		{
			 String txt=play.framegettext(iframe_btnExp, txt_vefifySelectADay, string);

			play.frameVerifyTxt(iframe_btnExp, txt, string);
		}
		
		public void selectingTheDateinAssistUnderExpBtn()
		{
			
			//play.frameLocatorClick(frame_CalenderIframeinAssist, btn_MovetoNextMonthinAssist, "Moving on to next Month");
			play.frameLocatorClick(iframe_btnExp, btn_CalenderDateinAssist, "Clicking the available date");
		}
		
		
		public void validateTimeinAssistUnderExpBtn(String string) {
			 String txt=play.framegettext(iframe_btnExp, txt_SelectTime, string);

			play.frameVerifyTxt(iframe_btnExp, txt, string);
		}
		
		public void commonTimeUnderExpBtn()
		{
			play.frameLocatorClick(iframe_btnExp, btn_TimeCommon, "Clicking on Time");
			play.frameLocatorClick(iframe_btnExp, btn_TimeNextCommon, "Clicking on Next");
		}
		
		
		public void validateOnEmailError(String string)
		{
		 String txt=play.framegettext(Main_iFrame, email_Error, string);

			play.frameVerifyTxt(Main_iFrame, txt, string);
		}
		
	
		
		public void  bookanAppointmentinExpBtn()
		{
			play.framelocatorFillByLocator(iframe_btnExp, txt_NameinAssist, ConfigReader.getValue("nameinAssistedadvisory"), "Entering  NAme");
			play.framelocatorFillByLocator(iframe_btnExp, txt_EmailinAssist, ConfigReader.getValue("emailinAssistedadvisory"), "Entering Email");
			play.frameLocatorClick(iframe_btnExp, btn_AddGuestinAssist, "Clicking on Add Guest");
			play.framelocatorFillByLocator(iframe_btnExp, txt_GuestEmailinAssist, ConfigReader.getValue("guestemailinassistedadvisory"), "Entering GuestEmail");
			play.framelocatorFillByLocator(iframe_btnExp, txt_TextareainAssist, ConfigReader.getValue("textareainAssisted"), "Entering text");
			play.frameLocatorClick(iframe_btnExp, op_IncomeSlabinAssist, "Clicking on income salb");
			play.framelocatorFillByLocator(iframe_btnExp, txt_TelinAssist, ConfigReader.getValue("telinAssitedAdvisory"), "Entering Contact number");
			play.frameLocatorClick(iframe_btnExp, btn_SubmitinAssist, "Clicking on schedule");
			
			
		}
		public void validationOnScheduleUnderExpBtn(String string)
		{
			play.frameVerifyTxt(txt_RespinAssist, string, ConfigReader.getValue("ScheduleConfrimtxt"));
			
			
		}
		
		public void validateError(String string) {
			String txt=play.framegettext(iframe_btnExp, txt_SelectTime, string);

			play.frameVerifyTxt(iframe_btnExp, txt, string);
		}
		
		
		
		
		public void clickOnFinancialPlanning()
		{
			play.mouseHover(op_Advisory, "Mouse hovering on Advisory");
			play.click(op_FinancialPlanning, "Clicking on Financial Planning");
		}
		public void validationOnFinancialPlanIntro()
		{
			play.verifyText(play.getText(txt_Financialplaninto), ConfigReader.getValue("txtfinancialplan"));
		}
		public void clickOnGetStartInFinancialPlan()
		{
			play.click(btn_GetStarted, "Clicking on Get Started");
		
		}
		public void clickOnGetStaredinAssistedAdvsiory()
		{
			play.click(btn_AssistedAdvisory, "Clicking on Get Started in Assisted Advsiory");
		}
		public void validationOnBookANExpert()
		{
			play.verifyText(play.getText(txt_Experts), ConfigReader.getValue("txtexperts"));
		}
		public void clickonDelhiLocation()
		
		{
			play.click(op_Delhiloc, "using filter option location Delhi");
		}
		
		public void validationinBookingExpertAnilVerma()
		{
			play.verifyText(play.getText(txt_ExpertAnilVerma), ConfigReader.getValue("expertinassisted"));
		}	
		public void clickingonBookanAppointmentforverma()
		{
			play.click(txt_ExpertAnilVerma, "Clicking on Expert Anil verma");
			play.click(btn_BookanAppointmentinAssist, "Clicking on Book an Appointment");
		}
		
		public void clickOnMumbailocation()
		{
			play.click(op_MumLocation, "clicking on MumbaiLocation");
		}
		public void validationinBookingExpertShama()
		{
			play.verifyText(play.getText(txt_ExpertShama),  ConfigReader.getValue("ExpertShama"));
		}
		public void clickingonBookanAppointmentforShama()
		{
			play.click(txt_ExpertShama, "Clicking on Expert Anil verma");
			play.click(btn_BookanAppointmentinAssist, "Clicking on Book an Appointment");
		}
		
		public void clickOnfivestarRating()
		{
			play.click(op_fivestar, "clicking on fivestar Rating");
		}
		public void validationinBookingExpertMayuri()
		{
			play.verifyText(play.getText(txt_Expertmayuri),  ConfigReader.getValue("Expertmayuri"));
		}
		public void clickingonBookanAppointmentforMayuri()
		{
			play.click(txt_Expertmayuri, "Clicking on Expert Anil verma");
			play.click(btn_BookanAppointmentinAssist, "Clicking on Book an Appointment");
		}
		
		public void clickOnfourstarRating()
		{
			play.click(op_fourstar, "clicking on 4 star rating");
		}
		public void validationinBookingExpertYash()
		{
			play.verifyText(play.getText(txt_ExpertYash),  ConfigReader.getValue("ExpertYash"));
		}
		public void clickingonBookanAppointmentforYash()
		{
			play.click(txt_ExpertYash, "Clicking on Expert Anil verma");
			play.click(btn_BookanAppointmentinAssist, "Clicking on Book an Appointment");
		}
		
		public void clickOnthreestarRating()
		{
			play.click(op_ThreeStar, "clicking on Three star rating");
		}
		public void validationinBookingExpertinthreestar()
		{
			play.verifyText(play.getText(txt_threestar),  ConfigReader.getValue("threestar"));
		}
				
		
		public void clickOnaboveFourYearExp()
		{
			play.click(op_abovefouryr, "clicking onabove 4 year experience");
		}
		public void validationinBookingExpertKosar()
		{
			play.verifyText(play.getText(txt_ExpertKosar),  ConfigReader.getValue("ExpertKosar"));
		}
		public void clickingonBookanAppointmentforKosar()
		{
			play.click(txt_ExpertKosar, "Clicking on Expert");
			play.click(btn_BookanAppointmentinAssist, "Clicking on Book an Appointment");
		}
		
		public void clickOnyearbetTwoandFouryearExp()
		{
			play.click(op_bettwoandfour, "clicking on 2 to 4 years Experience");
		}
		public void validationinBookingExpertMaitri()
		{
			play.verifyText(play.getText(txt_ExpertMaitri),  ConfigReader.getValue("ExpertMaitri"));
		}
		public void clickingonBookanAppointmentforMaitri()
		{
			play.click(txt_ExpertMaitri, "Clicking on Expert");
			play.click(btn_BookanAppointmentinAssist, "Clicking on Book an Appointment");
		}
		
		public void clickOnBelowTwoyearExp()
		{
			play.click(op_belowTwo, "clicking on below2 year Experience");
		}
		public void validationinBookingExpertMeghna()
		{
			play.verifyText(play.getText(txt_ExpertMeghna),  ConfigReader.getValue("ExpertMeghna"));
		}
		
		public void clickingonBookanAppointmentforMeghna()
		{
			play.click(txt_ExpertMeghna, "Clicking on Expert ");
			play.click(btn_BookanAppointmentinAssist, "Clicking on Book an Appointment");
		}
		
		public void validateSelectDateinAssist(String string)
		{
			 String txt=play.framegettext(frame_CalenderIframeinAssist, txt_vefifySelectADay, string);

			play.frameVerifyTxt(frame_CalenderIframeinAssist, txt, string);
		}
		public void selectingTheDateinAssist()
		{
			
			//play.frameLocatorClick(frame_CalenderIframeinAssist, btn_MovetoNextMonthinAssist, "Moving on to next Month");
			play.frameLocatorClick(frame_CalenderIframeinAssist, btn_CalenderDateinAssist, "Clicking the available date");
		}
		public void validateTimeinAssist(String string) {
			 String txt=play.framegettext(frame_CalenderIframeinAssist, txt_SelectTime, string);

			play.frameVerifyTxt(frame_CalenderIframeinAssist, txt, string);
		}
		
		public void selectonTimeinAnilAssist() {
		
			//try	
				play.frameLocatorClick(frame_CalenderIframeinAssist, btn_TimeinAnilAssist, "Clicking on Time");
				play.frameLocatorClick(frame_CalenderIframeinAssist, btn_NextTimeinAnilAssist, "Clicking on Next");
//			}
//			catch(Throwable e){
//
//				play.frameLocatorClick(frame_CalenderIframeinAssist, btn1_TimeinAssist, "Clicking on Time");
//				play.frameLocatorClick(frame_CalenderIframeinAssist, btn1_NextTimeinAssist, "Clicking on Next");
//		}
		}
		
		public void selectonTimeinShamaAssist() {
			
			//try	
				play.frameLocatorClick(frame_CalenderIframeinAssist, btn_TimeinShamaAssist, "Clicking on Time");
				play.frameLocatorClick(frame_CalenderIframeinAssist, btn_NextTimeinShamaAssist, "Clicking on Next");
//			}
//			catch(Throwable e){
//
//				play.frameLocatorClick(frame_CalenderIframeinAssist, btn1_TimeinAssist, "Clicking on Time");
//				play.frameLocatorClick(frame_CalenderIframeinAssist, btn1_NextTimeinAssist, "Clicking on Next");
//		}
		}
		public void selectonTimeinMayuriAssist() {
			
			//try	
				play.frameLocatorClick(frame_CalenderIframeinAssist, btn_TimeinMayuriAssist, "Clicking on Time");
				play.frameLocatorClick(frame_CalenderIframeinAssist, btn_NextTimeinMayuriAssist, "Clicking on Next");
//			}
//			catch(Throwable e){
//
//				play.frameLocatorClick(frame_CalenderIframeinAssist, btn1_TimeinAssist, "Clicking on Time");
//				play.frameLocatorClick(frame_CalenderIframeinAssist, btn1_NextTimeinAssist, "Clicking on Next");
//		}
		}
		public void selectonTimeinYashAssist() {
			
			//try	
				play.frameLocatorClick(frame_CalenderIframeinAssist, btn_TimeinYashAssist, "Clicking on Time");
				play.frameLocatorClick(frame_CalenderIframeinAssist, btn_NextTimeinYashAssist, "Clicking on Next");
//			}
//			catch(Throwable e){
//
//				play.frameLocatorClick(frame_CalenderIframeinAssist, btn1_TimeinAssist, "Clicking on Time");
//				play.frameLocatorClick(frame_CalenderIframeinAssist, btn1_NextTimeinAssist, "Clicking on Next");
//		}
		}
		public void selectonTimeinKosarAssist() {
			
		//	try	
				play.frameLocatorClick(frame_CalenderIframeinAssist, btn_TimeinKosarAssist, "Clicking on Time");
				play.frameLocatorClick(frame_CalenderIframeinAssist, btn_NextTimeinKosarAssist, "Clicking on Next");
//			}
//			catch(Throwable e){
//
//				play.frameLocatorClick(frame_CalenderIframeinAssist, btn1_TimeinAssist, "Clicking on Time");
//				play.frameLocatorClick(frame_CalenderIframeinAssist, btn1_NextTimeinAssist, "Clicking on Next");
//		}
		}
		public void selectonTimeinMaitriAssist() {
			
		//	try	
				play.frameLocatorClick(frame_CalenderIframeinAssist, btn_TimeinMaitriAssist, "Clicking on Time");
				play.frameLocatorClick(frame_CalenderIframeinAssist, btn_NextTimeinMaitriAssist, "Clicking on Next");
//			}
//			catch(Throwable e){
//
//				play.frameLocatorClick(frame_CalenderIframeinAssist, btn1_TimeinAssist, "Clicking on Time");
//				play.frameLocatorClick(frame_CalenderIframeinAssist, btn1_NextTimeinAssist, "Clicking on Next");
//		}
		}
		public void selectonTimeinMeghnaAssist() {
			
		//	try	
				play.frameLocatorClick(frame_CalenderIframeinAssist, btn_TimeinMeghnaAssist, "Clicking on Time");
				play.frameLocatorClick(frame_CalenderIframeinAssist, btn_NextTimeinMeghnaAssist, "Clicking on Next");
//			}
//			catch(Throwable e){
//
//				play.frameLocatorClick(frame_CalenderIframeinAssist, btn1_TimeinAssist, "Clicking on Time");
//				play.frameLocatorClick(frame_CalenderIframeinAssist, btn1_NextTimeinAssist, "Clicking on Next");
//		}
		}
		
		
		public void validateOnConsultTimeinAssist(String string)
			{
			 String txt=play.framegettext(frame_CalenderIframeinAssist, txt_TimeconfirminAssist, string);

				play.frameVerifyTxt(frame_CalenderIframeinAssist, txt, string);
			}
			
			
		
		public void  bookanAppointmentinAssistedAdvisory()
		{
			play.framelocatorFillByLocator(frame_CalenderIframeinAssist, txt_NameinAssist, ConfigReader.getValue("nameinAssistedadvisory"), "Entering  NAme");
			play.framelocatorFillByLocator(frame_CalenderIframeinAssist, txt_EmailinAssist, ConfigReader.getValue("emailinAssistedadvisory"), "Entering Email");
			play.frameLocatorClick(frame_CalenderIframeinAssist, btn_AddGuestinAssist, "Clicking on Add Guest");
			play.framelocatorFillByLocator(frame_CalenderIframeinAssist, txt_GuestEmailinAssist, ConfigReader.getValue("guestemailinassistedadvisory"), "Entering GuestEmail");
			play.framelocatorFillByLocator(frame_CalenderIframeinAssist, txt_TextareainAssist, ConfigReader.getValue("textareainAssisted"), "Entering text");
			play.frameLocatorClick(frame_CalenderIframeinAssist, op_IncomeSlabinAssist, "Clicking on income salb");
			play.framelocatorFillByLocator(frame_CalenderIframeinAssist, txt_TelinAssist, ConfigReader.getValue("telinAssitedAdvisory"), "Entering Contact number");
			play.frameLocatorClick(frame_CalenderIframeinAssist, btn_SubmitinAssist, "Clicking on schedule");
			
			
		}
		
		public void validationOnSchedule(String string)
		{
			play.frameVerifyTxt(txt_RespinAssist, string, ConfigReader.getValue("ScheduleConfrimtxt"));
			
			//play.verifyText(play.getText(txt_RespinAssist),ConfigReader.getValue("ScheduleConfrimtxt"));
		}
		public void clickOnRetirementPlan()
		{
			play.mouseHover(op_Advisory, "Mouse hovering on Advisory");
			play.click(op_RetirementPlanning, "Clicking on Retirement plan");
		}
		
		public void validateTxtRetire(String string)
		{
			play.verifyText(play.getText(Txt_RetirementPlan), string);
		}
		 public void clickOnGetStarted()
		 {
			play.click(btn_GetStarted, "Clicking on Get Started");
		 }
		 public void selectOnAvailDate()
		 {
			//play.frameLocatorClick(Main_iFrame, btn_MovetoNextMonthinAssist, "Moving on to next Month");
			try{
				play.frameLocatorClick(Main_iFrame, btn_popup, "Clicking the popup");
			}
			catch(Exception e)
			{}

			play.frameLocatorClick(Main_iFrame, btn_CalenderDateinAssist, "Clicking the available date");
		 }
		 public void validateTimetext(String string)
		 {
			
			 String txt=play.framegettext(Main_iFrame, txt_consultTime, string);
			 play.frameVerifyTxt(Main_iFrame, txt, string);
		 }
		 public void selectOnTime()
		 {
			// try {
				play.frameLocatorClick(Main_iFrame, btn_time, "Clicking on Time");
				play.frameLocatorClick(Main_iFrame, btn_timenext, "Clicking on Next");
//			}
//			catch(Throwable e)
//			{
//				play.frameLocatorClick(Main_iFrame, btn1_TimeinAssist, "Clicking on Time");
//				play.frameLocatorClick(Main_iFrame, btn1_NextTimeinAssist, "Clicking on Next");
//			}
		 }
		 public void validateConsultRetirePlanTime(String string)
		 {
			 
			 String txt=play.framegettext(Main_iFrame, txt_consultTime, string);
			
			
			 play.frameVerifyTxt(Main_iFrame, txt ,string);
			 
		 }
		 public void bookAnAppointment()
		 {
			play.framelocatorFillByLocator(Main_iFrame, txt_NameinAssist, ConfigReader.getValue("nameinAssistedadvisory"), "Entering  NAme");
			play.framelocatorFillByLocator(Main_iFrame, txt_EmailinAssist, ConfigReader.getValue("emailinAssistedadvisory"), "Entering Email");
			play.frameLocatorClick(Main_iFrame, btn_AddGuestinAssist, "Clicking on Add Guest");
			play.framelocatorFillByLocator(Main_iFrame, txt_GuestEmailinAssist, ConfigReader.getValue("guestemailinassistedadvisory"), "Entering GuestEmail");
			play.framelocatorFillByLocator(Main_iFrame, txt_TextareainAssist, ConfigReader.getValue("textareainAssisted"), "Entering text");
			
			play.framelocatorFillByLocator(Main_iFrame, txt_TelinAssist, ConfigReader.getValue("telinAssitedAdvisory"), "Entering Contact number");
			play.frameLocatorClick(Main_iFrame, op1_IncomeSlab, "Clicking on income salb");
			play.frameLocatorClick(Main_iFrame, btn_SubmitinAssist, "Clicking on schedule");
			 		
		 }
			
		public void StepsinRetirementplan(String string)
			{
				play.list(txt_title, "info");
				play.verifyText(play.getText(Txt_StepsinRetirementplan), string);
				String txt= play.getText(txt_Planning);
				play.verifyText(play.getText(txt_Planning), txt);
				String txt1= play.getText(txt_designing);
				play.verifyText(play.getText(txt_designing), txt1);
				String txt2= play.getText(txt_Execution);
				play.verifyText(play.getText(txt_Execution), txt2);
				String txt3= play.getText(txt_Review);
				play.verifyText(play.getText(txt_Review), txt3);
			}
			

		public void lookLikeCustomeFinancialReport(String string)
		{
			play.verifyText(play.getText(txt_custome), string);
			String txt= play.getText(txt_req);
			play.verifyText(play.getText(txt_req), txt);
			String txt1= play.getText(txt_ReqCorpus);
			play.verifyText(play.getText(txt_ReqCorpus), txt1);
			String txt2= play.getText(txt_post);
			play.verifyText(play.getText(txt_post), txt2);
		}
		
		
		public void customeFinancialPlan(String string)
		{
			play.verifyText(play.getText(txt_video), string);
		}
		
		public void validationSecurity(String string)
		{
			play.verifyText(play.getText(txt_Security), string);
			String txt= play.getText(txt_DataSecurity);
			play.verifyText(play.getText(txt_DataSecurity), txt);
			String txt1= play.getText(txt_CloudInfra);
			play.verifyText(play.getText(txt_CloudInfra), txt1);
			String txt2= play.getText(txt_AuthAccess);
			play.verifyText(play.getText(txt_AuthAccess), txt2);
			String txt3= play.getText(txt_SecurityAudit);
			play.verifyText(play.getText(txt_SecurityAudit), txt3);
			
		}
		
		public void validateIntroCall()
		{
			String txt=play.getText(Plan_Appoinment);
			play.verifyText(play.getText(Plan_Appoinment), txt);
		}
		
		public void validateonFAQs(String string)
		{
			play.verifyText(play.getText(txt_FAQs), string);
			play.list(txt_quest, "questions");
		}
		
		public void clickOnTAxPlanning()
		{
			play.mouseHover(op_Advisory, "Mouse hovering on Advisory");
			play.click(op_TaxPlanningop, "Clicking on Financial Planning");
		}
		
		public void validationonTaxPlan(String string)
		{
			play.verifyText(play.getText(txt_TaxPlanner), string);
		}
		
		public void validateTextinTaxPlanner(String string)
		{
			play.verifyText(play.getText(txt_EffectiveTaxPlam), string);
			String txt= play.getText(txt_personalisedPlanner);
			play.verifyText(play.getText(txt_personalisedPlanner), txt);
			String txt1= play.getText(txt_plans);
			play.verifyText(play.getText(txt_plans), txt1);
			
		}
		
		public void validateConsultTimeInTaxPlanner(String string)
		{
			String txt=play.framegettext(Main_iFrame, txt_consultTime, string);
		
			 play.frameVerifyTxt(Main_iFrame, txt ,string );
		}
		
		public void valiadteExpertAnilVerma(String string)
		{
		 play.verifyText(play.getText(op_ExpertanilVermaa), string);
		}

		public void clickonExpertAnilverma()
		{
			play.click(op_ExpertanilVermaa, "choosing Anil Verma");
			play.click(btn_bookAppointmentforAnil, "book an Appointment");
		}
		public void validateFinancialSampleRepintro()
		{
			String txt=play.getText(txt_FinancialSampleRepintro);
			play.verifyText(play.getText(txt_FinancialSampleRepintro), txt);
		}
		
		public void Samplefiledownload()
		{
			play.fileDownload(btn_SampleReport, "Download the sample report");
		}
		public void validateAutoAdvisory(String string)
		{
			play.verifyText(play.getText(txt_AutoAdvisory), string);
		}
		public void clickonStartAutoAdvisory()
		{
			play.click(btn_AutoStart, "Clicking on start Automation Advisory");
		}
		public void validateOnStartAutoAdvisory(String string)
		{
			play.verifyText(play.getText(txt_StartAutoAdvisory), string);
		}
		public void validateExpertAdvisory(String string)
		{
			play.verifyText(play.getText(txt_ExpertAdvisory), string);
		}
		public void clickonStartExpertAdvisory()
		{
			play.click(btn_ExpStart, "Clicking on start Automation Advisory");
		}
		public void validateOnStartExpertAdvisory(String string)
		{
			play.verifyText(play.getText(txt_StartExpAdvisory), string);
		}
		
		public void validateStepforFinanPlan(String string)
		{
			play.verifyText(play.getText(txt_StepsinFinancialPlan), string);
		}
		
		public void validateonlistofStepsinFinanPlan()
		{
			play.list(txt_listofStepsinFinanPlan, "Steps in Financial Planning");
		}
		
		public void validateCustFinanPlan()
		{
			String txt=play.getText(txt_custome);
			play.verifyText(play.getText(txt_custome), txt);
		}
		public void validateonlistinCustFinanPlan()
		{
			play.list(txt_listinCustFinanPlan, "Steps in customised Financial Planning");
		}
		
		public void validateOnYoutubeTitleForFinanPlan()
		{
			String txt=play.getText(txt_youtubetitleinFinanPlan);
			play.verifyText(play.getText(txt_youtubetitleinFinanPlan), txt);
		}
		
		
	}



