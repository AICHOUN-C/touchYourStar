package com.hackathon3.api.mappers;

import com.hackathon3.api.dto.CustomerDto;
import com.hackathon3.api.entities.Customer;
import org.springframework.stereotype.Component;

@Component
public class CustomerMapper {

    public Customer create(CustomerDto dto) {
        Customer customer = new Customer();
        customer.setFirstname(dto.getFirstname());
        customer.setLastname(dto.getLastname());
        customer.setEmail(dto.getEmail());
        customer.setPhoneNumber(dto.getPhoneNumber());
        customer.setBirthdate(dto.getBirthdate());
        customer.setUser(dto.getUser());
        return customer;
    }

    public Customer update(Customer customer, CustomerDto dto) {
        customer.setFirstname(dto.getFirstname());
        customer.setLastname(dto.getLastname());
        customer.setEmail(dto.getEmail());
        customer.setPhoneNumber(dto.getPhoneNumber());
        customer.setBirthdate(dto.getBirthdate());
        customer.setUser(dto.getUser());
        return customer;
    }
}
