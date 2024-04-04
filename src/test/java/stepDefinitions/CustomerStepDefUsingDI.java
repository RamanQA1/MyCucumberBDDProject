package stepDefinitions;

import org.openqa.selenium.WebDriver;

import constant.MyConstant;
import context.TestContext;
import domainObjects.BillingDetails;
import io.cucumber.java.en.Given;
import pages.StorePage;

public class CustomerStepDefUsingDI {
	
private final WebDriver driver;
private final TestContext context;

	
	public CustomerStepDefUsingDI(TestContext context) {
		this.context=context;
		
		driver=context.driver;
	}
	
	@Given("I am a guest customer")
	public void i_am_a_guest_customer() {

		new StorePage(driver).load(MyConstant.STORE);

	}
	
	@Given("my billing details are")
	public void my_billing_details_are(BillingDetails billingDetails) {

//		this.billingDetails=billingDetails;
		context.billingDetails=billingDetails;  // Set the value for billing details../////////

	}

}
