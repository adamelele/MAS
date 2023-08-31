package com.example.Proojekt_MAS.controllers;

import com.example.Proojekt_MAS.services.ShipmentService;
import entity.Shipment;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/shipment")
@RestController
@RequiredArgsConstructor
public class ShipmentController {

    private final ShipmentService shipmentService;

    @GetMapping("/all")
    public List<Shipment> getAllShipments(){
        return shipmentService.getAllShipments();
    }

    @GetMapping("/{id}")
    public Shipment getShipmentById(@PathVariable Integer id){
        return shipmentService.getShipmentById(id).orElse(null);
    }

    @GetMapping("/error")
    public String error(){
        return "An error occured";
    }
}
