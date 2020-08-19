package bdd.usps.PageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UspsLocators {

	// a[@id='login-register-header']

	@FindBy(xpath = "//a[@id='login-register-header']")
	public WebElement clkRegister;

	@FindBy(xpath = "//a[@id='sign-up-button']")
	public WebElement clkSignup;

	@FindBy(xpath = "//select[@id='slanguage']")
	public WebElement txtLanguage;

	@FindBy(xpath = "//input[@id='tuserName']")
	public WebElement txtUsername;

	@FindBy(xpath = "//input[@id='tPassword']")
	public WebElement txtPassword;

	@FindBy(xpath = "//input[@id='tPasswordRetype']")
	public WebElement txtRePassword;

	@FindBy(xpath = "//select[@id='ssec1']")
	public WebElement txtSecQues;

	@FindBy(xpath = "//select[@id='ssec2']")
	public WebElement txtSecQues2;

	@FindBy(xpath = "//input[@id='tsecAnswer1']")
	public WebElement txtSecAns;

	@FindBy(xpath = "//input[@id='tsecAnswer2']")
	public WebElement txtSecAns2;

	@FindBy(xpath = "//input[@id='tsecAnswer1Match']")
	public WebElement txtSecAnsRe;

	@FindBy(xpath = "//input[@id='tsecAnswer2Match']")
	public WebElement txtSecAnsRe2;

	@FindBy(xpath = "//label[@id='for-rAccount1']")
	public WebElement radAccType;

	@FindBy(xpath = "//select[@id='stitle']")
	public WebElement txtTitle;

	@FindBy(xpath = "//input[@id='temail']")
	public WebElement txtEmail;

	@FindBy(xpath = "//input[@id='tfName']")
	public WebElement txtFname;

	@FindBy(xpath = "//input[@id='temailRetype']")
	public WebElement txtReEmail;

	@FindBy(xpath = "//input[@id='tmI']")
	public WebElement txtMi;

	@FindBy(xpath = "//select[@id='sphoneType']")
	public WebElement txtPhoneType;

	@FindBy(xpath = "//input[@id='tphone']")
	public WebElement txtPhone;

	@FindBy(xpath = "//input[@id='tlName']")
	public WebElement txtLname;

	@FindBy(xpath = "//input[@id='tmobile']")
	public WebElement txtMobile;

	@FindBy(xpath = "//select[@id='ssuffix'] ")
	public WebElement txtSuffix;

	@FindBy(xpath = "//div[@id='contact-section']//div[3]//div[5]//label[1]")
	public WebElement txtContUsps;

	@FindBy(xpath = "//select[@id='scountry']")
	public WebElement txtContry;

	@FindBy(xpath = "//input[@id='taddress']")
	public WebElement txtAddress;

	@FindBy(xpath = "//input[@id='tapt']")
	public WebElement txtApt;

	@FindBy(xpath = "//input[@id='tcity']")
	public WebElement txtCity;

	@FindBy(xpath = "//select[@id='sstate']")
	public WebElement txtState;

	@FindBy(xpath = "//input[@id='tzip']")
	public WebElement txtZip1;

	@FindBy(xpath = "//a[@id='a-address-step1']")
	public WebElement txtVerAddr;
	
	@FindBy(xpath = "//a[@id='login-register-header']")
	public WebElement lnkLogin;

	@FindBy(xpath = "//input[@id='username']")
	public WebElement userNameLoc;

	@FindBy(xpath = "//input[@id='password']")
	public WebElement passLoc;

	@FindBy(xpath = "//button[@id='btn-submit']")
	public WebElement submitLoc;

	@FindBy(xpath = "//a[contains(text(),'Find Cities by ZIP')]")
	public WebElement findCity;

	@FindBy(xpath = "//a[@id='mail-ship-width']")
	public WebElement moveonmenu;

	@FindBy(xpath = "//a[contains(text(),'Look Up a ZIP Code')]")
	public WebElement Stamps;

	@FindBy(xpath = "//input[@id='tZip']")
	public WebElement txtZip;

	@FindBy(xpath = "//a[@id='cities-by-zip-code']")
	public WebElement submitZip;

	@FindBy(xpath = "//p[@class='row-detail-wrapper']")
	public WebElement txtCityName;

	@FindBy(xpath = "//li[@class='tool-calc']//a[contains(text(),'Calculate a Price')]")
	public WebElement txtCalculate;

	@FindBy(xpath = "//input[@id='option_1']")
	public WebElement txtPostcard;

	@FindBy(xpath = "//input[@id='quantity-0']")
	public WebElement smallQuant;

	@FindBy(xpath = "//input[@id='quantity-1']")
	public WebElement largeQuant;

	@FindBy(xpath = "//input[@class='btn btn-pcalc btn-default']")
	public WebElement clickCalc;

	@FindBy(xpath = "//div[@id='total']")
	public WebElement txtTotal;

	@FindBy(xpath = "//a[contains(text(),'Track & Manage')]")
	public WebElement hoverTrc;

	@FindBy(xpath = "//li[@class='tool-track']//a[contains(text(),'Tracking')]")
	public WebElement clkTrc;

	@FindBy(xpath = "//textarea[@id='tracking-input']")
	public WebElement txtTrkNo;

	@FindBy(xpath = "//button[@class='button tracking-btn']")
	// button[@class='button tracking-btn disabled']
	public WebElement submitTrkNo;

	@FindBy(xpath = "//strong[contains(text(),'Delivered')]")
	public WebElement txtDelivered;

	@FindBy(xpath = "//strong[contains(text(),'Status Not Available')]")
	public WebElement txtStatusNotAvailable;

	@FindBy(xpath = "//a[@class='menuitem'][contains(text(),'Postal Store')]")
	public WebElement postalhoverover;

	@FindBy(xpath = "//li[4]//div[1]//ul[1]//li[1]//a[1]")
	public WebElement clickStamps;

	@FindBy(xpath = "//div[@id='S_740104']")
	// div[@class='row cartridge-viewport']//div[1]//div[1]//a[1]
	public WebElement clickUsFlag;

	@FindBy(xpath = "//a[@id='m-addToCartVisBtn682304']")
	public WebElement clickAddToCart;

	@FindBy(xpath = "//a[@class='button--primary button--white btn-keep-shop']")

	public WebElement clickKeepShopping;

	@FindBy(xpath = "//li[contains(@class,'cards-envelopes-navigation')]//a//img")
	public WebElement clickCardEnvelpos;

	@FindBy(xpath = "//div[contains(text(),'Crafty Gingham Magnetic Note List')]")
	public WebElement clickCraftyGinghamMagnetic;

	@FindBy(xpath = "//a[@id='addToCartVisBtn842810']")
	public WebElement clickAddTocarts;

	@FindBy(xpath = "//a[@class='button--primary button--white']")
	public WebElement clickViewCart;

	@FindBy(xpath = "//input[@id='clearCart']")
	public WebElement clickClearShoppingCart;

	@FindBy(xpath = "//h2[contains(text(),'You have no items in your shopping cart.')]")
	public WebElement VerifyShoppingCart;

	@FindBy(xpath = "//li[@class='tool-pick']//a[contains(text(),'Schedule a Pickup')]")
	public WebElement clcScheduleAPickup;

	@FindBy(xpath = "//input[@id='firstName']")
	public WebElement txtPickupFirstName;

	@FindBy(xpath = "//input[@id='lastName']")
	public WebElement txtPickupLastName;

	@FindBy(xpath = "//input[@id='addressLineOne']")
	public WebElement txtPickupAddress;

	@FindBy(xpath = "//input[@id='addressLineTwo']")
	public WebElement txtPickupApt;

	@FindBy(xpath = "//input[@id='city']")
	public WebElement txtPickupCity;

	@FindBy(xpath = "//select[@id='state']")
	public WebElement txtPickupState;

	@FindBy(xpath = "//input[@id='zipCode']")
	public WebElement txtPickupZip;

	@FindBy(xpath = "//input[@id='phoneNumber']")
	public WebElement txtPickupPhone;

	@FindBy(xpath = "//input[@id='emailAddress']")
	public WebElement txtPickupEmail;

	@FindBy(xpath = "//a[@id='webToolsAddressCheck']")
	public WebElement btnPickupCheckAvailability;

	@FindBy(xpath = "//p[@class='schedule-a-pickup-validation success']")
	public WebElement txtPickupServiceAvailability;

}
