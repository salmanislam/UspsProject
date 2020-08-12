package bdd.usps.stepDef;

import bdd.usps.PageActions.UspsLoginActions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UspsLoginSteps {

	UspsLoginActions uspsLoginActionsObj = new UspsLoginActions();

	@Given("^Navigate to USPS home page$")
	public void navigate_to_USPS_com_home_page() throws Throwable {
		uspsLoginActionsObj.loadUspsHomepage();
	}

	@When("^Navigate to usps login page$")
	public void navigate_to_usps_login_page() throws Throwable {
		uspsLoginActionsObj.loadLoginPage();
	}

	@When("^Fill with valid \"([^\"]*)\" and \"([^\"]*)\"$")
	public void fill_with_valid_and(String UserName, String Password) throws Throwable {
		uspsLoginActionsObj.fillLoginForm(UserName,Password);
	}

	@When("^Click on sign in button$")
	public void click_on_sign_in_button() throws Throwable {
		uspsLoginActionsObj.clickSubmit();
	}

	@Then("^Hover over the username from home page and varify the login by username$")
	public void hover_over_the_username_from_home_page_and_varify_the_login_by_username() throws Throwable {

	}

}
