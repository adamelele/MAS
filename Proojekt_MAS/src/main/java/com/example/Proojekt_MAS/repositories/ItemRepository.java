package com.example.Proojekt_MAS.repositories;

import entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItemRepository extends JpaRepository<Item, Integer> {

    List<Item> findByCartId(Integer cartId);
    List<Item> findByOrderNumber(Integer orderNumber);

}
