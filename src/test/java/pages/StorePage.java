package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class StorePage extends BasePage {

	//////////////////////////////////////// Define the
	//////////////////////////////////////// WebElements///////////////////////////////////

	@FindBy(xpath = "//a[@aria-label='Add “Blue Shoes” to your cart']")private WebElement blueShoesAddToCart;
	@FindBy(xpath = "//a[@title='View cart']")private WebElement viewCartLink;
	

	public void productInTheCart() {

		driver.findElement(By.xpath("//a[@aria-label='Add “Blue Shoes” to your cart']"));
		wait.until(ExpectedConditions.elementToBeClickable(blueShoesAddToCart)).click();
		wait.until(ExpectedConditions.elementToBeClickable(viewCartLink)).click();
	}

	public void addToCart(String productName) { // It will take ProductName as an Argument

		By addTocartBtn = By.xpath("//a[@aria-label='Add “" + productName + "” to your cart']");
		wait.until(ExpectedConditions.elementToBeClickable(addTocartBtn)).click();
		wait.until(ExpectedConditions.elementToBeClickable(viewCartLink)).click();

	}

	public StorePage(WebDriver driver) {
		super(driver);

	}

}
