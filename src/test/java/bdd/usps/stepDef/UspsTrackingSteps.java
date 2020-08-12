package bdd.usps.stepDef;

import bdd.usps.PageActions.UspsTrackingActions;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UspsTrackingSteps {

	UspsTrackingActions UspsTrackingActionsObj = new UspsTrackingActions();

	@When("^Hover over to track and manage and click on tracking$")
	public void hover_over_to_track_and_manage_and_click_on_tracking() throws Throwable {
		UspsTrackingActionsObj.openTrackAndManage();
	}

	@When("^Insert valid \"([^\"]*)\" and click on track button$")
	public void insert_valid_and_click_on_track_button(String validTrackingNumber) throws Throwable {
		UspsTrackingActionsObj.fillWithValidNumber(validTrackingNumber);
	}

	@When("^Verify valid tracking information$")
	public void verify_valid_tracking_information() throws Throwable {
		UspsTrackingActionsObj.verifyValidInfo();
	}

	@When("^Insert invalid \"([^\"]*)\" and click on track button$")
	public void insert_invalid_and_click_on_track_button(String inValidTrackingNumber) throws Throwable {
		UspsTrackingActionsObj.fillWithInValidNumber(inValidTrackingNumber);
	}

	@Then("^Verify invalid tracking information$")
	public void verify_invalid_tracking_information() throws Throwable {
		UspsTrackingActionsObj.verifyInValidInfo();
	}
}
