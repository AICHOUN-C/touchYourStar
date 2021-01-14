package com.hackathon3.api.entities;

import com.hackathon3.api.enums.OrderStatus;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Order {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Long id;
	
	@Column(name = "date", unique = true, nullable = false, length = 10)
    private Date date;
	
	@Column(name = "status", unique = true, nullable = false, length = 10)
    private OrderStatus status;
	
	@Column(name = "isPaid", unique = true, nullable = false)
    private boolean isPaid;

    public Order() { }

    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
  
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }
  
    public OrderStatus getStatus() {
        return status;
    }
    public void setStatus(OrderStatus status) {
        this.status = status;
    }
  
    public boolean isPaid() {
        return isPaid;
    }
    public void setPaid(boolean paid) {
        isPaid = paid;
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
