package com.hackathon3.api.dto;

import com.hackathon3.api.entities.Customer;
import com.hackathon3.api.entities.ProductList;
import com.hackathon3.api.enums.OrderStatus;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class OrderDto {

    private Customer customer;
    private Date date;
    private OrderStatus status;
    private boolean isPaid;
    private Set<ProductList> list = new HashSet<ProductList>();

    //Getters
    public Customer getCustomer() {
        return customer;
    }
    public Date getDate() {
        return date;
    }
    public OrderStatus getStatus() {
        return status;
    }
    public boolean isPaid() {
        return isPaid;
    }
    public Set<ProductList> getList() {
        return list;
    }

    //Setters
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    public void setStatus(OrderStatus status) {
        this.status = status;
    }
    public void setPaid(boolean paid) {
        isPaid = paid;
    }
    public void setList(Set<ProductList> list) {
        this.list = list;
    }
}
