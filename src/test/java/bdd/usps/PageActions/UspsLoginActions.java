package bdd.usps.PageActions;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;

import bdd.usps.PageElements.UspsLocators;
import bdd.usps.utilities.SetupDrivers;

public class UspsLoginActions {
	UspsLocators uspsLoginLocatorsObj;
	static Logger log = LogManager.getLogger(UspsLoginActions.class);
	
	public UspsLoginActions() {
		uspsLoginLocatorsObj = new UspsLocators();
		PageFactory.initElements(SetupDrivers.driver, uspsLoginLocatorsObj);
	}

	public void loadUspsHomepage() {
		log.info("Visiting USPS Webpage");
		SetupDrivers.driver.manage().window().maximize();
		SetupDrivers.driver.get("https://www.usps.com/");
		SetupDrivers.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	public void loadLoginPage() {

		uspsLoginLocatorsObj.lnkLogin.click();

	}

	public void fillLoginForm(String UserName, String Password) throws InterruptedException, IOException {
		log.info("Login info inserted");
		SetupDrivers.driver.navigate().refresh();
		uspsLoginLocatorsObj.userNameLoc.clear();
		uspsLoginLocatorsObj.userNameLoc.sendKeys("urbaneagles123");
		uspsLoginLocatorsObj.passLoc.clear();
		uspsLoginLocatorsObj.passLoc.sendKeys("Eagles@123");
		File screenshot = ((TakesScreenshot)SetupDrivers.driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot, new File("C:\\Users\\getsa\\Downloads\\Eclipse For EE\\eclipse-workspace\\UspsProject\\src\\test\\resources\\screenshots\\login.jpg"));
		Thread.sleep(3000);
//		uspsLoginLocatorsObj.passLoc.sendKeys(Keys.ENTER);
	}

	public void clickSubmit() {
//		uspsLoginLocatorsObj.submitLoc.click();
		SetupDrivers.driver.get("https://www.usps.com/");
		SetupDrivers.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		SetupDrivers.driver.close();
	}

}
