package demo.SpringCoreUsingAnnotation;

import org.springframework.stereotype.Component;

@Component("add")
public class Address {
	
	private int hno;
	
	private String Street;
	
	private String State;
	
	private int pincode;
	
	public Address() {
		// TODO Auto-generated constructor stub
	}

	public int getHno() {
		return hno;
	}

	public void setHno(int hno) {
		this.hno = hno;
	}

	public String getStreet() {
		return Street;
	}

	public void setStreet(String street) {
		Street = street;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Address [hno=" + hno + ", Street=" + Street + ", State=" + State + ", pincode=" + pincode + "]";
	}

	public Address(int hno, String street, String state, int pincode) {
		super();
		this.hno = hno;
		Street = street;
		State = state;
		this.pincode = pincode;
	}
	
	

}
