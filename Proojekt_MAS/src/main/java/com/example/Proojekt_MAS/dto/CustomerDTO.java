package com.example.Proojekt_MAS.dto;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;

@Data
@Builder
@Getter
public class CustomerDTO {
    private Integer id;
    private String username;
    private String email;
}
