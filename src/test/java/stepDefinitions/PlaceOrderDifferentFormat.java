package stepDefinitions;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import constant.MyConstant;
import domainObjects.BillingDetails;
import factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CartPage;
import pages.CheckoutPage;
import pages.StorePage;

public class PlaceOrderDifferentFormat {

	private WebDriver driver;
	
	// Before creating doamin objects and custom data table we uses these variables///////////////
////////////////////////////////////////////////////////////////////////////////////////////////	
//	private String billigFirstName;
//	private String billigLstName;
//	private String billingStreetaddress_line1;
//	private String billigCity;
//	private String billigState;
//	private String billigZipCode;
//	private String billigEmailAddress;
	//////////////////////////////////////////////////////////////////////////////////////////
	private BillingDetails billingDetails;

	@Given("I am a guest customer")
	public void i_am_a_guest_customer() {
//		driver = DriverFactory.getDriver();
//		driver.get("https://askomdch.com/store/");
		new StorePage(driver).load(MyConstant.STORE);

	}

	@Given("my billing details are")
	public void my_billing_details_are(BillingDetails billingDetails) {
//		
//		 billigFirstName= billingDetails.get(0).get("First name");
//		 billigLstName=billingDetails.get(0).get("Last name");
//		 billingStreetaddress_line1=billingDetails.get(0).get("Street address_line1");
//		 billigCity=billingDetails.get(0).get("City");
//		 billigState=billingDetails.get(0).get("State");
//		 billigZipCode=billingDetails.get(0).get("Zip code");
//	     billigEmailAddress=billingDetails.get(0).get("Email address");
		this.billingDetails=billingDetails;

	}

	@Given("I have a product in the cart")
	public void i_have_a_product_in_the_cart() throws InterruptedException {

		new StorePage(driver).productInTheCart();

	}

	@Given("I am on the checkout page")
	public void i_am_on_the_checkout_page() {

		new CartPage(driver).checkOut();

	}

	@When("I provide billing details")
	public void i_provide_billing_details() {

		CheckoutPage checkoutpage = new CheckoutPage(driver);

//		checkoutpage.setBillingDetails( billigFirstName,
//		 billigLstName,
//		 billingStreetaddress_line1,
//		 billigCity,
//		 billigState,
//		 billigZipCode,
//		 billigEmailAddress);
		
		checkoutpage.setBillingDetails(billingDetails);

	}

	@When("I Placed an order")
	public void i_placed_an_order() throws InterruptedException {

		new CheckoutPage(driver).placeOrder();

	}

	@Then("The order should placed successfully")
	public void the_order_should_placed_successfully() {

		Assert.assertEquals("Thank you. Your order has been received.", new CheckoutPage(driver).getNotice());

	}

}
