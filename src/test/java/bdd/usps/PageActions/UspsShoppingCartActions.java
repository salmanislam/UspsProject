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

public class UspsShoppingCartActions {
	UspsLocators uspsLocatorsObj;
	static Logger log = LogManager.getLogger(UspsShoppingCartActions.class);
	
	public UspsShoppingCartActions() {
		uspsLocatorsObj = new UspsLocators();
		PageFactory.initElements(SetupDrivers.driver, uspsLocatorsObj);
	}

	public void loadHomePage() {
		log.info("Visiting USPS Webpage");
		SetupDrivers.driver.manage().window().maximize();
		SetupDrivers.driver.get("https://www.usps.com/");
		SetupDrivers.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	public void postalStoreAndClickStamps() throws InterruptedException {
		log.info("Click on stamps");
		Actions actions = new Actions(SetupDrivers.driver);
		actions.moveToElement(uspsLocatorsObj.postalhoverover).perform();
		uspsLocatorsObj.clickStamps.click();

	}

	public void clickUSFlag() throws InterruptedException {
		log.info("Click on us flag");
		Thread.sleep(2000);
		JavascriptExecutor jsexec = (JavascriptExecutor) SetupDrivers.driver;
		jsexec.executeScript("window.scrollBy(0,700)");
		Thread.sleep(1000);
		uspsLocatorsObj.clickUsFlag.click();

	}

	public void clickAddToCart() throws InterruptedException {
		log.info("Item added to cart");
		Thread.sleep(1000);
		uspsLocatorsObj.clickAddToCart.click();

	}

	public void clickKeepShopping() throws InterruptedException {
		log.info("Continue shopping");
		Thread.sleep(1000);
		uspsLocatorsObj.clickKeepShopping.click();

	}

	public void clickCardsEnvlop() throws InterruptedException {
		Thread.sleep(2000);
		uspsLocatorsObj.clickCardEnvelpos.click();

	}

	public void CraftyGinghamMagnetic() throws InterruptedException {
		Thread.sleep(2000);
		JavascriptExecutor jsexec = (JavascriptExecutor) SetupDrivers.driver;
		jsexec.executeScript("window.scrollBy(0,350);");
		uspsLocatorsObj.clickCraftyGinghamMagnetic.click();

	}

	public void AddToCarts() throws InterruptedException {
		log.info("Item added to cart");
		Thread.sleep(2000);
		JavascriptExecutor jsexec = (JavascriptExecutor) SetupDrivers.driver;
		jsexec.executeScript("window.scrollBy(0,350);");
		Thread.sleep(2000);
		uspsLocatorsObj.clickAddTocarts.click();

	}

	public void ViewCart() throws InterruptedException {
		log.info("Shopping Cart viwed");
		Thread.sleep(2000);
		uspsLocatorsObj.clickViewCart.click();

	}

	public void ClearShoppingCart() throws InterruptedException, IOException {
		log.info("Item removed from shopping cart");
		Thread.sleep(3000);
		JavascriptExecutor jsexec = (JavascriptExecutor) SetupDrivers.driver;
		jsexec.executeScript("window.scrollBy(0,110);");
		Thread.sleep(1000);
		File screenshot = ((TakesScreenshot)SetupDrivers.driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot, new File("C:\\Users\\getsa\\Downloads\\Eclipse For EE\\eclipse-workspace\\UspsProject\\src\\test\\resources\\screenshots\\shopping.jpg"));
		uspsLocatorsObj.clickClearShoppingCart.click();

	}

	public void VerifyShoppingCart() throws InterruptedException {
		log.info("Shopping cart verified");
		Thread.sleep(2000);
		String confMsg = uspsLocatorsObj.VerifyShoppingCart.getText();
		Assert.assertEquals(confMsg, "You have no items in your shopping cart.");
		SetupDrivers.driver.close();
	}

}
