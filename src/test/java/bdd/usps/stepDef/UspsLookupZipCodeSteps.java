package bdd.usps.stepDef;

import bdd.usps.PageActions.UspsLookupZipCodeActions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UspsLookupZipCodeSteps {

	UspsLookupZipCodeActions uspsLookupZipCodeActionsObj = new UspsLookupZipCodeActions();

	@Given("^Go to USPS home page$")
	public void go_to_USPS_home_page() throws Throwable {
		uspsLookupZipCodeActionsObj.loadUspsHomepage();
	}

	@Given("^Hover over mail & ship and click on lookup a zipcode$")
	public void hover_over_mail_ship_and_click_on_lookup_a_zipcode() throws Throwable {
		uspsLookupZipCodeActionsObj.hoverOverAndClick();
	}

	@When("^Click on cities by zipcode$")
	public void click_on_cities_by_zipcode() throws Throwable {
		uspsLookupZipCodeActionsObj.clickFindCitiesByZip();
	}

	@When("^Insert a valid \"([^\"]*)\" and submit$")
	public void insert_a_valid_and_submit(String Zipcode) throws Throwable {
		uspsLookupZipCodeActionsObj.fillUpAndSubmitZipCode(Zipcode);
	}

	@Then("^Varify it return valid cityname against the zipcode$")
	public void varify_it_return_valid_cityname_against_the_zipcode() throws Throwable {
		uspsLookupZipCodeActionsObj.verifyCityName();
	}

}
