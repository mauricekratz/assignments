package employeeAssignment;

public class PresentAddress {

	private int aid;
	private String streetName;
	private String city;
	private String state;
	private int zip;

	public PresentAddress(int aid, String streetName, String city, String state, int zip) {

		this.aid = aid;
		this.streetName = streetName;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}
	
	public void setAID (int aid) {
		this.aid = aid;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	
	public void setCity (String city) {
		this.city = city;
	}
	
	public void setState (String state) {
		this.state = state;
	}
	
	public void setZip (int zip) {
		this.zip = zip ;
	}
	
	public PresentAddress() {
		
	}

	@Override
	public String toString() {
		return "PresentAddress [aid=" + aid + ", streetName=" + streetName + ", city=" + city + ", state=" + state
				+ ", zip=" + zip + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

}
