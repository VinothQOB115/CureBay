package com.Fintoo.bdd.mobile.screens;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Fintoo.bdd.ccl.MobileActions;
import com.Fintoo.bdd.integrations.common_utils.DriverFactory;
import com.Fintoo.bdd.integrations.common_utils.MobileUtil;



public class Fintoo_WP {
  MobileActions actions = new MobileActions();
  
  public void clickOnboardingPermissionBtns() {
	  actions.Click(
				MobileUtil.returnByBasedOnPageNameAndObjectName("Fintoo_locators", "Fintoo_Allow_Btn"),
				"Allow Phone calls ");
	  actions.Click(
				MobileUtil.returnByBasedOnPageNameAndObjectName("Fintoo_locators", "Fintoo_Allow_Btn"),
				"Allow");
}
  public void clickNextImgBtn() {
	  actions.Click(
				MobileUtil.returnByBasedOnPageNameAndObjectName("Fintoo_locators", "Fintoo_Next_img"),
				"Next Img btn");
  }
  public void enterEMailIdAndClickProceedBtn() {
	  actions.sendKeys(MobileUtil.returnByBasedOnPageNameAndObjectName("Fintoo_locators", "Fintoo_Enter_Email"),
				"test2327@gmail.com");
	  actions.Click(
				MobileUtil.returnByBasedOnPageNameAndObjectName("Fintoo_locators", "Fintoo_Proceed_btn"),
				"Proceed button");
  }
  public void enterOTPAndClickProceedbtn() throws Throwable {
	  Thread.sleep(2000);
  actions.sendKeys(MobileUtil.returnByBasedOnPageNameAndObjectName("Fintoo_locators", "Fintoo_Otp1"),
			"");
  Thread.sleep(1000);
  actions.sendKeys(MobileUtil.returnByBasedOnPageNameAndObjectName("Fintoo_locators", "Fintoo_Otp2"),
			"");
  Thread.sleep(1000);
  actions.sendKeys(MobileUtil.returnByBasedOnPageNameAndObjectName("Fintoo_locators", "Fintoo_Otp3"),
			"");
  Thread.sleep(1000);
  actions.sendKeys(MobileUtil.returnByBasedOnPageNameAndObjectName("Fintoo_locators", "Fintoo_Otp4"),
			"");
  Thread.sleep(3000);

  actions.Click(
			MobileUtil.returnByBasedOnPageNameAndObjectName("Fintoo_locators", "Fintoo_Proceed_btn"),
			"Proceed button");
  }
  public void clickCancelBtn() {
	  actions.Click(
				MobileUtil.returnByBasedOnPageNameAndObjectName("Fintoo_locators", "Fintoo_BiometricAlert"),
				"Cancel button");
  }
  public void verifyAdvisoryPage() {
	  String text = actions.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("Fintoo_locators", "Fintoo_VerAdvisoryPage"));
		actions.verifyText(text, "Financial Planning");
  }
  public void clickFinancialPlanning() {
	  actions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("Fintoo_locators", "Fintoo_VerAdvisoryPage"),"Financial planning");
  }
  public void verRoboADvisory() {
	  String text = actions.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("Fintoo_locators", "Fintoo_VerRoboAdvPage"));
		actions.verifyText(text, "ROBO ADVISORY");
  }
  public void swipeUpAndScrollRight() throws Throwable {
	  actions.swipeUp(1);
	  Thread.sleep(3000);
	  actions.SwipeByCoordinates(1050, 1087, 56, 1091);
	  Thread.sleep(3000);
  }
  public void verAssisatnceAdvisory() throws Throwable {
	  
	  String text = actions.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("Fintoo_locators", "Fintoo_VerAssistanceAdvPage"));
		actions.verifyText(text, "ASSISTED ADVISORY");
  }
  public void clickGetStartedBtn() {
	  actions.swipeUp(1);
	  actions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("Fintoo_locators", "Fintoo_GetStarted"),"get started button");

  }
  public void clickFilterAndSelectDelhi() {
	  actions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("Fintoo_locators", "Fintoo_FilterIcon"),"Filter option");
	  actions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("Fintoo_locators", "Fintoo_Delhi"),"Delhi");

  }
  public void clickStartAndSelctFiveStarOption() {
	  actions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("Fintoo_locators", "Fintoo_StarRating"),"Star rating");
	  actions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("Fintoo_locators", "Fintoo_5StarRating"),"Five star");
  }
  public void clickApplyBtn() {
	  actions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("Fintoo_locators", "Fintoo_Apply"),"Apply button");
 
  }
  public void verFiveStarPerson() {
	  String text = actions.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("Fintoo_locators", "Fintoo_5StarPersonVer"));
		actions.verifyText(text, "Navneet Singh");
  }
  public void clickRatedPerson() throws Throwable {
	  actions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("Fintoo_locators", "Fintoo_5StarPersonVer"),"NAvneet Singh");
	  actions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("Fintoo_locators", "Fintoo_BookApp"),"book an appointmnet");
       Thread.sleep(3000);
  }
  public void verSelectADay(String string) {
	  String text = actions.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("Fintoo_locators", "Fintoo_VerSelectADay"));
		actions.verifyText(text, string);
  }
  public void selectAvailableDate() {
	  actions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("Fintoo_locators", "Fintoo_SelectDAte"),"August 24");
 
  }
  public void verSelectTime(String string) {
	  String text = actions.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("Fintoo_locators", "Fintoo_VerifySelectTime"));
		actions.verifyText(text, string);
  }
  public void selectTimeFromAvaliableTimings() {
	  actions.swipeUp(1);
	  try {
	  actions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("Fintoo_locators", "Fintoo_SelectTime"),"11:15am");
	  }catch(Exception e) {
		  actions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("Fintoo_locators", "Fintoo_SelectTimetwo"),"12:00am");
  
	  }try {
	  actions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("Fintoo_locators", "Fintoo_TimeNextBtn"),"Next time button");
	  }catch(Exception e) {
		  actions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("Fintoo_locators", "Fintoo_TimeTwoNextBtn"),"Next time button");
	  
	  }
  }
  public void ver15MinConsultation(String string) {
	  String text = actions.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("Fintoo_locators", "Fintoo_verconsultation"));
		actions.verifyText(text, string);
		actions.swipeUp(1);
  }
  public void clickincomeSlabOneCr() {
	  actions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("Fintoo_locators", "Fintoo_Incomeslab1Crore"),"one crore");
  }
  public void clickOnScheduleAppointment() {
	  actions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("Fintoo_locators", "Fintoo_ScheduleEvent"),"Schedule Appointment");
      actions.swipeUp(1);
  }
  public void verThankYoupage(String string) {
	  String text = actions.getText(MobileUtil.returnByBasedOnPageNameAndObjectName("Fintoo_locators", "Fintoo_verThankYou"));
		actions.verifyText(text, string);
  }
  public void clickClosepopUp() {
	  actions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("Fintoo_locators", "Fintoo_ClosePopup"),"Cross symbol");
	  actions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("Fintoo_locators", "Fintoo_Navigateup"),"navigate back");

  }
