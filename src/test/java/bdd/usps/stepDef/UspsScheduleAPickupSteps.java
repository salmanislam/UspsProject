package bdd.usps.stepDef;

import bdd.usps.PageActions.UspsScheduleAPickupActions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UspsScheduleAPickupSteps {
	
	UspsScheduleAPickupActions UspsScheduleAPickupActionsObj = new UspsScheduleAPickupActions();
	
	@Given("^Visit Usps Homepage$")
	public void visit_Usps_Homepage() throws Throwable {
		UspsScheduleAPickupActionsObj.visitHomePage();
	}

	@When("^Hover over mail and ship and click on Schedule a pickup$")
	public void hover_over_mail_and_ship_and_click_on_Schedule_a_pickup() throws Throwable {
		UspsScheduleAPickupActionsObj.clickSchedulePickup();
	}

	@When("^Insert Pickup location details\\.$")
	public void insert_Pickup_location_details() throws Throwable {
		UspsScheduleAPickupActionsObj.insertPickupLocationDetails();
	}

	@When("^Click on check availability$")
	public void click_on_check_availability() throws Throwable {
		UspsScheduleAPickupActionsObj.clickCheckAvailability();
	}

	@Then("^Verify if service is available$")
	public void verify_if_service_is_available() throws Throwable {
		UspsScheduleAPickupActionsObj.verifyPickupServiceAvailability();
	}

}
