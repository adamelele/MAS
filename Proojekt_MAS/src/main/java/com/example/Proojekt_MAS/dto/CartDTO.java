package com.example.Proojekt_MAS.dto;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;

@Data
@Builder
@Getter
public class CartDTO {

    private int id;
    private ItemDTO item;
}
