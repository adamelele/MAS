package com.example.Proojekt_MAS.services;

import com.example.Proojekt_MAS.dto.CustomerDTO;
import com.example.Proojekt_MAS.repositories.CustomerRepository;
import entity.Customer;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class CustomerService {

    private final CustomerRepository customerRepository;

    public List<CustomerDTO> getAllCustomers(){
        List<Customer> list = customerRepository.findAll();
        return list.stream().map(this::mapToCustomerDTO).collect(Collectors.toList());
    }

    private CustomerDTO mapToCustomerDTO(Customer customer){
        return CustomerDTO.builder()
                .id(customer.getId())
                .email(customer.getEmail())
                .username(customer.getUsername())
                .build();
    }
}
