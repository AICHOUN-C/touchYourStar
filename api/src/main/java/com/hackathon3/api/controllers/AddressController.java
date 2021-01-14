package com.hackathon3.api.controllers;

import java.util.List;

import com.hackathon3.api.dto.AddressDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
	
	@PutMapping("/{id}")
	public Address updateAddress(@PathVariable Long id, @RequestBody AddressDto dto) {
		return addressService.update(id, dto);
	}

	@DeleteMapping("/{id}")
    public void deleteAddress(@PathVariable Long id) {
        addressService.delete(id);
    }
}
