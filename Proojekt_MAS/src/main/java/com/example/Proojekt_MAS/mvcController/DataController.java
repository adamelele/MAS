package com.example.Proojekt_MAS.mvcController;

import com.example.Proojekt_MAS.dto.ItemDTO;
import com.example.Proojekt_MAS.services.*;
import entity.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class DataController {

    private final ShippingDetailsService shippingDetailsService;
    private final ShipmentService shipmentService;
    private final OrderService orderService;
    private final PaymentService paymentService;
    private final ItemService itemService;

    private Shippingdetails shippingdetails;
    private Shipment shipment;
    private Payment payment;


    @PostMapping("/address")
    public String saveAddress(@ModelAttribute("shippingDetails")Shippingdetails shippingDetails){
        shippingDetails.setCustomerId(1);
        this.shippingdetails = shippingDetails;
        return "redirect:/shipment";
    }

    @PostMapping("/shipment")
    public String saveShipmentMethod(@ModelAttribute("shipmentMethod")Shipmentmethod shipmentMethod){
        shipment = new Shipment();
        shipment.setShipmentmethodId(shipmentMethod.getId());
        return"redirect:/payment";
    }

    @PostMapping("/payment")
    public String saveOrder(@ModelAttribute("paymentM") Paymentmethod paymentMethod){
        int shippingDetailsId = shippingDetailsService.save(shippingdetails);
        shipment.setShippingdetailsId(shippingDetailsId);
        int shipmentId = shipmentService.save(shipment);
        Orders order = new Orders();
        order.setCustomerId(1);
        order.setShipmentId(shipmentId);
        int ordernumber = orderService.saveOrder(order);
        List<ItemDTO> items = itemService.getAllItemsByCartId(1);
        payment = new Payment();
        payment.setOrdernumber(ordernumber);
        paymentService.savePayment(payment, items);
        return "redirect:/result";
    }

    @GetMapping("/payment/success")
    public String updatePaymentToCompleted(){
        payment.setStatus("Completed");
        return "finish";
    }


}
