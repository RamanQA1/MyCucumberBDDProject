package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CartPage extends BasePage {

	//////////////////////////////// Define
	//////////////////////////////// WebElements////////////////////////////////

	@FindBy(xpath = "//td[@class='product-name']")private WebElement productNameFld;
	
	@FindBy(xpath = "//input[@type=\"number\"]")private WebElement actualQuantityFld;
	@FindBy(xpath = "//a[normalize-space()=\"Proceed to checkout\"]")private WebElement proceedToCheckoutBtn;
	

	public String getProductName() {

		return wait.until(ExpectedConditions.visibilityOf(productNameFld)).getText();
	}

	public int getProductQuantity() {

		return Integer.parseInt(wait.until(ExpectedConditions.visibilityOf(actualQuantityFld)).getAttribute("value"));
	}

	public void checkOut() {

		wait.until(ExpectedConditions.elementToBeClickable(proceedToCheckoutBtn)).click();
	}

	public CartPage(WebDriver driver) {
		super(driver);

	}

}
