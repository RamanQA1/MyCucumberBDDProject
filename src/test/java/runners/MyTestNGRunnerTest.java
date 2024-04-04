package runners;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;




@CucumberOptions(plugin = { "pretty", "html:target/cucumber.html", "summary" },// Pretty plugin give detail report//

features ="src/test/java/featureFile/Add_to_cart!.feature" ,
		snippets = SnippetType.CAMELCASE,
		dryRun=false ,          // dryRun false se chrome browser open hoga 
		tags= "@scenarioCase",
		
		
		
		glue={"stepDefinitionsUsingDiAndPageFactoryManager","hooks","domainObjects","constant","customType","factory","pages","utils","config","context"}
		
		) 

public class MyTestNGRunnerTest extends AbstractTestNGCucumberTests{
	
	//////////////// this Method for parallel execution /////////////////////
	
	 @Override
	    @DataProvider(parallel = true)
	    public Object[][] scenarios() {
	        return super.scenarios();

}
}
