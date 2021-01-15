package com.hackathon3.api.controllers;

import com.hackathon3.api.dto.OrderListDto;
import com.hackathon3.api.services.OrderListService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hackathon3.api.entities.OrderList;

@CrossOrigin(origins ="*", maxAge=3600)
@RestController
@RequestMapping("/orderlist")
public class OrderListController {
    @Autowired
	OrderListService orderlistService;
	
	@GetMapping
	public List<OrderList> findAllOrderlists() {
		return orderlistService.findAllOrderLists();
	}
	
	@GetMapping("/{id}")
	public OrderList findorderlistById(@PathVariable Long id) {
		return orderlistService.findOrderListById(id);
	}

	@PostMapping("/create")
	public OrderList createOrderlist(@RequestBody OrderListDto dto) {
		return orderlistService.createOrderList(dto);
	}
	
	@PutMapping("/{id}")
	public OrderList updateOrderlist(@PathVariable Long id, @RequestBody OrderListDto dto) {
		return orderlistService.update(id, dto);
	}
	
	@DeleteMapping("/{id}")
	public void deleteorderlist(@PathVariable Long id) {
		orderlistService.delete(id);
	}
}
