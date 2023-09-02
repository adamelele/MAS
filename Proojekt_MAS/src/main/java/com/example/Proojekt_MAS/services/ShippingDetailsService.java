package com.example.Proojekt_MAS.services;

import com.example.Proojekt_MAS.repositories.ShippingDetailsRepository;
import entity.Shippingdetails;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ShippingDetailsService {

    private final ShippingDetailsRepository shippingDetailsRepository;


    public int save(Shippingdetails shippingDetails) {
        shippingDetails.setId(shippingDetailsRepository.findAll().
                stream().mapToInt(Shippingdetails::getId).max().orElse(1)+1);
        shippingDetailsRepository.save(shippingDetails);
        return shippingDetails.getId();
    }


}
