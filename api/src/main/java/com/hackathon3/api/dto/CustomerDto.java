package com.hackathon3.api.dto;

import com.hackathon3.api.entities.User;

import java.util.Date;

public class CustomerDto {

    private String firstname;
    private String lastname;
    private String email;
    private int phoneNumber;
    private Date birthdate;
    private User user;

    //Getters
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
