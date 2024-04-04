package factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {
	
	//private static WebDriver driver;
//	private static ThreadLocal<WebDriver> driver= new ThreadLocal<>(); // for parallel exexution /////
	
//	public static WebDriver initializeDriver() {
//		
//		WebDriverManager.chromedriver().setup();
//		 driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		return driver;
//		
//	}
	
//	public static WebDriver initializeDriver(String browser) {
//		
//		switch(browser) {
//		
//		case "chrome":
//			WebDriverManager.chromedriver().setup();
//			 driver = new ChromeDriver();
//			 break;
//			
//		case "firefox":	
//			WebDriverManager.firefoxdriver().setup();
//			 driver = new FirefoxDriver();
//			 break;
//			 
//		default:
//			throw new IllegalStateException("Invalid Browser : " +browser);
//			
//			}
//		
//		
//		driver.manage().window().maximize();
//		return driver;
//		
//	}
//	
//	public static WebDriver getDriver() {
//		
//		return driver;
//	}
	
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	/////For parallel execution we need to do this congiguration in the code. Explanation in register./////////////////
//	
//public static WebDriver initializeDriver(String browser) {
//	
//	WebDriver driver;
//		
//		switch(browser) {
//		
//		case "chrome":
//			WebDriverManager.chromedriver().setup();
//			 driver = new ChromeDriver();
//			 break;
//			
//		case "firefox":	
//			WebDriverManager.firefoxdriver().setup();
//			 driver = new FirefoxDriver();
//			 break;
//			 
//		default:
//			throw new IllegalStateException("Invalid Browser : " +browser);
//			
//			}
//		
//		
//		driver.manage().window().maximize();
//		DriverFactory.driver.set(driver);
//		return driver;
//		
//	}
//	
//	public static WebDriver getDriver() {
//		
//		return driver.get();
//	}
//	
	
/////////////////////////////////// Code after implimentation DI pico container ///////////////////////////
	
	
	
	public static WebDriver initializeDriver(String browser) {
		
		WebDriver driver;
			
			switch(browser) {
			
			case "chrome":
				WebDriverManager.chromedriver().setup();
				 driver = new ChromeDriver();
				 break;
				
			case "firefox":	
				WebDriverManager.firefoxdriver().setup();
				 driver = new FirefoxDriver();
				 break;
				 
			default:
				throw new IllegalStateException("Invalid Browser : " +browser);
				
				}
			
			
			driver.manage().window().maximize();
			
			return driver;
			
		}
		
		
		
	
	
	

}
