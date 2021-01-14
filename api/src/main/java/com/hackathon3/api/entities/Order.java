package com.hackathon3.api.entities;

import com.hackathon3.api.enums.OrderStatus;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "orders")
public class Order {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

	@ManyToOne
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customer;

    private Date date;
    private OrderStatus status;
    private boolean isPaid;

    @OneToMany(targetEntity = ProductList.class, mappedBy = "order", cascade = CascadeType.ALL)
    private Set<ProductList> list = new HashSet<ProductList>();

    public Order() { }

    public Order(Customer customer, Date date) {
        this.setCustomer(customer);
        this.setDate(date);
    }

    //Getters
    public Long getId() {
        return id;
    }
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

    //Setter
    public void setId(Long id) {
        this.id = id;
    }
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

    public boolean isDeliverable() {
        if(getStatus() == OrderStatus.PENDING) {
            return true;
        }
        return false;
    }

    public boolean isSent() {
        if(getStatus() == OrderStatus.ONGOING) {
            return true;
        }
        return false;
    }

    public boolean isDelivered() {
        if(getStatus() == OrderStatus.DELIVERED) {
            return true;
        }
        return false;
    }

    public boolean isCancelled() {
        if(getStatus() == OrderStatus.CANCELLED) {
            return true;
        }
        return false;
    }
}
