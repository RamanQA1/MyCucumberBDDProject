package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import constant.MyConstant;
import context.TestContext;
import domainObjects.Product;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.PagefactoryManager;
import pages.StorePage;

public class StoreStepDefUsingDI {
	
	
	public final StorePage storePage;
	
	public StoreStepDefUsingDI(TestContext context) {
		storePage=PagefactoryManager.getStorePage(context.driver);
		
	 
	}

	@Given("I am on the Store page")
	public void i_am_on_the_store_page() {

		 storePage.load(MyConstant.STORE);
	}

	@When("I add {product} to the cart")
	public void i_add_to_the_cart(Product product) throws InterruptedException {

		 storePage.addToCart(product.getName());

	}

	@Given("I have a product in the cart")
	public void i_have_a_product_in_the_cart() throws InterruptedException {

		 storePage.productInTheCart();

	}

}
