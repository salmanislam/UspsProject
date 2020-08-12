package bdd.usps.PageActions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import bdd.usps.PageElements.UspsLocators;
import bdd.usps.utilities.SetupDrivers;
import junit.framework.Assert;

public class UspsTrackingActions {
	UspsLocators uspsLoginLocatorsObj;

	public UspsTrackingActions() {
		uspsLoginLocatorsObj = new UspsLocators();
		PageFactory.initElements(SetupDrivers.driver, uspsLoginLocatorsObj);
	}

	public void openTrackAndManage() throws InterruptedException {
		Actions actions = new Actions(SetupDrivers.driver);
		actions.moveToElement(uspsLoginLocatorsObj.hoverTrc).perform();
		Thread.sleep(2000);
		uspsLoginLocatorsObj.clkTrc.click();
	}

	public void fillWithValidNumber(String validTrackingNumber) throws InterruptedException {
		uspsLoginLocatorsObj.txtTrkNo.sendKeys(validTrackingNumber);
		Thread.sleep(2000);
		uspsLoginLocatorsObj.submitTrkNo.click();

	}

	public void verifyValidInfo() throws InterruptedException {
		String confMsg = uspsLoginLocatorsObj.txtDelivered.getText();
		Assert.assertEquals(confMsg, "Delivered");
		JavascriptExecutor jsexec = (JavascriptExecutor) SetupDrivers.driver;
		jsexec.executeScript("window.scrollBy(0,400)");
		Thread.sleep(2000);
		SetupDrivers.driver.navigate().back();
	}

	public void fillWithInValidNumber(String inValidTrackingNumber) throws InterruptedException {
		Thread.sleep(3000);
		uspsLoginLocatorsObj.txtTrkNo.clear();
		uspsLoginLocatorsObj.txtTrkNo.sendKeys(inValidTrackingNumber);
		Thread.sleep(2000);
		uspsLoginLocatorsObj.submitTrkNo.click();
	}

	public void verifyInValidInfo() throws InterruptedException {
		JavascriptExecutor jsexec = (JavascriptExecutor) SetupDrivers.driver;
		jsexec.executeScript("window.scrollBy(0,400)");
		String confMsg = uspsLoginLocatorsObj.txtStatusNotAvailable.getText();
		Assert.assertEquals(confMsg, "Status Not Available");
		Thread.sleep(2000);
		SetupDrivers.driver.close();
	}

}
