package com.example.Proojekt_MAS.services;

import com.example.Proojekt_MAS.repositories.ShipmentMethodRepository;
import entity.Shipmentmethod;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ShipmentMethodService {

    private final ShipmentMethodRepository shipmentMethodRepository;

    public List<Shipmentmethod> getAllShipmentMethods(){
        return shipmentMethodRepository.findAll();
    }

    public Shipmentmethod getShipmentMethodByName(String name){
        return shipmentMethodRepository.findByMethod(name);
    }

    public Shipmentmethod getShipmentMethodById(int id){
        return shipmentMethodRepository.findById(id).orElse(null);
    }
}
