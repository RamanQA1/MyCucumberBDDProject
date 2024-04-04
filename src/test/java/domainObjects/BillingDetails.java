package domainObjects;

public class BillingDetails {
	
	private String billigFirstName;
	private String billigLstName;
	private String billingStreetaddress_line1;
	private String billigCity;
	private String billigState;
	private String billigZipCode;
	private String billigEmailAddress;
	
	///////////////// Constructor///////////////
	public BillingDetails(String billigFirstName, String billigLstName, String billingStreetaddress_line1,
			String billigCity, String billigState, String billigZipCode, String billigEmailAddress) {
		super();
		this.billigFirstName = billigFirstName;
		this.billigLstName = billigLstName;
		this.billingStreetaddress_line1 = billingStreetaddress_line1;
		this.billigCity = billigCity;
		this.billigState = billigState;
		this.billigZipCode = billigZipCode;
		this.billigEmailAddress = billigEmailAddress;
	}
	
	
	public String getBilligFirstName() {
		return billigFirstName;
	}
	public void setBilligFirstName(String billigFirstName) {
		this.billigFirstName = billigFirstName;
	}
	public String getBilligLstName() {
		return billigLstName;
	}
	public void setBilligLstName(String billigLstName) {
		this.billigLstName = billigLstName;
	}
	public String getBillingStreetaddress_line1() {
		return billingStreetaddress_line1;
	}
	public void setBillingStreetaddress_line1(String billingStreetaddress_line1) {
		this.billingStreetaddress_line1 = billingStreetaddress_line1;
	}
	public String getBilligCity() {
		return billigCity;
	}
	public void setBilligCity(String billigCity) {
		this.billigCity = billigCity;
	}
	public String getBilligState() {
		return billigState;
	}
	public void setBilligState(String billigState) {
		this.billigState = billigState;
	}
	public String getBilligZipCode() {
		return billigZipCode;
	}
	public void setBilligZipCode(String billigZipCode) {
		this.billigZipCode = billigZipCode;
	}
	public String getBilligEmailAddress() {
		return billigEmailAddress;
	}
	public void setBilligEmailAddress(String billigEmailAddress) {
		this.billigEmailAddress = billigEmailAddress;
	}

}
