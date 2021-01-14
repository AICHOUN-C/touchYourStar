package com.hackathon3.api.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.time.Instant;
import java.util.Date;

@Entity
@Table(name = "product_adding", catalog = "hackathon2db")
@AssociationOverrides({
        @AssociationOverride(name = "pk.order",
            joinColumns = @JoinColumn(name = "order_id")),
        @AssociationOverride(name = "pk.product",
            joinColumns = @JoinColumn(name = "product_list")) })
public class OrderProduct implements java.io.Serializable {

    private OrderProductId pk = new OrderProductId();
    private int quantity;
    private Date createdDate;

    public OrderProduct() { }

    @EmbeddedId
    public OrderProductId getPk() {
        return pk;
    }
    public void setPk(OrderProductId pk) {
        this.pk = pk;
    }

    @Transient
    public Order getOrder() {
        return getPk().getOrder();
    }
    public void setOrder(Order order) {
        getPk().setOrder(order);
    }

    @Transient
    public Product getProduct() {
        return getPk().getProduct();
    }
    public void setProduct(Product product) {
        getPk().setProduct(product);
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "created_date", nullable = false, length = 10)
    public Date getCreatedDate() {
        return this.createdDate;
    }
    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    @Column(name = "quantity", nullable = false, length = 10)
    public int getQuantity() {
        return this.quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        OrderProduct that = (OrderProduct) o;

        if(getPk() != null ? !getPk().equals(that.getPk()) : that.getPk() != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        return (getPk() != null ? getPk().hashCode() : 0);
    }
}
