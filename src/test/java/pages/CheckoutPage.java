package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import domainObjects.BillingDetails;

public class CheckoutPage extends BasePage {
	
	
	@FindBy(id="billing_first_name")private WebElement billingFirstNameFld;
	@FindBy(id="billing_last_name")private WebElement billingLastNameFld;
	@FindBy(id="billing_address_1")private WebElement address1Fld;
	@FindBy(id="billing_city")private WebElement billingCityFld;
	@FindBy(id="billing_state")private WebElement billingStateFld;
	@FindBy(id="billing_postcode")private WebElement billingPostCodeFld;
	@FindBy(id="billing_email")private WebElement billingEmailFld;
	@FindBy(id="place_order")private WebElement placeOrderBtn;
	@FindBy(xpath="//p[text()=\"Thank you. Your order has been received.\"]")private WebElement noticeTxt;

	public CheckoutPage(WebDriver driver) {
		super(driver);
		
	}
	
	///////////////////////////// Seperate methods for checkout page //////////////////////////////////////
	
	public CheckoutPage enterBillingFirstName(String billingFirstName) {
		WebElement e =wait.until(ExpectedConditions.visibilityOf(billingFirstNameFld));
		e.clear();
		e.sendKeys(billingFirstName);
		return this;    ////// return this from a method the current object instance will be returned/////////
		}
	
	public CheckoutPage enterBillingLastName(String billingLastName) {
		WebElement e =wait.until(ExpectedConditions.visibilityOf(billingLastNameFld));
		e.clear();
		e.sendKeys(billingLastName);
		return this;    
		}
	
	public CheckoutPage enterBillingAddress1(String billingAddress1) {
		WebElement e =wait.until(ExpectedConditions.visibilityOf(address1Fld));
		e.clear();
		e.sendKeys(billingAddress1);
		return this;    
		}
	
	public CheckoutPage enterBillingCity(String billingCity) {
		WebElement e =wait.until(ExpectedConditions.visibilityOf(billingCityFld));
		e.clear();
		e.sendKeys(billingCity);
		return this;    
		}
	
	public CheckoutPage enterBillingState(String billingState) {
		Select select = new Select (wait.until(ExpectedConditions.visibilityOf(billingStateFld)));
		select.selectByVisibleText(billingState);
		return this;    
		}
	
	public CheckoutPage enterBillingPostCode(String billingPostCode) {
		WebElement e =wait.until(ExpectedConditions.visibilityOf(billingPostCodeFld));
		e.clear();
		e.sendKeys(billingPostCode);
		return this;    
		}
	
	public CheckoutPage enterBillingEmail(String billingEmail) {
		WebElement e =wait.until(ExpectedConditions.visibilityOf(billingEmailFld));
		e.clear();
		e.sendKeys(billingEmail);
		return this;    
		}
	
	public CheckoutPage placeOrder() {
		wait.until(ExpectedConditions.elementToBeClickable(placeOrderBtn)).click();;
		
		return this;    
		}
	
	public String getNotice() {
		return wait.until(ExpectedConditions.visibilityOf(noticeTxt)).getText();
		    
		}
	
	////////////////////////////// Single method for Checkout page /////////////////////
	
	/////// NOTE= We can use single methods or individual methods for checkout page in Step Definations File/////////////
//	
//	public CheckoutPage setBillingDetails(String billingFirstName,String billingLastName,String billingAddress1,String billingCity,
//			String billingState,String billingPostCode,String billingEmail) {
//		
//		return enterBillingFirstName(billingFirstName)
//				.enterBillingLastName(billingLastName)
//				.enterBillingAddress1(billingAddress1)
//				.enterBillingCity(billingCity)
//				.enterBillingState(billingState)
//				.enterBillingPostCode(billingPostCode)
//				.enterBillingEmail(billingEmail);
//	}
	public CheckoutPage setBillingDetails(BillingDetails billingDetails) {
		
		return enterBillingFirstName(billingDetails.getBilligFirstName())
				.enterBillingLastName(billingDetails.getBilligLstName())
				.enterBillingAddress1(billingDetails.getBillingStreetaddress_line1())
				.enterBillingCity(billingDetails.getBilligCity())
				.enterBillingState(billingDetails.getBilligState())
				.enterBillingPostCode(billingDetails.getBilligZipCode())
				.enterBillingEmail(billingDetails.getBilligEmailAddress());
	}

	

}
