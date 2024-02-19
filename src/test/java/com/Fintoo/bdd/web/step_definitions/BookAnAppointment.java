package com.Fintoo.bdd.web.step_definitions;

import com.Fintoo.bdd.web.screens.BookAnAppointmentWP;

import io.cucumber.java.en.*;

public class BookAnAppointment {
	BookAnAppointmentWP bookAnAppointment=new BookAnAppointmentWP();
	
	@When("User clicks on book appointment button")
	public void user_clicks_on_book_appointment_button() {
		bookAnAppointment.clickOnBookAppointment();
	}

	@Then("User should able to see Book appointment with expert popup on screen")
	public void user_should_able_to_see_book_appointment_with_expert_popup_on_screen() {
		bookAnAppointment.textappointmentValidation();
	}

	@When("User selects Date and time and clicks on Next button")
	public void user_selects_date_and_time_and_clicks_on_next_button() {
		bookAnAppointment.dateAndTime();
	}

	@When("User enters his details clicks on schedule event button")
	public void user_enters_his_details_clicks_on_schedule_event_button() {
		bookAnAppointment.personalDetails();
	}

	@Then("User should able to see Confirmed message.")
	public void user_should_able_to_see_confirmed_message() {
		bookAnAppointment.confirmationmsg();
	}	

}
