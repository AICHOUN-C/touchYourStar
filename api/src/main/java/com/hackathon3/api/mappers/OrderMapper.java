package com.hackathon3.api.mappers;

import com.hackathon3.api.dto.OrderDto;
import com.hackathon3.api.entities.Order;
import org.springframework.stereotype.Component;

@Component
public class OrderMapper {

    public Order create(OrderDto dto) {
        Order order = new Order();
        order.setCustomer(dto.getCustomer());
        order.setStatus(dto.getStatus());
        order.setPaid(dto.isPaid());
        order.setList(dto.getList());
        return order;
    }

    public Order update(Order order, OrderDto dto) {
        order.setCustomer(dto.getCustomer());
        order.setStatus(dto.getStatus());
        order.setPaid(dto.isPaid());
        order.setList(dto.getList());
        return order;
    }
}
