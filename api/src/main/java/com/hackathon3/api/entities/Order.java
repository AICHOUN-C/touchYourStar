package com.hackathon3.api.entities;

import com.hackathon3.api.enums.OrderStatus;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "order", catalog = "hackathon2db", uniqueConstraints = {
        @UniqueConstraint(columnNames = "date"),
        @UniqueConstraint(columnNames = "status"),
        @UniqueConstraint(columnNames = "is_paid"),
        @UniqueConstraint(columnNames = "customer_id"),
        @UniqueConstraint(columnNames = "delivery_address"),
        @UniqueConstraint(columnNames = "billing_address"),
         })
public class Order implements java.io.Serializable {

    private Long id;
    private Date date;
    private OrderStatus status;
    private boolean isPaid;
    private Customer customer;
    private Address deliveryAddress;
    private Address billingAddress;
    private Set<OrderProduct> orderProducts = new HashSet<OrderProduct>(0);

    public Order() { }

    public Order(Date date,
                 OrderStatus status,
                 boolean isPaid,
                 Customer customer,
                 Address deliveryAddress,
                 Address billingAddress) {
        this.status = status;
        this.isPaid = isPaid;
        this.customer = customer;
        this.deliveryAddress = deliveryAddress;
        this.billingAddress = billingAddress;
    }

    public Order(Date date,
                 OrderStatus status,
                 boolean isPaid,
                 Customer customer,
                 Address deliveryAddress,
                 Address billingAddress,
                 Set<OrderProduct> orderProducts) {
        this.date = date;
        this.status = status;
        this.isPaid = isPaid;
        this.customer = customer;
        this.deliveryAddress = deliveryAddress;
        this.billingAddress = billingAddress;
        this.orderProducts = orderProducts;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "date", unique = true, nullable = false, length = 10)
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }

    @Column(name = "status", unique = true, nullable = false, length = 10)
    public OrderStatus getStatus() {
        return status;
    }
    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    @Column(name = "isPaid", unique = true, nullable = false)
    public boolean isPaid() {
        return isPaid;
    }
    public void setPaid(boolean paid) {
        isPaid = paid;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "customer", cascade = CascadeType.ALL)
    public Customer getCustomer() {
        return customer;
    }
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "address", cascade = CascadeType.ALL)
    public Address getDeliveryAddress() {
        return deliveryAddress;
    }
    public void setDeliveryAddress(Address deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "address", cascade = CascadeType.ALL)
    public Address getBillingAddress() {
        return billingAddress;
    }
    public void setBillingAddress(Address billingAddress) {
        this.billingAddress = billingAddress;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "pk.order", cascade = CascadeType.ALL)
    public Set<OrderProduct> getOrderProducts() {
        return orderProducts;
    }
    public void setOrderProducts(Set<OrderProduct> orderProducts) {
        this.orderProducts = orderProducts;
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
