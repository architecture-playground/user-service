package com.playground.user.converter;

import com.playground.user.dto.AddressCreationRequestDTO;
import com.playground.user.dto.AddressDTO;
import com.playground.user.model.Address;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class AddressConverter {

    public AddressDTO toDto(Address addressSource) {
        AddressDTO dtoTarget = new AddressDTO();
        BeanUtils.copyProperties(addressSource, dtoTarget);
        return dtoTarget;
    }

    public Address toEntity(AddressCreationRequestDTO requestSource) {
        Address entityTarget = new Address();
        BeanUtils.copyProperties(requestSource, entityTarget);
        return entityTarget;
    }
}
