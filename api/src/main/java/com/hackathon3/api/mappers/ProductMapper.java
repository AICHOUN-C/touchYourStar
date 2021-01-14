package com.hackathon3.api.mappers;

import org.springframework.stereotype.Component;

import com.hackathon3.api.dto.ProductDto;
import com.hackathon3.api.entities.Product;

@Component
public class ProductMapper {
	public Product update (Product product, ProductDto dto) {
		product.setCategory(dto.getCategory());
		product.setPrice(dto.getPrice());
		product.setQuantity(dto.getQuantity());
		product.setName(dto.getName());
		product.setDescription(dto.getDescription());
		product.setReference(dto.getReference());
		return product;
	}
}
