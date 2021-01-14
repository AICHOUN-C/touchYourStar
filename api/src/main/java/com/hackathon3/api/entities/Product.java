package com.hackathon3.api.entities;


import org.springframework.security.core.parameters.P;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "product", catalog = "hackathon2db")
public class Product implements java.io.Serializable {

	private Long id;
	private String category;
	private String price;
	private int quantity;
	private String name;
	private String description;
	private String reference;
	private String image;
	private Set<OrderProduct> orderProducts = new HashSet<OrderProduct>(0);
	
	public Product() { }

	public Product(String category,
				   String price,
				   int quantity,
				   String name,
				   String description,
				   String reference,
				   String image) {
		this.category = category;
		this.price = price;
		this.quantity = quantity;
		this.name = name;
		this.description = description;
		this.reference = reference;
		this.image = image;
	}

	public Product(String category,
				   String price,
				   int quantity,
				   String name,
				   String description,
				   String reference,
				   String image,
				   Set<OrderProduct> orderProducts) {
		this.category = category;
		this.price = price;
		this.quantity = quantity;
		this.name = name;
		this.description = description;
		this.reference = reference;
		this.image = image;
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

	@Column(name = "category", nullable = false)
	public String getCategory() {
		return this.category;
	}
	public void setCategory(String category) {
		this.category = category;
	}

	@Column(name = "price", nullable = false)
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

	@Column(name = "quantity", nullable = false)
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Column(name = "name", nullable = false)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "description", nullable = false)
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "reference", nullable = false)
	public String getReference() {
		return reference;
	}
	public void setReference(String reference) {
		this.reference = reference;
	}

	@Column(name = "image", nullable = false)
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "pk.product")
	public Set<OrderProduct> getOrderProducts() {
		return orderProducts;
	}
	public void setOrderProducts(Set<OrderProduct> orderProducts) {
		this.orderProducts = orderProducts;
	}
}
