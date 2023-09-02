package com.example.Proojekt_MAS.repositories;

import entity.Paymentmethod;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentMethodRepository extends JpaRepository<Paymentmethod, Integer> {
}
