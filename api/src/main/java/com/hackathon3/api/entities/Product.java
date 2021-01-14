package com.hackathon3.api.entities;

import javax.persistence.*;

@Entity
@Table(name = "products")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private Long id;

	private String reference;
	private String brand;
	private String description;
	private String category;
	private String image;
	@Column(name = "unitary_price")
	private double price;
	private int quantityInStock;

	public Product() { }

	//Getters
	public Long getId() {
		return id;
	}
	public String getReference() {
		return reference;
	}
	public String getBrand() {
		return brand;
	}
	public String getDescription() {
		return description;
	}
	public String getCategory() {
		return category;
	}
	public String getImage() {
		return image;
	}
	public double getPrice() {
		return price;
	}
	public int getQuantityInStock() {
		return quantityInStock;
	}

	//Setters
	public void setId(Long id) {
		this.id = id;
	}
	public void setReference(String reference) {
		this.reference = reference;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public void setPrice(double price) {
		if(price < 0) throw	new RuntimeException("Le prix doit être positif");
		this.price = price;
	}
	public void setQuantityInStock(int quantityInStock) {
		this.quantityInStock = quantityInStock;
	}
}
