package com.hackathon3.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

	@PostMapping("/create")
	public Product createProduct(@RequestBody ProductDto dto) {
		return productService.createProduct(dto);
	}
	
	@PutMapping("/{id}")
	public Product updateProduct(@PathVariable Long id, @RequestBody ProductDto dto) {
		return productService.update(id, dto);
	}
	
	@DeleteMapping("/{id}")
	public void deleteProduct(@PathVariable Long id) {
		productService.delete(id);
	}
}
