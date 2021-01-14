package com.hackathon3.api.mappers;

import com.hackathon3.api.dto.CreateOrderDto;
import com.hackathon3.api.dto.UpdateOrderDto;
import com.hackathon3.api.entities.Order;
import org.springframework.stereotype.Component;

@Component
public class OrderMapper {

    public Order mapDtoToEntity (CreateOrderDto dto) {
        Order order = new Order();
        order.setDate(dto.getDate());
        order.setCustomer(dto.getCustomer());
        order.setBillingAddress(dto.getBillingAddress());
        order.setDeliveryAddress(dto.getDeliveryAddress());
        order.setStatus(dto.getStatus());
        order.setOrderProducts(dto.getOrderProducts());
        return order;
    }

    public Order update(Order order, UpdateOrderDto dto) {
        order.setDate(dto.getDate());
        order.setDeliveryAddress(dto.getDeliveryAddress());
        order.setBillingAddress(dto.getBillingAddress());
        order.setStatus(dto.getStatus());
        order.setOrderProducts(dto.getOrderProducts());
        return order;
    }
}
