package com.example.Proojekt_MAS.services;

import com.example.Proojekt_MAS.repositories.CartRepository;
import entity.Cart;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CartService {

    private final CartRepository cartRepository;

    public Optional<Cart> getCartById(int id){
        return cartRepository.findById(id);
    }

}
