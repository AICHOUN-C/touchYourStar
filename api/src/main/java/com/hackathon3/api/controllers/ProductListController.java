package com.hackathon3.api.controllers;

import com.hackathon3.api.dto.ProductListDto;
import com.hackathon3.api.entities.ProductList;
import com.hackathon3.api.services.ProductListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/cart")
public class ProductListController {

    @Autowired
    ProductListService productListService;

    @GetMapping
    public List<ProductList> findList() {
        return productListService.findAllLists();
    }

    @PutMapping("/{id}")
    public ProductList updateList(@PathVariable Long id, @RequestBody ProductListDto dto) {
        return productListService.update(id, dto);
    }

    @DeleteMapping("/{id}")
    public void deleteList(@PathVariable Long id) {
        productListService.delete(id);
    }
}
