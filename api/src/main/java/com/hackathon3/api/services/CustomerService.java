package com.hackathon3.api.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hackathon3.api.dto.CustomerDto;
import com.hackathon3.api.entities.Customer;
import com.hackathon3.api.mappers.CustomerMapper;
import com.hackathon3.api.repositories.CustomerRepository;



@Service
public class CustomerService {

	
	@Autowired
	CustomerRepository customerRepository;
	
	@Autowired
	CustomerMapper customerMapper;
	
    public Customer createCustomer(CustomerDto dto){
        return customerRepository.save(customerMapper.createCustomer(dto));
    }
	
	public List<Customer> findAllCustomer(){
		return customerRepository.findAll();
	}
	
	public Customer findCustomerById(Long id) {
		return customerRepository.findById(id).orElse(null);
	}
	
	public Customer update (Long id, CustomerDto dto) {
		Customer customer = customerRepository.findById(id).orElse(null);
		customer = customerMapper.updateCustomer(customer, dto);
		return customerRepository.save(customer);
	}
	
    public void delete(Long id){
        Optional<Customer> customerOptional = customerRepository.findById(id);
        customerOptional.ifPresent(customer -> customerRepository.delete(customer));
    }
}
