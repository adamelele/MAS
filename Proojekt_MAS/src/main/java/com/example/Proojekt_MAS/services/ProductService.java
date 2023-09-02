package com.example.Proojekt_MAS.services;

import com.example.Proojekt_MAS.repositories.ProductRepository;
import entity.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    public Optional<Product> getProductById(Integer productId){
        return productRepository.findById(productId);
    }

    public Product getProductByName(String productName) {
        return productRepository.findByName(productName);
    }
}
