package stepDefinitions;

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
import pages.StorePage;

public class AddToCartStepDefination {
	
	private final WebDriver driver;
	
	public AddToCartStepDefination(TestContext context) {
		
//		 System.out.println("StepDefination DI Scenario name : " +context.scenarioName);
		driver=context.driver;
		
	}
//	
//
//@Given("I am on the Store page")
//public void i_am_on_the_store_page() {
//	driver= DriverFactory.getDriver();
//	driver.manage().window().maximize();
//	driver.get("https://askomdch.com/store/");
//    
//}
//
//@When("I add {string} to the cart")
//public void i_add_to_the_cart(String productName) throws InterruptedException {
//	
//	// ALL TESTCASES WORK 32,33,34 [34 TESTSTEP IS UDEMY TESTSTEP] 
//	
////	driver.findElement(By.xpath("//a[@aria-label='Add “Blue Shoes” to your cart']")).click();
////	driver.findElement(By.xpath("//a[@aria-label='Add “"+productName+"” to your cart']")).click(); // Dynamically generated element.
////	By addTocartBtn = By.xpath("//a[@aria-label='Add “"+productName+"” to your cart']"); // Dynamically generated element.
////	driver.findElement(addTocartBtn).click();
//	
////	Thread.sleep(5000);
////	driver.findElement(By.xpath("//a[@title='View cart']")).click();
//	
//	new StorePage(driver).addToCart(productName);
//	
//	}
//
//@Then("I should see {int} {string} in the cart")
//public void i_should_see_in_the_cart(Integer quantity, String productName) {
////	
////	String actualProductName = driver.findElement(By.xpath("//a[text()=\"Blue Shoes\"]")).getText();
////	Assert.assertEquals(productName, actualProductName );
////    
////	String getActualQuantity = driver.findElement(By.xpath("//input[@type=\"number\"]")).getAttribute("value");// see inspect element for Attribute (Value=1)
////	Assert.assertEquals( quantity ,Integer.parseInt(getActualQuantity));
//	
//	CartPage cartPage=new CartPage(driver);
//	
//	Assert.assertEquals(productName,cartPage.getProductName());
//	Assert.assertEquals(quantity,cartPage.getProductQuantity());
//}

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//////////////// Use below methods after creating Product domain object and CustomparameterType classes///
	
	
@Given("I am on the Store page")
public void i_am_on_the_store_page() {
//	driver= DriverFactory.getDriver();
	
//	driver.get("https://askomdch.com/store/");
//	new StorePage(driver).load("https://askomdch.com/store/");
//	new StorePage(driver).load("/store/");
	new StorePage(driver).load(MyConstant.STORE);
}

@When("I add {product} to the cart")
public void i_add_to_the_cart(Product product) throws InterruptedException {
	
	new StorePage(driver).addToCart(product.getName());
	
	}

@Then("I should see {int} {product} in the cart")
public void i_should_see_in_the_cart(Integer quantity, Product product) {

	
	CartPage cartPage=new CartPage(driver);
	
	Assert.assertEquals(product.getName(),cartPage.getProductName());
	Assert.assertEquals(quantity,cartPage.getProductQuantity());
}





}
