package com.example.Proojekt_MAS.repositories;

import entity.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Orders, Integer> {

    Orders findByOrdernumber(int orderNumber);
}
