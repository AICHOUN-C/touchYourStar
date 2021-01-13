package com.hackathon3.api.dto;

import com.hackathon3.api.entities.Address;
import com.hackathon3.api.entities.Customer;
import com.hackathon3.api.entities.Product;
import com.hackathon3.api.enums.OrderStatus;

import java.util.Date;
import java.util.List;

public class CreateOrderDto {
    Date date;
    List<Product> productList;
    OrderStatus status;
    Customer customer;
    Address deliveryAddress;
    Address billingAddress;

    //Getters
    public Date getDate() {
        return date;
    }
    public List<Product> getProductList() {
        return productList;
    }
    public OrderStatus getStatus() {
        return status;
    }
    public Customer getCustomer() {
        return customer;
    }
    public Address getDeliveryAddress() {
        return deliveryAddress;
    }
    public Address getBillingAddress() {
        return billingAddress;
    }

    //Setters
    public void setDate(Date date) {
        this.date = date;
    }
    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }
    public void setStatus(OrderStatus status) {
        this.status = status;
    }
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    public void setDeliveryAddress(Address deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }
    public void setBillingAddress(Address billingAddress) {
        this.billingAddress = billingAddress;
    }
}