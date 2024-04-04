package customType;

import domainObjects.Product;
import io.cucumber.java.ParameterType;

public class CustomparameterType {
	
	@ParameterType(value = ".*")
	public Product product (String name) {
		
		return new Product(name.replace("\"",""));
		
	}

}
