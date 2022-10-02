package com.entity;

//@Entity
public class Insurance {
	
	//@Id
	private int id;
	private String insuranceProvider;
	private long insuranceNumber;
	private String validDate;

	private User user;
	
	public Insurance()
	{
		
	}

	public Insurance( int id,String insuranceProvider, long insuranceNumber, String validDate) {
		super();
		this.id =id;
		this.insuranceProvider = insuranceProvider;
		this.insuranceNumber = insuranceNumber;
		this.validDate = validDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getInsuranceProvider() {
		return insuranceProvider;
	}

	public void setInsuranceProvider(String insuranceProvider) {
		this.insuranceProvider = insuranceProvider;
	}

	public long getInsuranceNumber() {
		return insuranceNumber;
	}

	public void setInsuranceNumber(long insuranceNumber) {
		this.insuranceNumber = insuranceNumber;
	}

	public String getValidDate() {
		return validDate;
	}

	public void setValidDate(String validDate) {
		this.validDate = validDate;
	}

	

}