/*
 * Mumbai  
 */
  public void clickMumbaiCheckBox() {
	  actions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("Fintoo_locators", "Fintoo_FilterIcon"),"Filter option");
	  actions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("Fintoo_locators", "Fintoo_Mumbai"),"Mumbai");

  }
  public void getListOfTopFiveAdvisorys() {
	  List<WebElement> advisoryname = DriverFactory.getInstance().getMobileDriver().findElements(By.xpath("//android.widget.TextView[@resource-id='com.financialhospital.admin.finh:id/tvExpertName']"));

		for (int i = 0; i < advisoryname.size(); i++) {
			String text = advisoryname.get(i).getText();
			System.out.println(text);
		}
  }
  public void selectTopAdvisoryInMumbai() {
	  actions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("Fintoo_locators", "Fintoo_5StarPersonMumbai"),"Shama");
	  actions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("Fintoo_locators", "Fintoo_BookApp"),"book an appointmnet");

  }
  /*
   * four star mumbai
   */
  public void getListOfTopFourStarAdvisorys() {
	  List<WebElement> advisoryname = DriverFactory.getInstance().getMobileDriver().findElements(By.xpath(
			"//android.widget.TextView[@resource-id='com.financialhospital.admin.finh:id/tvExpertName']"));

		for (int i = 0; i < advisoryname.size(); i++) {
			String text = advisoryname.get(i).getText();
			System.out.println(text);
		}
  }
  public void clickStartAndSelctFourStarOption() {
	  actions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("Fintoo_locators", "Fintoo_StarRating"),"Star rating");
	  actions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("Fintoo_locators", "Fintoo_4StarRating"),"Five star");
  }
  public void selectTopFourStarAdvisoryInMumbai() {
	  actions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("Fintoo_locators", "Fintoo_4StarPersonMumbai"),"yash jain");
	  actions.Click(MobileUtil.returnByBasedOnPageNameAndObjectName("Fintoo_locators", "Fintoo_BookApp"),"book an appointmnet");

  }
}

