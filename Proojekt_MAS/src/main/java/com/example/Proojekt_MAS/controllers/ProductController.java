package com.example.Proojekt_MAS.controllers;

import com.example.Proojekt_MAS.services.ProductService;
import entity.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/product")
@RestController
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable Integer id) {
        return productService.getProductById(id).orElse(null);
    }

    @GetMapping("/error")
    public String error(){
        return "An error occured";
    }
}
