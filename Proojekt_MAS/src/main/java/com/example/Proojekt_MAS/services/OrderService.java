package com.example.Proojekt_MAS.services;

import com.example.Proojekt_MAS.repositories.OrderRepository;
import entity.Orders;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final OrderRepository orderRepository;

    public Orders getOrderByOrderNumber(int orderNumber){
        return orderRepository.findByOrdernumber(orderNumber);
    }

    public int saveOrder(Orders order){
        order.setOrdernumber(orderRepository.findAll().stream().mapToInt(Orders::getOrdernumber).max().orElse(0)+1);
        System.out.println(order);
        orderRepository.save(order);
        return order.getOrdernumber();
    }
}
