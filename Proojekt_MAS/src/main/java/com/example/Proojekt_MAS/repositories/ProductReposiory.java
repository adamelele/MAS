package com.example.Proojekt_MAS.repositories;

import entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductReposiory extends JpaRepository<Product, Long> {

}
