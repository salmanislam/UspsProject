package bdd.usps.PageActions;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

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

public class UspsCalculatePriceActions {

	UspsLocators uspsLoginLocatorsObj;
	static Logger log = LogManager.getLogger(UspsCalculatePriceActions.class);
	
	public UspsCalculatePriceActions() {
		uspsLoginLocatorsObj = new UspsLocators();
		PageFactory.initElements(SetupDrivers.driver, uspsLoginLocatorsObj);
	}

	public void loadHomePage() {
		log.info("Visiting USPS Webpage");
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
		log.info("Postcard Clicked");
		JavascriptExecutor jsexec = (JavascriptExecutor) SetupDrivers.driver;
		jsexec.executeScript("window.scrollBy(0,400)");
		Thread.sleep(1000);
		uspsLoginLocatorsObj.txtPostcard.click();

	}

	public void calcPrice(String Small, String Large) {
		log.info("Quantities inserted");
		uspsLoginLocatorsObj.smallQuant.sendKeys(Small);
		uspsLoginLocatorsObj.largeQuant.sendKeys(Large);
		uspsLoginLocatorsObj.clickCalc.click();
	}

	public void verifyTotalPrice() throws InterruptedException, IOException {

		String confMsg = uspsLoginLocatorsObj.txtTotal.getText();
		Assert.assertEquals(confMsg, "$1.80");
		
		File screenshot = ((TakesScreenshot)SetupDrivers.driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot, new File("C:\\Users\\getsa\\Downloads\\Eclipse For EE\\eclipse-workspace\\UspsProject\\src\\test\\resources\\screenshots\\calculate.jpg"));
		
		log.info("Price calculation varified");
		
		Thread.sleep(1000);
		SetupDrivers.driver.close();
	}

}
