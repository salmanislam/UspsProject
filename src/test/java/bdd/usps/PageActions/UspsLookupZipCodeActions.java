package bdd.usps.PageActions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import bdd.usps.PageElements.UspsLocators;
import bdd.usps.utilities.SetupDrivers;
import junit.framework.Assert;

public class UspsLookupZipCodeActions {
	UspsLocators uspsLoginLocatorsObj;

	public UspsLookupZipCodeActions() {
		uspsLoginLocatorsObj = new UspsLocators();
		PageFactory.initElements(SetupDrivers.driver, uspsLoginLocatorsObj);
	}

	public void loadUspsHomepage() {
		SetupDrivers.driver.manage().window().maximize();
		SetupDrivers.driver.get("https://www.usps.com/");
		SetupDrivers.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}

	public void hoverOverAndClick() throws InterruptedException {
		Actions actions = new Actions(SetupDrivers.driver);
		actions.moveToElement(uspsLoginLocatorsObj.moveonmenu).perform();
		Thread.sleep(2000);
		uspsLoginLocatorsObj.Stamps.click();

	}

	public void clickFindCitiesByZip() throws InterruptedException {
		Thread.sleep(2000);
		uspsLoginLocatorsObj.findCity.click();
		Thread.sleep(2000);
	}

	public void fillUpAndSubmitZipCode(String Zipcode) throws InterruptedException {
		uspsLoginLocatorsObj.txtZip.sendKeys(Zipcode);
		Thread.sleep(2000);
		uspsLoginLocatorsObj.submitZip.click();
	}

	public void verifyCityName() {
		String confMsg = uspsLoginLocatorsObj.txtCityName.getText();
		Assert.assertEquals(confMsg, "BROOKLYN NY");
		SetupDrivers.driver.close();
	}

}
