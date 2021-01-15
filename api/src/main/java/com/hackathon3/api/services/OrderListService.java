package com.hackathon3.api.services;

import java.util.List;
import java.util.Optional;

import com.hackathon3.api.dto.OrderListDto;
import com.hackathon3.api.entities.OrderList;
import com.hackathon3.api.mappers.OrderListMapper;
import com.hackathon3.api.repositories.OrderListRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class OrderListService {
	
	@Autowired
	OrderListRepository orderListRepository;

	@Autowired
	OrderListMapper orderListMapper;
	
	public List<OrderList> findAllOrderLists() {
		return orderListRepository.findAll();
	}
	
	public OrderList findOrderListById(Long id) {
		return orderListRepository.findById(id).orElse(null);
	}

	public OrderList createOrderList(OrderListDto dto) {
		return orderListRepository.save(orderListMapper.create(dto));
	}

	public OrderList update(Long id, OrderListDto dto) {
		OrderList orderList= orderListRepository.findById(id).orElse(null);
		orderList = orderListMapper.update(orderList, dto);
		return orderListRepository.save(orderList);
	}
	
	public void delete (Long id) {
		Optional<OrderList> orderListOptional = orderListRepository.findById(id);
		orderListOptional.ifPresent(orderList -> orderListRepository.delete(orderList));
	}
}
