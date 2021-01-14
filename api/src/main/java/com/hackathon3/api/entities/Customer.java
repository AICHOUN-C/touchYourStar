package com.hackathon3.api.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
public class Customer {

	private Long id;
	private String firstname;
	private String lastname;
	private String email;
	private int phoneNumber;
	private Date birthdate;
	private User user;
	private Address address;
	private Set<OrderProduct> orderProducts = new HashSet<OrderProduct>(0);

	public Customer() { }

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	@Column(name = "firstname", nullable = false)
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	@Column(name = "lastname", nullable = false)
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	@Column(name = "email", nullable = false)
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "phone_number", nullable = true)
	public int getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public Date getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}

	@Column(name = "birthdate", nullable = true)


    @OneToOne(mappedBy = "user")
    @JoinColumn(name = "user_id")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "address")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "pk.customer", cascade = CascadeType.ALL)
	public Set<OrderProduct> getCustomerOrders() {
		return this.orderProducts;
	}
	public void setCustomerOrders(Set<OrderProduct> orderProducts) {
		this.orderProducts = orderProducts;
	}
}
