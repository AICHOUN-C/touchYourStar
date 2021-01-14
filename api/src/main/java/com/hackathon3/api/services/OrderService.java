package com.hackathon3.api.services;

import com.hackathon3.api.dto.OrderDto;
import com.hackathon3.api.entities.Order;
import com.hackathon3.api.mappers.OrderMapper;
import com.hackathon3.api.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    OrderRepository orderRepository;

    @Autowired
    OrderMapper orderMapper;

    public Order findOrderById(Long id) {
        return orderRepository.findById(id).orElse(null);
    }

    public List<Order> findAllOrders() {
        return orderRepository.findAll();
    }

    public Order create(OrderDto dto) {
        return orderRepository.save(orderMapper.create(dto));
    }

    public Order update(Long id, OrderDto dto) {
        Order order = orderRepository.findById(id).orElse(null);
        order = orderMapper.update(order, dto);
        return orderRepository.save(order);
    }

    public void delete(Long id) {
        Optional<Order> orderOptional = orderRepository.findById(id);
        orderOptional.ifPresent(order -> orderRepository.delete(order));
    }
}
