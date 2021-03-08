package employeeAssignment;

public class PermanentAddress {
	private int aidPermanent;
	private String streetNamePermanent;
	private String cityPermanent;
	private String statePermanent;
	private int zipPermanent;

	public PermanentAddress(int aidPermanent, String streetNamePermanent, String cityPermanent, String statePermanent,
			int zipPermanent) {
		
		this.aidPermanent = aidPermanent;
		this.streetNamePermanent = streetNamePermanent;
		this.cityPermanent = cityPermanent;
		this.statePermanent = statePermanent;
		this.zipPermanent = zipPermanent;
	}
	public void setAIDPermanent (int aidPermanent) {
		this.aidPermanent = aidPermanent;
	}

	public void setStreetNamePermanent(String streetNamePermanent) {
		this.streetNamePermanent = streetNamePermanent;
	}
	
	public void setCityPermanent (String cityPermanent) {
		this.cityPermanent = cityPermanent;
	}
	
	public void setStatePermanent (String statePermanent) {
		this.statePermanent = statePermanent;
	}
	
	public void setZipPermanent (int zipPermanent) {
		this.zipPermanent = zipPermanent ;
	}
	
	public PermanentAddress() {
		
	}
	@Override
	public String toString() {
		return "PermanentAddress [aidPermanent=" + aidPermanent + ", streetNamePermanent=" + streetNamePermanent
				+ ", cityPermanent=" + cityPermanent + ", statePermanent=" + statePermanent + ", zipPermanent="
				+ zipPermanent + "]";
	}

}
