package com.hackathon3.api.mappers;

import com.hackathon3.api.dto.ProductListDto;
import com.hackathon3.api.entities.ProductList;
import org.springframework.stereotype.Component;

@Component
public class ProductListMapper {

    public ProductList create(ProductListDto dto) {
        ProductList list = new ProductList();
        list.setOrder(dto.getOrder());
        list.setProduct(dto.getProduct());
        list.setQuantity(dto.getQuantity());
        return list;
    }

    public ProductList update(ProductList list, ProductListDto dto) {
        list.setOrder(dto.getOrder());
        list.setProduct(dto.getProduct());
        list.setQuantity(dto.getQuantity());
        return list;
    }
}
