package com.example.Proojekt_MAS.repositories;

import entity.Shipmentmethod;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShipmentMethodRepository extends JpaRepository<Shipmentmethod, Integer> {

    Shipmentmethod findByMethod(String method);
}
