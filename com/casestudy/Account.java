package com.casestudy;

public class Account {
	
	private long accNo;
	
	private String accHolderName;
	
	private long contactNo;
	
	private String typeOfAccount;
	
	private float accBal;
	
	

	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", accHolderName=" + accHolderName + ", contactNo=" + contactNo
				+ ", typeOfAccount=" + typeOfAccount + ", accBal=" + accBal + "]";
	}

	public long getAccNo() {
		return accNo;
	}

	public void setAccNo(long accNo) {
		this.accNo = accNo;
	}

	public String getAccHolderName() {
		return accHolderName;
	}

	public void setAccHolderName(String accHolderName) {
		this.accHolderName = accHolderName;
	}

	public long getContactNo() {
		return contactNo;
	}

	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}

	public String getTypeOfAccount() {
		return typeOfAccount;
	}

	public void setTypeOfAccount(String typeOfAccount) {
		this.typeOfAccount = typeOfAccount;
	}

	public float getAccBal() {
		return accBal;
	}

	public void setAccBal(float accBal) {
		this.accBal = accBal;
	}

	public Account(long accNo, String accHolderName, long contactNo, String typeOfAccount, float accBal) {
		super();
		this.accNo = accNo;
		this.accHolderName = accHolderName;
		this.contactNo = contactNo;
		this.typeOfAccount = typeOfAccount;
		this.accBal = accBal;
	}
	
	

}
