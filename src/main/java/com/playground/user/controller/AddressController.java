package com.playground.user.controller;


import com.playground.user.dto.AddressCreationRequestDTO;
import com.playground.user.dto.AddressDTO;
import com.playground.user.service.AddressService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.atteo.evo.inflector.English;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@Slf4j
@RequiredArgsConstructor
@RestController("v1/address")
public class AddressController {

    private final AddressService addressService;

    @GetMapping("/all")
    public List<AddressDTO> getAll() {
        log.info("Request all addresses.");
        return addressService.getAll();
    }

    @GetMapping("/{address_id}")
    public AddressDTO getById(@PathVariable("address_id") UUID id) {
        log.info("Request address by id {}.", id);
        return addressService.getById(id);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public AddressDTO create(@RequestBody AddressCreationRequestDTO request) {
        log.info("Request to create new address {}.", request);
        return addressService.create(request);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/random")
    public List<AddressDTO> createRandom(@RequestParam Integer quantity) {
        log.info("Request to generate {} random {}.", quantity, English.plural("address"));
        return addressService.createRandom(quantity);
    }
}
