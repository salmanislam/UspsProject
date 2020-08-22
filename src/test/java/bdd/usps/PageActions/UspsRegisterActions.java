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
import org.openqa.selenium.support.ui.Select;

import bdd.usps.PageElements.UspsLocators;
import bdd.usps.utilities.SetupDrivers;

public class UspsRegisterActions {
	
	UspsLocators uspsLoginLocatorsObj;
	static Logger log = LogManager.getLogger(UspsRegisterActions.class);
	
	public UspsRegisterActions() {
		uspsLoginLocatorsObj = new UspsLocators();
		PageFactory.initElements(SetupDrivers.driver, uspsLoginLocatorsObj);
	}

	public void goToUspsHomepage() {
		log.info("Visiting USPS Webpage");
		SetupDrivers.driver.manage().window().maximize();
		SetupDrivers.driver.get("https://www.usps.com/");
		SetupDrivers.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}

	public void clickRegister() {
		
		uspsLoginLocatorsObj.clkRegister.click();
	}

	public void clickSignUp() {
		log.info("Clicked On Register");
		uspsLoginLocatorsObj.clkSignup.click();
	}

	public void fillRegInfo() throws InterruptedException, IOException {
		log.info("Filiing User Information");
		
		Select lang = new Select(uspsLoginLocatorsObj.txtLanguage);
		lang.selectByVisibleText("English");

		Thread.sleep(1000);
		uspsLoginLocatorsObj.txtUsername.sendKeys("UrbanEagles2024");

		Thread.sleep(2000);
		uspsLoginLocatorsObj.txtPassword.sendKeys("Eagles@123");
		uspsLoginLocatorsObj.txtRePassword.sendKeys("Eagles@123");

		Select secq = new Select(uspsLoginLocatorsObj.txtSecQues);
		secq.selectByVisibleText("In what city were you born?");

		Select secq2 = new Select(uspsLoginLocatorsObj.txtSecQues2);
		secq2.selectByVisibleText("What is your favorite food to eat?");

		Thread.sleep(1000);
		uspsLoginLocatorsObj.txtSecAns.sendKeys("Dhaka");
		uspsLoginLocatorsObj.txtSecAns2.sendKeys("Pizza");

		uspsLoginLocatorsObj.txtSecAnsRe.sendKeys("Dhaka");
		uspsLoginLocatorsObj.txtSecAnsRe2.sendKeys("Pizza");

		uspsLoginLocatorsObj.radAccType.click();
		Thread.sleep(1000);

		Select title = new Select(uspsLoginLocatorsObj.txtTitle);
		title.selectByVisibleText("Mr");

		uspsLoginLocatorsObj.txtEmail.sendKeys("urbaneagles@gmail.com");
		uspsLoginLocatorsObj.txtFname.sendKeys("Urban");
		uspsLoginLocatorsObj.txtReEmail.sendKeys("urbaneagles@gmail.com");
		uspsLoginLocatorsObj.txtMi.sendKeys("-");

		Select phonetype = new Select(uspsLoginLocatorsObj.txtPhoneType);
		phonetype.selectByVisibleText("US");

		uspsLoginLocatorsObj.txtPhone.sendKeys("919-272-7615");
		uspsLoginLocatorsObj.txtLname.sendKeys("Eagles");
		uspsLoginLocatorsObj.txtMobile.sendKeys("919-272-7615");

		Select suffix = new Select(uspsLoginLocatorsObj.txtSuffix);
		suffix.selectByVisibleText("Sr");

		uspsLoginLocatorsObj.txtContUsps.click();

		Select country = new Select(uspsLoginLocatorsObj.txtContry);
		country.selectByVisibleText("UNITED STATES");

		uspsLoginLocatorsObj.txtAddress.sendKeys("145 Chester Avenue");
		uspsLoginLocatorsObj.txtApt.sendKeys("2C");
		uspsLoginLocatorsObj.txtCity.sendKeys("Brooklyn");
		Select state = new Select(uspsLoginLocatorsObj.txtState);
		state.selectByVisibleText("NY - New York");
		uspsLoginLocatorsObj.txtZip1.sendKeys("11218");
		

		File screenshot = ((TakesScreenshot)SetupDrivers.driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot, new File("C:\\Users\\getsa\\Downloads\\Eclipse For EE\\eclipse-workspace\\UspsProject\\src\\test\\resources\\screenshots\\register.jpg"));
		
		uspsLoginLocatorsObj.txtVerAddr.click();
		
		log.info("Form Successfully Filled");
		log.info("Screenshot Captured");
		Thread.sleep(1000);
		
	}

	public void goToUspsHomepage2() {
		SetupDrivers.driver.manage().window().maximize();
		SetupDrivers.driver.get("https://www.usps.com/");
		SetupDrivers.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		SetupDrivers.driver.close();
	}

}
