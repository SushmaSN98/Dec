package com.xworkz.license.dto;

public class AddressDTO {
	private int doorNo;
	private String area;
	private String street;
	private String city;
	private String state;
	private int pinCode;
	
	public AddressDTO() {
	}

	public AddressDTO(int doorNo, String area, String street, String city, String state, int pinCode) {
		super();
		this.doorNo = doorNo;
		this.area = area;
		this.street = street;
		this.city = city;
		this.state = state;
		this.pinCode = pinCode;
	}

	public int getDoorNo() {
		return doorNo;
	}

	public void setDoorNo(int doorNo) {
		this.doorNo = doorNo;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getPinCode() {
		return pinCode;
	}

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
}
	
	


