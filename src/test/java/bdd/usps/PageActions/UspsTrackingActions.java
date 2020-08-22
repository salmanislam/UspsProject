package bdd.usps.PageActions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import bdd.usps.PageElements.UspsLocators;
import bdd.usps.utilities.SetupDrivers;
import junit.framework.Assert;

public class UspsTrackingActions {
	UspsLocators uspsLoginLocatorsObj;
	static Logger log = LogManager.getLogger(UspsTrackingActions.class);
	

	public UspsTrackingActions() {
		uspsLoginLocatorsObj = new UspsLocators();
		PageFactory.initElements(SetupDrivers.driver, uspsLoginLocatorsObj);
	}

	public void openTrackAndManage() throws InterruptedException {
		log.info("Open track and manage");
		Actions actions = new Actions(SetupDrivers.driver);
		actions.moveToElement(uspsLoginLocatorsObj.hoverTrc).perform();
		Thread.sleep(2000);
		uspsLoginLocatorsObj.clkTrc.click();
	}

	public void fillWithValidNumber(String validTrackingNumber) throws InterruptedException {
		log.info("Inserting valid tracking number");
		uspsLoginLocatorsObj.txtTrkNo.sendKeys(validTrackingNumber);
		Thread.sleep(2000);
		uspsLoginLocatorsObj.submitTrkNo.click();

	}

	public void verifyValidInfo() throws InterruptedException, IOException {
		log.info("Validating valid tracking info");
		String confMsg = uspsLoginLocatorsObj.txtDelivered.getText();
		Assert.assertEquals(confMsg, "Delivered");
		JavascriptExecutor jsexec = (JavascriptExecutor) SetupDrivers.driver;
		jsexec.executeScript("window.scrollBy(0,400)");
		File screenshot = ((TakesScreenshot)SetupDrivers.driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot, new File("C:\\Users\\getsa\\Downloads\\Eclipse For EE\\eclipse-workspace\\UspsProject\\src\\test\\resources\\screenshots\\tracking.jpg"));
		Thread.sleep(2000);
		SetupDrivers.driver.navigate().back();
	}

	public void fillWithInValidNumber(String inValidTrackingNumber) throws InterruptedException {
		log.info("Inserting invalid tracking number");
		Thread.sleep(3000);
		uspsLoginLocatorsObj.txtTrkNo.clear();
		uspsLoginLocatorsObj.txtTrkNo.sendKeys(inValidTrackingNumber);
		Thread.sleep(2000);
		uspsLoginLocatorsObj.submitTrkNo.click();
	}

	public void verifyInValidInfo() throws InterruptedException {
		log.info("Validating invalid tracking info");
		JavascriptExecutor jsexec = (JavascriptExecutor) SetupDrivers.driver;
		jsexec.executeScript("window.scrollBy(0,400)");
		String confMsg = uspsLoginLocatorsObj.txtStatusNotAvailable.getText();
		Assert.assertEquals(confMsg, "Status Not Available");
		Thread.sleep(2000);
		SetupDrivers.driver.close();
	}

}
