package com.hackathon3.api.services;

import java.util.List;
import java.util.Optional;

import com.hackathon3.api.dto.AddressDto;
import com.hackathon3.api.mappers.AddressMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hackathon3.api.entities.Address;
import com.hackathon3.api.repositories.AddressRepository;

@Service
public class AddressService {

	@Autowired
	AddressRepository addressRepository;

	@Autowired
	AddressMapper addressMapper;

	public List<Address> findAllAddress() {
		return addressRepository.findAll();
	}

	public Address findAddressById(Long id) {
		return addressRepository.findById(id).orElse(null);
	}

	public Address create(AddressDto dto) {
	    return addressRepository.save(addressMapper.create(dto));
    }

	public Address update(Long id, AddressDto dto) {
		Address address = addressRepository.findById(id).orElse(null);
		address = addressMapper.update(address, dto);
		return addressRepository.save(address);
	}

	public void delete(Long id) {
        Optional<Address> optionalAddress = addressRepository.findById(id);
        optionalAddress.ifPresent(address -> addressRepository.delete(address));
    }
}
