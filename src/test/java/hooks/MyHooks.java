package hooks;

import org.openqa.selenium.WebDriver;

import context.TestContext;
import factory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class MyHooks {
	
	private WebDriver driver;
	private  final TestContext context;
	
	public MyHooks(TestContext context) {
		this.context=context;
		
	}
	
//	@Before
//	public void before() {
//		
//		driver= DriverFactory.initializeDriver();
//		System.out.println("Before hook");
//		
//	}
	
//	@Before
//	public void before() {
//		
//		driver= DriverFactory.initializeDriver(System.getProperty("browser","chrome"));
//		System.out.println("Before hook");
//		
//	}
//	
//	
//	@After
//	public void after() {
//		
//		System.out.println("After hook");
//		
//		driver.quit();
//	}
//	
	
	//////////////////////////// For parallel execution to get thread id's ////////////////////////////
	
//	@Before
//	public void before(Scenario scenario) {
//		
//		System.out.println("Before Thread ID : " +Thread.currentThread().getId()+ ","+
//		"Scenario Name : " +scenario.getName());
//		
//		driver= DriverFactory.initializeDriver(System.getProperty("browser","chrome"));
//		
//		
//	}
//	
//	
//	@After
//	public void after(Scenario scenario) {
//		System.out.println("After Thread ID : " +Thread.currentThread().getId()+ ","+
//				"Scenario Name : " +scenario.getName());
//		
//		driver.quit();
//	}
	
	//////////////////////// for dependency injection using pico container ///////////////////////////
	
	@Before
	public void before(Scenario scenario) {
		
		
//		context.scenarioName=scenario.getName();
//		System.out.println("DI Scenario Name : " +context.scenarioName);
		
//		System.out.println("Before Thread ID : " +Thread.currentThread().getId()+ ","+
//		"Scenario Name : " +scenario.getName());
		
		driver= DriverFactory.initializeDriver(System.getProperty("browser","chrome"));
		context.driver=driver;
		
		
	}
	
	
	@After
	public void after(Scenario scenario) {
//		System.out.println("After Thread ID : " +Thread.currentThread().getId()+ ","+
//				"Scenario Name : " +scenario.getName());
		
		driver.quit();
	}


}
