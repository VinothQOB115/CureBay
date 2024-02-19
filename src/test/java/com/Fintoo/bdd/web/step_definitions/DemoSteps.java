package com.Fintoo.bdd.web.step_definitions;

import com.Fintoo.bdd.web.screens.DemoWP;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DemoSteps {
	
	DemoWP page = new DemoWP();
	
	@When("^User enter Username on login page(.+)$")
    public void user_enter_username_on_login_page(String username) throws Throwable {
    	page.enter_Riskcovry_ValidUserName(username);
    }
	
	@And("^User enter Password on login page(.+)$")
    public void user_enter_password_on_login_page(String password) throws Throwable {
    	page.enter_Riskcovry_ValidPassword(password);
    }
	
	@Then("^User should able to see error message$")
    public void user_should_able_to_see_error_message() throws Throwable {
        page.verify_ErrorMessage();
    }
	
	
	@Given("^User is in Riskcovry LivLong url page$")
    public void user_is_in_rislovery_livlong_url_page() throws Throwable {
		
        page.Riskcovry_URL();
    }


    @And("^User click on Login button$")
    public void user_click_on_login_button() throws Throwable {
        page.click_On_Login_Btn();
    }
    @Then("^User should able not to see error message$")
    public void user_should_able_not_to_see_error_message() throws Throwable {
        page.user_should_able_not_to_see_error_message();
    }
    
}
