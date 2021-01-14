/*package com.hackathon3.api.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hackathon3.api.dto.UpdateAddressDto;
import com.hackathon3.api.entities.Address;
import com.hackathon3.api.mappers.AddressMapper;
import com.hackathon3.api.repositories.AddressRepository;

@Service
public class AddressService {
	
	@Autowired
	private AddressRepository addressRepository;
	
	@Autowired
	private AddressMapper addressMapper;
	
	public List<Address> findAllAddress() {
		return addressRepository.findAll();
	}
	
	public Address findAddressById(Long id) {
		return addressRepository.findById(id).orElse(null);
	}
	
	public Address update (Long id, UpdateAddressDto dto) {
		Address address = addressRepository.findById(id).orElse(null);
		address = addressMapper.update(address, dto);
		return addressRepository.save(address);
	}
}*/
