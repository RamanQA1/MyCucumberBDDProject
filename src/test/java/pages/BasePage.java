package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.ConfigLoader;

public class BasePage {
	
	protected WebDriver driver;
	protected WebDriverWait wait;
	
	
	public BasePage(WebDriver driver) {
		super();
		this.driver = driver;
		
		wait= new WebDriverWait(driver,Duration.ofSeconds(10));
		PageFactory.initElements(driver, this);
	}
	
//	public void load(String url) {
//		
//		driver.get(url);
//	}
	
	public void load(String endPoint) {
		
		driver.get(ConfigLoader.getInstance().getBaseUrl() +endPoint);
	}	

}
