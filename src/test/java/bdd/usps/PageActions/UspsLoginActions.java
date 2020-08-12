package bdd.usps.PageActions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import bdd.usps.PageElements.UspsLocators;
import bdd.usps.utilities.SetupDrivers;

public class UspsLoginActions {
	UspsLocators uspsLoginLocatorsObj;

	public UspsLoginActions() {
		uspsLoginLocatorsObj = new UspsLocators();
		PageFactory.initElements(SetupDrivers.driver, uspsLoginLocatorsObj);
	}

	public void loadUspsHomepage() {
		SetupDrivers.driver.manage().window().maximize();
		SetupDrivers.driver.get("https://www.usps.com/");
		SetupDrivers.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	public void loadLoginPage() {

		uspsLoginLocatorsObj.lnkLogin.click();

	}

	public void fillLoginForm(String UserName, String Password) throws InterruptedException {
		SetupDrivers.driver.navigate().refresh();
		uspsLoginLocatorsObj.userNameLoc.clear();
		uspsLoginLocatorsObj.userNameLoc.sendKeys("urbaneagles123");
		uspsLoginLocatorsObj.passLoc.clear();
		uspsLoginLocatorsObj.passLoc.sendKeys("Eagles@123");
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
