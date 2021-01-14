package com.hackathon3.api.entities;

import javax.persistence.*;


@Entity
@Table(name = "product_list")
public class ProductList {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "order_id", nullable = false)
    private Order order;

    @ManyToOne
    @JoinColumn(name = "product_id", nullable = false)
    private Product product;

    private int quantity;

    public ProductList() { }

    public ProductList(Product product, int quantity) {
        this.setProduct(product);
        this.setQuantity(quantity);
    }

    public ProductList(Product product, Order order, int quantity) {
        this.setProduct(product);
        this.setOrder(order);
        this.setQuantity(quantity);
    }

    //Getters
    public Long getId() {
        return id;
    }
    public Order getOrder() {
        return order;
    }
    public Product getProduct() {
        return product;
    }
    public int getQuantity() {
        return quantity;
    }

    //Setters
    public void setId(Long id) {
        this.id = id;
    }
    public void setOrder(Order order) {
        this.order = order;
    }
    public void setProduct(Product product) {
        this.product = product;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
