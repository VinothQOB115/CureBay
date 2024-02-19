package com.Fintoo.bdd.web.screens;

import org.testng.Assert;

import com.Fintoo.bdd.ccl.PlayActions;



public class BookAnAppointmentWP {
	
	String btnBookAnAppointment="//a[text()=\"Book Appointment\"]";
	String txtAppointmentValidation="(//p[text()=\"Book Appointment with Expert  \"])[1]";
	String btnDate="Thursday, July 27 - Times available";
	String btnTime="10:00am";
	String btnNextinAppointment="Next 10:00am";
	String btnName="Name *";
	String btnEmail="Email *";
	String btnScheduleEvent="Schedule Event";
	
	PlayActions play = new PlayActions();
	
	public void clickOnBookAppointment() {
		play.click(btnBookAnAppointment, "Book an appointment");
	}
	public void textappointmentValidation() {
		boolean actual=play.isDisplayed(txtAppointmentValidation, "book an appontment with expert");
		Assert.assertTrue(actual);
	}
	public void dateAndTime() {
	play.framelocatorByroleOption("iframe >> nth=4", btnDate, "date");
	play.framelocatorByroleOption("iframe >> nth=4",btnTime,"Time");
	play.framelocatorByroleOption("iframe >> nth=4",btnNextinAppointment , "Next button");
	
	
	}
	public void personalDetails() {
	play.framelocatorClickByLabel("iframe >> nth=4",btnName , "name field");
	play.framelocatorClickByLabel("iframe >> nth=4",btnEmail , "email field");
	play.frameLocatorFilter("iframe >> nth=4","label","0 to 10 Lakhs","incomeslab");
	play.framelocatorByroleOption("iframe >> nth=4", btnScheduleEvent, "Schedule event buttton");
	
	
	}
	public void confirmationmsg() {
		play.framelocatorByroleOptionGetText("iframe >> nth=4","Confirmed","confirmed msg");
	}

}
