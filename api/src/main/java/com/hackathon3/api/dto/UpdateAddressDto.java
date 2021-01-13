package com.hackathon3.api.dto;

public class UpdateAddressDto {

	private String recipient;
    private int number;
    private String street;
    private String streetAdd;
    private int zipCode;
    private String city;
    private String state;
    private int digitalCode;
    private String infoAdded;
    
	public String getRecipient() {
		return recipient;
	}
	public void setRecipient(String recipient) {
		this.recipient = recipient;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getStreetAdd() {
		return streetAdd;
	}
	public void setStreetAdd(String streetAdd) {
		this.streetAdd = streetAdd;
	}
	public int getZipCode() {
		return zipCode;
	}
	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
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
	public int getDigitalCode() {
		return digitalCode;
	}
	public void setDigitalCode(int digitalCode) {
		this.digitalCode = digitalCode;
	}
	public String getInfoAdded() {
		return infoAdded;
	}
	public void setInfoAdded(String infoAdded) {
		this.infoAdded = infoAdded;
	}
    
}
