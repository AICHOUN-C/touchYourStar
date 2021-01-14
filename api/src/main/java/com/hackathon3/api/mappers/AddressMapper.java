package com.hackathon3.api.mappers;

import com.hackathon3.api.dto.AddressDto;
import com.hackathon3.api.entities.Address;
import org.springframework.stereotype.Component;

@Component
public class AddressMapper {

    public Address create(AddressDto dto) {
        Address address = new Address();
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

    public Address update(Address address, AddressDto dto) {
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
