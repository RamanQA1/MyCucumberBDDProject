package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import context.TestContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CartPage;
import pages.CheckoutPage;
import pages.PagefactoryManager;

public class CheckoutStepDefUsingDI {
	
private final WebDriver driver;
private final TestContext context;
public final CheckoutPage checkoutPage;

	
	public CheckoutStepDefUsingDI(TestContext context) {
		checkoutPage=PagefactoryManager.getCheckoutPage(context.driver);
		this.context=context;
		driver=context.driver;
	}
	
	

	@When("I provide billing details")
	public void i_provide_billing_details() {

		


		
//		checkoutpage.setBillingDetails(billingDetails);
		checkoutPage.setBillingDetails(context.billingDetails);

	}

	@When("I Placed an order")
	public void i_placed_an_order() throws InterruptedException {

		 checkoutPage.placeOrder();

	}

	@Then("The order should placed successfully")
	public void the_order_should_placed_successfully() {

		Assert.assertEquals("Thank you. Your order has been received.",  checkoutPage.getNotice());

	}

}
