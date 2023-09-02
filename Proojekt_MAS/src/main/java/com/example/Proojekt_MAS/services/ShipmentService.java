package com.example.Proojekt_MAS.services;

import com.example.Proojekt_MAS.repositories.ShipmentRepository;
import entity.Shipment;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ShipmentService {

    private final ShipmentRepository shipmentRepository;

    public List<Shipment> getAllShipments() {
        return shipmentRepository.findAll();
    }

    public Optional<Shipment> getShipmentById(Integer id) {
        return shipmentRepository.findById(id);
    }

    public int save(int shippingDetailsId, int shipmentMethodId) {
        Shipment shipment = new Shipment();
        shipment.setId(shipmentRepository.findAll().stream().mapToInt(Shipment::getId).max().orElse(0)+1);
        shipment.setShipmentmethodId(shipmentMethodId);
        shipment.setShippingdetailsId(shippingDetailsId);
        shipmentRepository.save(shipment);
        return shipment.getId();
    }
}
