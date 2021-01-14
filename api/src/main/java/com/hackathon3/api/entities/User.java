package com.hackathon3.api.entities;

import java.time.Instant;

import javax.persistence.*;

@Entity
@Table(name= "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String login;
    private String password;

    @OneToOne(mappedBy = "user")
	private Customer customer;
    
	public User() { }

	public User(String login, String password) {
		super();
		this.setLogin(login);
		this.setPassword(password);
	}

	//Getters
	public Long getId() {
		return id;
	}
	public String getLogin() {
		return login;
	}
	public String getPassword() {
		return password;
	}
	public Customer getCustomer() {return customer; }

	//Setters
	public void setId(Long id) {
		this.id = id;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setCustomer(Customer customer) { this.customer = customer; }
}

