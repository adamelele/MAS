package com.example.Proojekt_MAS.services;

import com.example.Proojekt_MAS.dto.ItemDTO;
import com.example.Proojekt_MAS.repositories.CategoryRepository;
import com.example.Proojekt_MAS.repositories.ItemRepository;
import com.example.Proojekt_MAS.repositories.ProductRepository;
import entity.Category;
import entity.Item;
import entity.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class ItemService {

    private final ItemRepository itemRepository;
    private final ProductRepository productRepository;
    private final CategoryRepository categoryRepository;

    public List<Item> getAllItems(){
        return itemRepository.findAll();
    }

    public List<ItemDTO> getAllItemsByCartId(Integer cartId){
        return itemRepository.findByCartId(cartId).stream().map(this::mapToItemDTO).collect(Collectors.toList());
    }

    private ItemDTO mapToItemDTO(Item item){
        Product product = productRepository.findById(item.getProductId()).orElseThrow();
        Category category = categoryRepository.findById(product.getCategoryId()).orElseThrow();
        return ItemDTO.builder()
                .id(item.getId())
                .productName(product.getName())
                .productPrice(product.getPrice())
                .category(category.getName())
                .productPhotoUrl("https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.firstbenefits.org%2Fworkers-compensation-wholesale-and-retail-trade%2Fplaceholder%2F&psig=AOvVaw1K6LP8miHBcmjdRAdm5emp&ust=1693561306893000&source=images&cd=vfe&opi=89978449&ved=0CBAQjRxqFwoTCICY0dLNhoEDFQAAAAAdAAAAABAJ")
                .build();
    }
}
