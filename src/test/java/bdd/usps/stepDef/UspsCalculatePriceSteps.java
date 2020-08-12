package bdd.usps.stepDef;

import bdd.usps.PageActions.UspsCalculatePriceActions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UspsCalculatePriceSteps {
	UspsCalculatePriceActions UspsCalculatePriceActionsObj = new UspsCalculatePriceActions();
	
	@Given("^Navigate to USPS\\.com home page$")
	public void navigate_to_USPS_com_home_page() throws Throwable {
		UspsCalculatePriceActionsObj.loadHomePage();
	}

	@When("^Hover over mail & ship and click on Calculate a price$")
	public void hover_over_mail_ship_and_click_on_Calculate_a_price() throws Throwable {
		UspsCalculatePriceActionsObj.hoverOverMailAndShip();
	}

	@When("^Click on calculate postcard price$")
	public void click_on_calculate_postcard_price() throws Throwable {
		UspsCalculatePriceActionsObj.clickonPostcard();
	}

	@When("^Fill with \"([^\"]*)\" and \"([^\"]*)\" quantities and click on calculate$")
	public void fill_with_and_quantities_and_click_on_calculate(String Small, String Large) throws Throwable {
		UspsCalculatePriceActionsObj.calcPrice(Small,Large);
	}

	@Then("^Varify the total price is correct$")
	public void varify_the_total_price_is_correct() throws Throwable {
		UspsCalculatePriceActionsObj.verifyTotalPrice();
	}
	
	
	
}
