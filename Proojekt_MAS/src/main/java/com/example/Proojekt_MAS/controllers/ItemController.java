package com.example.Proojekt_MAS.controllers;

import com.example.Proojekt_MAS.dto.ItemDTO;
import com.example.Proojekt_MAS.services.ItemService;
import entity.Item;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/item")
@RestController
@RequiredArgsConstructor
public class ItemController {

    private final ItemService itemService;

    @GetMapping("/all")
    public List<Item> getAllItems(){
        return itemService.getAllItems();
    }

    @GetMapping("/{cartId}")
    public List<ItemDTO> getAllItemsByCartId(@PathVariable Integer cartId){
        return itemService.getAllItemsByCartId(cartId);
    }
}
