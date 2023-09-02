package com.example.Proojekt_MAS.controllers;

import com.example.Proojekt_MAS.dto.ItemDTO;
import com.example.Proojekt_MAS.services.CartService;
import com.example.Proojekt_MAS.services.ItemService;
import entity.Cart;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class CartController {


    private final CartService cartService;
    private final ItemService itemService;

    @GetMapping("/carts")
    public Model getCart(Model model){
        Cart cart = cartService.getCartById(1).orElse(new Cart());
        System.out.println(cart.getCustomerId());
        List<ItemDTO> items = itemService.getAllItemsByCartId(1);
        model.addAttribute("items", items);
        return model;
    }
}
