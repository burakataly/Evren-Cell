package com.i2i.aom.mapper;

import com.i2i.aom.dto.CustomerDto;
import com.i2i.aom.model.Customer;
import org.springframework.stereotype.Component;

@Component
public class CustomerMapper {

    public CustomerDto customerToCustomerDto(Customer customer){
        return CustomerDto.builder()
                .customerId(customer.getCustomerId())
                .name(customer.getName())
                .surname(customer.getSurname())
                .email(customer.getEmail())
                .msisdn(customer.getMsisdn())
                .sDate(customer.getsDate())
                .TCNumber(customer.getTCNumber())
                .build();
    }
}
