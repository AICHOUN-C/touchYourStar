package com.hackathon3.api.mappers;

import org.springframework.stereotype.Component;

import com.hackathon3.api.dto.CustomerDto;
import com.hackathon3.api.entities.Customer;

@Component
public class CustomerMapper {

	public Customer createCustomer(CustomerDto dto) {
		Customer customer = new Customer();
		customer.setFirstname(dto.getFirstname());
		customer.setLastname(dto.getLastname());
		customer.setEmail(dto.getEmail());
		customer.setPhoneNumber(dto.getPhoneNumber());
		customer.setBirthdate(dto.getBirthdate());
		return customer;
	}
	
	public Customer updateCustomer(Customer customer, CustomerDto dto) {
		customer.setFirstname(dto.getFirstname());
		customer.setLastname(dto.getLastname());
		customer.setEmail(dto.getEmail());
		customer.setPhoneNumber(dto.getPhoneNumber());;
		customer.setBirthdate(dto.getBirthdate());
		return customer;
	}
}
