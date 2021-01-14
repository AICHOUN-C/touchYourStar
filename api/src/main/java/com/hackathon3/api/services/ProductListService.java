package com.hackathon3.api.services;

import com.hackathon3.api.dto.ProductListDto;
import com.hackathon3.api.entities.Product;
import com.hackathon3.api.entities.ProductList;
import com.hackathon3.api.mappers.ProductListMapper;
import com.hackathon3.api.repositories.ProductListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductListService {

    @Autowired
    ProductListRepository productListRepository;

    @Autowired
    ProductListMapper productListMapper;

    public List<ProductList> findAllLists() {
        return productListRepository.findAll();
    }

    public ProductList findList(Long id) {
        return productListRepository.findById(id).orElse(null);
    }

    public ProductList create(ProductListDto dto) {
        return productListRepository.save(productListMapper.create(dto));
    }

    public ProductList update(Long id, ProductListDto dto) {
        ProductList listToUpdate = productListRepository.findById(id).orElse(null);
        listToUpdate = productListMapper.update(listToUpdate, dto);
        return productListRepository.save(listToUpdate);
    }

    public void delete(Long id) {
        Optional<ProductList> optionalProductList = productListRepository.findById(id);
        optionalProductList.ifPresent(list -> productListRepository.delete(list));
    }
}
