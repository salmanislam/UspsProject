package bdd.usps.stepDef;

import bdd.usps.PageActions.UspsShoppingCartActions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UspsShoppingCartSteps {
	UspsShoppingCartActions UspsShoppingCartActionsObj = new UspsShoppingCartActions();
	
	@Given("^Visit to USPS\\.com home page$")
	public void visit_to_USPS_com_home_page() throws Throwable {
		UspsShoppingCartActionsObj.loadHomePage();
	}

	@When("^Hover over postal Store and Click on Stamps\\.$")
	public void hover_over_postal_Store_and_Click_on_Stamps() throws Throwable {
		UspsShoppingCartActionsObj.postalStoreAndClickStamps();
	}

	@When("^Click on U\\.S\\. Flag$")
	public void click_on_U_S_Flag() throws Throwable {
		UspsShoppingCartActionsObj.clickUSFlag();
	}

	@When("^Click on Add to Cart\\.$")
	public void click_on_Add_to_Cart() throws Throwable {
		UspsShoppingCartActionsObj.clickAddToCart();
	}

	@When("^Click on keep shopping\\.$")
	public void click_on_keep_shopping() throws Throwable {
		UspsShoppingCartActionsObj.clickKeepShopping();
	}

	@When("^Click on Cards & Envelopes link\\.$")
	public void click_on_Cards_Envelopes_link() throws Throwable {
		UspsShoppingCartActionsObj.clickCardsEnvlop();
	}

	@When("^Click on Crafty Gingham Magnetic Note List\\.$")
	public void click_on_Crafty_Gingham_Magnetic_Note_List() throws Throwable {
		UspsShoppingCartActionsObj.CraftyGinghamMagnetic();
	}

	@When("^Click on Add to cart\\.$")
	public void click_on_Add_to_cart() throws Throwable {
		UspsShoppingCartActionsObj.AddToCarts();
	}

	@When("^Click on View cart\\.$")
	public void click_on_View_cart() throws Throwable {
		UspsShoppingCartActionsObj.ViewCart();
	}

	@When("^Click on Clear shopping cart$")
	public void click_on_Clear_shopping_cart() throws Throwable {
		UspsShoppingCartActionsObj.ClearShoppingCart();
	}

	@Then("^Varify the Shoppoing cart is clear\\.$")
	public void varify_the_Shoppoing_cart_is_clear() throws Throwable {
		UspsShoppingCartActionsObj.VerifyShoppingCart();
	}

}
