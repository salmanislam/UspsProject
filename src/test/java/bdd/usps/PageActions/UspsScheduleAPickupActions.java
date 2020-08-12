package bdd.usps.PageActions;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import bdd.usps.PageElements.UspsLocators;
import bdd.usps.utilities.ReadExcelSheetData;
import bdd.usps.utilities.SetupDrivers;
import junit.framework.Assert;

public class UspsScheduleAPickupActions {
	UspsLocators uspsLocatorsObj;

	public UspsScheduleAPickupActions() {
		uspsLocatorsObj = new UspsLocators();
		PageFactory.initElements(SetupDrivers.driver, uspsLocatorsObj);

	}

	public void visitHomePage() {
		SetupDrivers.driver.manage().window().maximize();
		SetupDrivers.driver.get("https://www.usps.com/");
		SetupDrivers.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	public void clickSchedulePickup() throws InterruptedException {
		Actions actions = new Actions(SetupDrivers.driver);
		actions.moveToElement(uspsLocatorsObj.moveonmenu).perform();
		Thread.sleep(2000);
		uspsLocatorsObj.clcScheduleAPickup.click();
	}

	public void insertPickupLocationDetails() throws IOException {
		uspsLocatorsObj.txtPickupFirstName.sendKeys(ReadExcelSheetData.getMapData("FirstName"));
		uspsLocatorsObj.txtPickupLastName.sendKeys(ReadExcelSheetData.getMapData("LastName"));
		uspsLocatorsObj.txtPickupAddress.sendKeys(ReadExcelSheetData.getMapData("StreetAddress"));
		uspsLocatorsObj.txtPickupApt.sendKeys(ReadExcelSheetData.getMapData("Apt"));
		uspsLocatorsObj.txtPickupCity.sendKeys(ReadExcelSheetData.getMapData("City"));
		uspsLocatorsObj.txtPickupState.sendKeys(ReadExcelSheetData.getMapData("State"));
		uspsLocatorsObj.txtPickupZip.sendKeys(ReadExcelSheetData.getMapData("Zip"));
		uspsLocatorsObj.txtPickupPhone.sendKeys(ReadExcelSheetData.getMapData("Phone"));
		uspsLocatorsObj.txtPickupEmail.sendKeys(ReadExcelSheetData.getMapData("Email"));
	}

	public void clickCheckAvailability() throws InterruptedException {
		Thread.sleep(2000);
		uspsLocatorsObj.btnPickupCheckAvailability.click();
	}

	public void verifyPickupServiceAvailability() throws InterruptedException {
		Thread.sleep(1000);
		String confMsg = uspsLocatorsObj.txtPickupServiceAvailability.getText();
		Assert.assertEquals(confMsg, "Service Available");
		JavascriptExecutor jsexec = (JavascriptExecutor) SetupDrivers.driver;
		jsexec.executeScript("window.scrollBy(0,120)");
		//SetupDrivers.driver.close();

	}
}
