package com.hackathon3.api.controllers;

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

import com.hackathon3.api.dto.CustomerDto;
import com.hackathon3.api.entities.Customer;
import com.hackathon3.api.services.CustomerService;

@CrossOrigin(origins ="*", maxAge=3600)
@RestController
@RequestMapping("/customers")
public class CustomerController {

	
	@Autowired
	CustomerService customerService;
	
	
    @PostMapping
    public Customer create(@RequestBody CustomerDto dto) {
        return customerService.createCustomer(dto);
    }
	
    @GetMapping
    public List<Customer> findAllCustomer() {
        return customerService.findAllCustomer();
    }

    @GetMapping("/{id}")
    public Customer findCustomerById(@PathVariable Long id) {
        return customerService.findCustomerById(id);
    }


    @PutMapping("/{id}")
    public Customer update(@PathVariable Long id, @RequestBody CustomerDto dto) {
        return customerService.update(id, dto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
    	customerService.delete(id);
    }
}
