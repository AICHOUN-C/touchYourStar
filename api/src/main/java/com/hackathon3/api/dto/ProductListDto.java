package com.hackathon3.api.dto;

import com.hackathon3.api.entities.Order;
import com.hackathon3.api.entities.Product;

public class ProductListDto {

    private Order order;
    private Product product;
    private int quantity;

    //Getters
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
