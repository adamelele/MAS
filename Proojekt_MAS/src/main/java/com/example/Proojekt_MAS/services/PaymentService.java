package com.example.Proojekt_MAS.services;

import com.example.Proojekt_MAS.dto.ItemDTO;
import com.example.Proojekt_MAS.repositories.ItemRepository;
import com.example.Proojekt_MAS.repositories.PaymentMethodRepository;
import com.example.Proojekt_MAS.repositories.PaymentRepository;
import com.example.Proojekt_MAS.repositories.ProductRepository;
import entity.Item;
import entity.Orders;
import entity.Payment;
import entity.Paymentmethod;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;

@Service
@RequiredArgsConstructor
public class PaymentService {

    private final PaymentRepository paymentRepository;
    private final PaymentMethodRepository paymentMethodRepository;
    private final ItemRepository itemRepository;
    private final OrderService orderService;
    private final ShipmentService shipmentService;
    private final ShipmentMethodService shipmentMethodService;
    private final ProductService productService;


    public List<Payment> getAllPayments(){
        return paymentRepository.findAll();
    }

    public List<Paymentmethod> getAllPaymentMethods(){
        return paymentMethodRepository.findAll();
    }

    public void savePayment(Payment payment){
        paymentRepository.save(payment);
    }

    public void savePayment(Payment payment, List<ItemDTO> items) {
        payment.setAmount(getAmount(payment.getOrdernumber(), items));
        payment.setId(paymentRepository.findAll().stream().mapToInt(Payment::getId).max().orElse(0)+1);
        Orders order = orderService.getOrderByOrderNumber(payment.getOrdernumber());
        payment.setPaymentmethodId(shipmentMethodService.getShipmentMethodById(Objects.requireNonNull(shipmentService
                .getShipmentById(order.getShipmentId()).orElse(null)).getShipmentmethodId()).getId());
        payment.setStatus("Pending");
        paymentRepository.save(payment);

        for (ItemDTO item :items) {
            Item newItem = new Item();
            newItem.setId(item.getId());
            newItem.setOrderNumber(payment.getOrdernumber());
            newItem.setQuantity(item.getQuantity());
            newItem.setProductId(productService.getProductByName(item.getProductName()).getId());
            itemRepository.save(newItem);
        }

    }

    private BigDecimal getAmount(int ordernumber, List<ItemDTO> items){
        double price = items.stream().mapToDouble(item -> item.getPrice().doubleValue()).sum();
        Orders order = orderService.getOrderByOrderNumber(ordernumber);
        price +=shipmentMethodService.getShipmentMethodById(Objects.requireNonNull(shipmentService
                                                    .getShipmentById(order.getShipmentId()).orElse(null)).getShipmentmethodId())
                                                                                                            .getPrice().doubleValue();

        return BigDecimal.valueOf(price);
    }
}
