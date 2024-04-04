//package stepDefinitions;
//
//import java.util.List;
//import java.util.Map;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;
//import org.testng.Assert;
//
//import factory.DriverFactory;
//import io.cucumber.java.en.*;
//import io.github.bonigarcia.wdm.WebDriverManager;
//import pages.CartPage;
//import pages.CheckoutPage;
//import pages.StorePage;		
//
//public class PlaceOrder {
//
//	private WebDriver driver;
//
//	@Given("I am a guest customer")
//	public void i_am_a_guest_customer() {
//		driver = DriverFactory.getDriver();
//		driver.get("https://askomdch.com/store/");
//
//	}
//
//	@Given("I have a product in the cart")
//	public void i_have_a_product_in_the_cart() throws InterruptedException {
//
////	driver.findElement(By.xpath("//a[@aria-label='Add “Blue Shoes” to your cart']")).click();
////	
////	Thread.sleep(5000);
////	driver.findElement(By.xpath("//a[@title='View cart']")).click();
//
//		new StorePage(driver).productInTheCart();
//
//	}
//
//	@Given("I am on the checkout page")
//	public void i_am_on_the_checkout_page() {
//
//		// driver.findElement(By.xpath("//a[normalize-space()=\"Proceed to
//		// checkout\"]")).click();
//
//		new CartPage(driver).checkOut();
//
//	}
//
//@When("I provide billing details")
//public void i_provide_billing_details(List<Map<String,String>> billingDetails) {
////	
////	driver.findElement(By.id("billing_first_name")).sendKeys(billingDetails.get(0).get("First name"));
////	driver.findElement(By.id("billing_last_name")).sendKeys(billingDetails.get(0).get("Last name"));
////	driver.findElement(By.id("billing_address_1")).sendKeys(billingDetails.get(0).get("Street address_line1"));
////	WebElement cityy = driver.findElement(By.id("billing_city"));
////	cityy.clear();
////	cityy.sendKeys(billingDetails.get(0).get("City"));
////	Select select = new Select(driver.findElement(By.id("billing_state")));
////	select.selectByVisibleText(billingDetails.get(0).get("State"));
////	driver.findElement(By.id("billing_postcode")).sendKeys(billingDetails.get(0).get("Zip code"));
////	driver.findElement(By.id("billing_email")).sendKeys(billingDetails.get(0).get("Email address"));
////	   
//	CheckoutPage checkoutpage= new CheckoutPage(driver);
//	
//	// we can do is we can either use the individual methods.
//	
////	checkoutpage.enterBillingFirstName(billingDetails.get(0).get("First name"));
//	
//	//or we can use the signal method/////////////////
//	
//	checkoutpage.setBillingDetails(billingDetails.get(0).get("First name"),
//			billingDetails.get(0).get("Last name"),
//			billingDetails.get(0).get("Street address_line1"),
//			billingDetails.get(0).get("City"), 
//			billingDetails.get(0).get("State"),
//			billingDetails.get(0).get("Zip code"),
//			billingDetails.get(0).get("Email address"));
//   
//}
//
//	@When("I Placed an order")
//	public void i_placed_an_order() throws InterruptedException {
//
////		driver.findElement(By.id("place_order")).click();
////		Thread.sleep(5000);
//		new CheckoutPage(driver).placeOrder();
//		
//	}
//
//	@Then("The order should placed successfully")
//	public void the_order_should_placed_successfully() {
//
////		String actualTxt = driver.findElement(By.xpath("//p[text()=\"Thank you. Your order has been received.\"]"))
////				.getText();
//		Assert.assertEquals( "Thank you. Your order has been received.", new CheckoutPage(driver).getNotice());
//
//	}
//
//}
