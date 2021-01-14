package com.hackathon3.api.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="address")
public class Address {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String recipient;
    private int number;
    private String street;
    private String streetAdd;
    private int zipCode;
    private String city;
    private String state;
       
    //Delivery attribute
    private String digitalCode;
    private String infoAdded;
    
    public Address() { }

    //Getters
	public Long getId() {
		return id;
	}
	public String getRecipient() {
		return recipient;
	}
	public int getNumber() {
		return number;
	}
	public String getStreet() {
		return street;
	}
	public String getStreetAdd() {
		return streetAdd;
	}
	public int getZipCode() {
		return zipCode;
	}
	public String getCity() {
		return city;
	}
	public String getState() {
		return state;
	}
	public String getDigitalCode() {
		return digitalCode;
	}
	public String getInfoAdded() {
		return infoAdded;
	}

	//Setters
	public void setId(Long id) {
		this.id = id;
	}
	public void setRecipient(String recipient) {
		this.recipient = recipient;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public void setStreetAdd(String streetAdd) {
		this.streetAdd = streetAdd;
	}
	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setState(String state) {
		this.state = state;
	}
	public void setDigitalCode(String digitalCode) {
		this.digitalCode = digitalCode;
	}
	public void setInfoAdded(String infoAdded) {
		this.infoAdded = infoAdded;
	}
}
