package stepDefinitionsUsingDiAndPageFactoryManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import constant.MyConstant;
import context.TestContext;
import domainObjects.Product;
import factory.DriverFactory;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.CartPage;
import pages.PagefactoryManager;
import pages.StorePage;

public class AddToCartStepDefination {

	private final WebDriver driver;
	public final StorePage storePage;
	public final CartPage cartPage;

	public AddToCartStepDefination(TestContext context) {
		storePage=PagefactoryManager.getStorePage(context.driver);
		cartPage=PagefactoryManager.getCartPage(context.driver);

		driver = context.driver;

	}

	@Given("I am on the Store page")
	public void i_am_on_the_store_page() {
		;
		 storePage.load(MyConstant.STORE);
	}

	@When("I add {product} to the cart")
	public void i_add_to_the_cart(Product product) throws InterruptedException {

		 storePage.addToCart(product.getName());

	}

	@Then("I should see {int} {product} in the cart")
	public void i_should_see_in_the_cart(Integer quantity, Product product) {

		

		Assert.assertEquals(product.getName(), cartPage.getProductName());
		Assert.assertEquals(quantity, cartPage.getProductQuantity());
	}

}
