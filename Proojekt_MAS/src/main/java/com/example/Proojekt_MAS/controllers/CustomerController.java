package com.example.Proojekt_MAS.controllers;

import com.example.Proojekt_MAS.dto.CustomerDTO;
import com.example.Proojekt_MAS.services.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping("/customer")
@Controller
public class CustomerController {

    private final CustomerService customerService;

    @GetMapping("/all")
    public String getAllCustomers(Model model){
        List<CustomerDTO> customers = customerService.getAllCustomers();
        model.addAttribute("customers", customers);
        return "address";
    }
}
