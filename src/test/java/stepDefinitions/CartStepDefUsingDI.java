package stepDefinitions;


import org.testng.Assert;

import context.TestContext;
import domainObjects.Product;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.CartPage;
import pages.PagefactoryManager;

public class CartStepDefUsingDI {

	private final CartPage cartPage;

	public CartStepDefUsingDI(TestContext context) {

		cartPage = PagefactoryManager.getCartPage(context.driver);
	}

	@Then("I should see {int} {product} in the cart")
	public void i_should_see_in_the_cart(Integer quantity, Product product) {

		Assert.assertEquals(product.getName(), cartPage.getProductName());
		Assert.assertEquals(quantity, cartPage.getProductQuantity());
	}

	@Given("I am on the checkout page")
	public void i_am_on_the_checkout_page() {

		cartPage.checkOut();

	}
}
