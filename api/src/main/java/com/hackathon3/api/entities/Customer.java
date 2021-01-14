package com.hackathon3.api.entities;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "customers")
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private Long id;

	private String firstname;
	private String lastname;
	private String email;
	private int phoneNumber;
	private Date birthdate;

	@OneToOne
	@JoinColumn(name = "user_id")
	private User user;
	
	public Customer() { }

	public Customer(String firstname, String lastname, String email, int phoneNumber, Date birthdate) {
		this.setFirstname(firstname);
		this.setLastname(lastname);
		this.setEmail(email);
		this.setPhoneNumber(phoneNumber);
		this.setBirthdate(birthdate);
	}

	//Getters
	public Long getId() {
		return id;
	}
	public String getFirstname() {
		return firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public String getEmail() {
		return email;
	}
	public int getPhoneNumber() {
		return phoneNumber;
	}
	public Date getBirthdate() {
		return birthdate;
	}
	public User getUser() {
		return user;
	}

	//Setters
	public void setId(Long id) {
		this.id = id;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}
	public void setUser(User user) {
		this.user = user;
	}
}
