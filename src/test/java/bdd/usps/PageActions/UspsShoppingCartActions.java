package bdd.usps.PageActions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import bdd.usps.PageElements.UspsLocators;
import bdd.usps.utilities.SetupDrivers;
import junit.framework.Assert;

public class UspsShoppingCartActions {
	UspsLocators uspsLocatorsObj;

	public UspsShoppingCartActions() {
		uspsLocatorsObj = new UspsLocators();
		PageFactory.initElements(SetupDrivers.driver, uspsLocatorsObj);
	}

	public void loadHomePage() {
		SetupDrivers.driver.manage().window().maximize();
		SetupDrivers.driver.get("https://www.usps.com/");
		SetupDrivers.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	public void postalStoreAndClickStamps() throws InterruptedException {
		Actions actions = new Actions(SetupDrivers.driver);
		actions.moveToElement(uspsLocatorsObj.postalhoverover).perform();
		uspsLocatorsObj.clickStamps.click();

	}

	public void clickUSFlag() throws InterruptedException {
		Thread.sleep(2000);
		JavascriptExecutor jsexec = (JavascriptExecutor) SetupDrivers.driver;
		jsexec.executeScript("window.scrollBy(0,700)");
		Thread.sleep(1000);
		uspsLocatorsObj.clickUsFlag.click();

	}

	public void clickAddToCart() throws InterruptedException {
		Thread.sleep(1000);
		uspsLocatorsObj.clickAddToCart.click();

	}

	public void clickKeepShopping() throws InterruptedException {
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
		Thread.sleep(2000);
		JavascriptExecutor jsexec = (JavascriptExecutor) SetupDrivers.driver;
		jsexec.executeScript("window.scrollBy(0,350);");
		Thread.sleep(2000);
		uspsLocatorsObj.clickAddTocarts.click();

	}

	public void ViewCart() throws InterruptedException {
		Thread.sleep(2000);
		uspsLocatorsObj.clickViewCart.click();

	}

	public void ClearShoppingCart() throws InterruptedException {
		Thread.sleep(3000);
		JavascriptExecutor jsexec = (JavascriptExecutor) SetupDrivers.driver;
		jsexec.executeScript("window.scrollBy(0,110);");
		Thread.sleep(1000);
		uspsLocatorsObj.clickClearShoppingCart.click();

	}

	public void VerifyShoppingCart() throws InterruptedException {
		Thread.sleep(2000);
		String confMsg = uspsLocatorsObj.VerifyShoppingCart.getText();
		Assert.assertEquals(confMsg, "You have no items in your shopping cart.");
		SetupDrivers.driver.close();
	}

}
