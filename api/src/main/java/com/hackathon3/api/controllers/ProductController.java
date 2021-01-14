package com.hackathon3.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hackathon3.api.dto.ProductDto;
import com.hackathon3.api.entities.Product;
import com.hackathon3.api.services.ProductService;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/products")
public class ProductController {

	@Autowired
	ProductService productService;
	
	@GetMapping
	public List<Product> findAllProducts() {
		return productService.findAllProducts();
	}
	
	@GetMapping("/{id}")
	public Product findProductById(@PathVariable Long id) {
		return productService.findProductById(id);
	}
	
	@PutMapping("/{id}")
	public Product updateProduct(@PathVariable Long id, @RequestBody ProductDto dto) {
		return productService.update(id, dto);
	}
	
	@DeleteMapping("/{id}")
	public void productDelete(@PathVariable Long id) {
		productService.delete(id);
	}
}
