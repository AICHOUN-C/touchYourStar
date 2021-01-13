package com.hackathon3.api.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="address")
public class Address {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@Column(name="recipient", nullable = true)
    private String recipient;
	
	@Column(name="number", nullable = false)
    private int number;
	
	@Column(name="street", nullable = false)
    private String street;
	
    @Column(name="streetAdd", nullable = true)
    private String streetAdd;
    
    @Column(name="zipCode", nullable = false)
    private int zipCode;
    
    @Column(name="city", nullable = false)
    private String city;
    
    @Column(name="state", nullable = false)
    private String state;
    
    @Column(name="deliveryAddress")
    @OneToMany(mappedBy = "address", cascade = CascadeType.REFRESH)
    private List<Order> orders;
    
    
    //Delivery attribute
    @Column(name="digitalCode", nullable = true)
    private int digitalCode;
    @Column(name="infoAdded", nullable = true)
    private String infoAdded;
    
    //Billing attribute
    private int order_id;
    
    public Address() {
    	
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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

	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
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

	public int getOrder_id() {
		return order_id;
	}

	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}
    
}
