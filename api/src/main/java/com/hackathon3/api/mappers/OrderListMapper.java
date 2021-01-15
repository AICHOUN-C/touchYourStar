package com.hackathon3.api.mappers;

import com.hackathon3.api.dto.OrderListDto;
import com.hackathon3.api.entities.OrderList;

import org.springframework.stereotype.Component;

@Component
public class OrderListMapper {
	public OrderList create(OrderListDto dto) {
		OrderList orderList = new OrderList();
		orderList.setReference(dto.getReference());
		orderList.setBrand(dto.getBrand());
		orderList.setDescription(dto.getDescription());
		orderList.setCategory(dto.getCategory());
		orderList.setImage(dto.getImage());
		orderList.setPrice(dto.getPrice());
		orderList.setQuantityInStock(dto.getQuantityInStock());
		return orderList;
	}

	public OrderList update(OrderList orderList, OrderListDto dto) {
		orderList.setReference(dto.getReference());
		orderList.setBrand(dto.getBrand());
		orderList.setDescription(dto.getDescription());
		orderList.setCategory(dto.getCategory());
		orderList.setImage(dto.getImage());
		orderList.setPrice(dto.getPrice());
		orderList.setQuantityInStock(dto.getQuantityInStock());
		return orderList;
	}
}