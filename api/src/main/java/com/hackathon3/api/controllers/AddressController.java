package com.hackathon3.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hackathon3.api.dto.UpdateAddressDto;
import com.hackathon3.api.entities.Address;
import com.hackathon3.api.services.AddressService;

@CrossOrigin(origins ="*", maxAge=3600)
@RestController
@RequestMapping("/addresses")
public class AddressController {
	
	@Autowired
	AddressService addressService;
	
	@GetMapping
	public List<Address> findAllAddresses() {
		return addressService.findAllAddress();
	}
	
	@GetMapping("/{id}")
	public Address findAddressById(@PathVariable Long id) {
		return addressService.findAddressById(id);
	}
	
	@PutMapping("/{id")
	public Address updateAddress(@PathVariable Long id, @RequestBody UpdateAddressDto dto) {
		return addressService.update(id, dto);
	}
	

}
