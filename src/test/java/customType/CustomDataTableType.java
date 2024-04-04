package customType;

import java.util.Map;

import domainObjects.BillingDetails;
import io.cucumber.java.DataTableType;

public class CustomDataTableType {
	
	@DataTableType
	public BillingDetails billingDetailsEntry(Map<String,String> entry) {
		
		return new BillingDetails(entry.get("First name"),
				entry.get("Last name"),entry.get("Street address_line1"),
				entry.get("City"),entry.get("State"),entry.get("Zip code"),entry.get("Email address"));
		
		
	}

}
