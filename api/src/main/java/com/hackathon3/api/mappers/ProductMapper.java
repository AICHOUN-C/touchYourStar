package com.hackathon3.api.mappers;

import org.springframework.stereotype.Component;

import com.hackathon3.api.dto.ProductDto;
import com.hackathon3.api.entities.Product;

@Component
public class ProductMapper {
	public Product create(ProductDto dto) {
		Product product = new Product();
		product.setReference(dto.getReference());
		product.setBrand(dto.getBrand());
		product.setDescription(dto.getDescription());
		product.setCategory(dto.getCategory());
		product.setImage(dto.getImage());
		product.setPrice(dto.getPrice());
		product.setQuantityInStock(dto.getQuantityInStock());
		return product;
	}

	public Product update(Product product, ProductDto dto) {
		product.setReference(dto.getReference());
		product.setBrand(dto.getBrand());
		product.setDescription(dto.getDescription());
		product.setCategory(dto.getCategory());
		product.setImage(dto.getImage());
		product.setPrice(dto.getPrice());
		product.setQuantityInStock(dto.getQuantityInStock());
		return product;
	}
}