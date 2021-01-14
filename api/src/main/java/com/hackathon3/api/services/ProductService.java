package com.hackathon3.api.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hackathon3.api.dto.ProductDto;
import com.hackathon3.api.entities.Product;
import com.hackathon3.api.mappers.ProductMapper;
import com.hackathon3.api.repositories.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	ProductRepository productRepository;

	@Autowired
	ProductMapper productMapper;
	
	public List<Product> findAllProducts() {
		return productRepository.findAll();
	}
	
	public Product findProductById(Long id) {
		return productRepository.findById(id).orElse(null);
	}

	public Product createProduct(ProductDto dto) {
		return productRepository.save(productMapper.create(dto));
	}

	public Product update(Long id, ProductDto dto) {
		Product product = productRepository.findById(id).orElse(null);
		product = productMapper.update(product, dto);
		return productRepository.save(product);
	}
	
	public void delete (Long id) {
		Optional<Product> productOptional = productRepository.findById(id);
		productOptional.ifPresent(product -> productRepository.delete(product));
	}
}
