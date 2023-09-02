package com.example.Proojekt_MAS.dto;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class ItemDTO {
    private int id;
    private String productName;
    private BigDecimal productPrice;
    private String productPhotoUrl;
    private String category;
    private int quantity;
    private BigDecimal price;

}
