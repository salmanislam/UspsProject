package bdd.usps.PageActions;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import bdd.usps.PageElements.UspsLocators;
import bdd.usps.utilities.SetupDrivers;
import junit.framework.Assert;

public class UspsLookupZipCodeActions {
	UspsLocators uspsLoginLocatorsObj;
	static Logger log = LogManager.getLogger(UspsLookupZipCodeActions.class);
	
	public UspsLookupZipCodeActions() {
		uspsLoginLocatorsObj = new UspsLocators();
		PageFactory.initElements(SetupDrivers.driver, uspsLoginLocatorsObj);
	}

	public void loadUspsHomepage() {
		log.info("Visiting USPS Webpage");
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
		log.info("Find Citites clicked");
		Thread.sleep(2000);
		uspsLoginLocatorsObj.findCity.click();
		Thread.sleep(2000);
	}

	public void fillUpAndSubmitZipCode(String Zipcode) throws InterruptedException {
		log.info("Zipcode Inserted");
		uspsLoginLocatorsObj.txtZip.sendKeys(Zipcode);
		Thread.sleep(2000);
		uspsLoginLocatorsObj.submitZip.click();
	}

	public void verifyCityName() throws IOException {
		log.info("City name verified ");
		String confMsg = uspsLoginLocatorsObj.txtCityName.getText();
		Assert.assertEquals(confMsg, "BROOKLYN NY");
		File screenshot = ((TakesScreenshot)SetupDrivers.driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot, new File("C:\\Users\\getsa\\Downloads\\Eclipse For EE\\eclipse-workspace\\UspsProject\\src\\test\\resources\\screenshots\\Lookup.jpg"));
		SetupDrivers.driver.close();
		
	}

}
