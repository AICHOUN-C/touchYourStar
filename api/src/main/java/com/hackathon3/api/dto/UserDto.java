package com.hackathon3.api.dto;

import com.hackathon3.api.entities.Customer;

public class UserDto {

    private String login;
    private String password;
    private Customer customer;

    //Getters
    public String getLogin() {
        return login;
    }
    public String getPassword() {
        return password;
    }
    public Customer getCustomer() {
        return customer;
    }

    //Setters
    public void setLogin(String login) {
        this.login = login;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
