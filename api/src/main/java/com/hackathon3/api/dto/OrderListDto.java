package com.hackathon3.api.dto;


public class OrderListDto {
  
	private String reference;
	private String brand;
	private String description;
	private String category;
	private String image;
	private double price;
	private int quantityInStock;

	//Getters
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
		this.price = price;
	}
	public void setQuantityInStock(int quantityInStock) {
		this.quantityInStock = quantityInStock;
	}
}