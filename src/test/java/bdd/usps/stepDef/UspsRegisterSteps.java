package bdd.usps.stepDef;

import bdd.usps.PageActions.UspsRegisterActions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UspsRegisterSteps {
	
	UspsRegisterActions UspsRegisterActionsObj = new UspsRegisterActions();
	
	@Given("^Navigate to USPS\\.com home page\\.$")
	public void navigate_to_USPS_com_home_page() throws Throwable {
		UspsRegisterActionsObj.goToUspsHomepage();
	}

	@When("^Navigate to usps register page$")
	public void navigate_to_usps_register_page() throws Throwable {
		UspsRegisterActionsObj.clickRegister();
	}

	@When("^Navigate to signup now button$")
	public void navigate_to_signup_now_button() throws Throwable {
		UspsRegisterActionsObj.clickSignUp();
	}

	@When("^Fill up the information$")
	public void fill_up_the_information() throws Throwable {
		UspsRegisterActionsObj.fillRegInfo();
	}

	@Then("^Submit the information$")
	public void submit_the_information() throws Throwable {
		UspsRegisterActionsObj.goToUspsHomepage();
	}
}
