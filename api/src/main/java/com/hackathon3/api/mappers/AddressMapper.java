package com.hackathon3.api.mappers;

import org.springframework.stereotype.Component;

import com.hackathon3.api.dto.UpdateAddressDto;
import com.hackathon3.api.entities.Address;

@Component
public class AddressMapper {
	
	public Address update (Address address, UpdateAddressDto dto) {
		address.setRecipient(dto.getRecipient());
		address.setNumber(dto.getNumber());
		address.setStreet(dto.getStreet());
		address.setStreetAdd(dto.getStreetAdd());
		address.setZipCode(dto.getZipCode());
		address.setCity(dto.getCity());
		address.setState(dto.getState());
		address.setDigitalCode(dto.getDigitalCode());
		address.setInfoAdded(dto.getInfoAdded());
		return address;
	}

}
