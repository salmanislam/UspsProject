package bdd.usps.PageActions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import bdd.usps.PageElements.UspsLocators;
import bdd.usps.utilities.SetupDrivers;
import junit.framework.Assert;

public class UspsCalculatePriceActions {

	UspsLocators uspsLoginLocatorsObj;

	public UspsCalculatePriceActions() {
		uspsLoginLocatorsObj = new UspsLocators();
		PageFactory.initElements(SetupDrivers.driver, uspsLoginLocatorsObj);
	}

	public void loadHomePage() {
		SetupDrivers.driver.manage().window().maximize();
		SetupDrivers.driver.get("https://www.usps.com/");
		SetupDrivers.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	public void hoverOverMailAndShip() throws InterruptedException {
		Actions actions = new Actions(SetupDrivers.driver);
		actions.moveToElement(uspsLoginLocatorsObj.moveonmenu).perform();
		Thread.sleep(2000);
		uspsLoginLocatorsObj.txtCalculate.click();

	}

	public void clickonPostcard() throws InterruptedException {
		JavascriptExecutor jsexec = (JavascriptExecutor) SetupDrivers.driver;
		jsexec.executeScript("window.scrollBy(0,400)");
		Thread.sleep(1000);
		uspsLoginLocatorsObj.txtPostcard.click();

	}

	public void calcPrice(String Small, String Large) {
		uspsLoginLocatorsObj.smallQuant.sendKeys(Small);
		uspsLoginLocatorsObj.largeQuant.sendKeys(Large);
		uspsLoginLocatorsObj.clickCalc.click();
	}

	public void verifyTotalPrice() throws InterruptedException {

		String confMsg = uspsLoginLocatorsObj.txtTotal.getText();
		Assert.assertEquals(confMsg, "$1.80");
		Thread.sleep(1000);
		SetupDrivers.driver.close();
	}

}
