package com.example.Proojekt_MAS.mvcController;

import com.example.Proojekt_MAS.dto.ItemDTO;
import com.example.Proojekt_MAS.services.ItemService;
import com.example.Proojekt_MAS.services.PaymentService;
import com.example.Proojekt_MAS.services.ShipmentMethodService;
import entity.Paymentmethod;
import entity.Shipmentmethod;
import entity.Shippingdetails;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.math.BigDecimal;
import java.util.List;

@Controller
@RequiredArgsConstructor
public class ViewController {

    private final ItemService itemService;
    private final ShipmentMethodService shipmentMethodService;
    private final PaymentService paymentService;

    @GetMapping("/")
    public String getMainPage(Model model) {
        int quantity = itemService.getAllItemsByCartId(1).stream()
                .mapToInt(ItemDTO::getQuantity)
                .sum();
        model.addAttribute("quantity", quantity);
        return "index";
    }

    @GetMapping("/cart")
    public String getCartPage(Model model) {
        List<ItemDTO> items = itemService.getAllItemsByCartId(1);
        int quantity = itemService.getAllItemsByCartId(1).stream()
                .mapToInt(ItemDTO::getQuantity)
                .sum();
        BigDecimal totalPrice = BigDecimal.valueOf(items.stream()
                .mapToDouble(itemDTO -> itemDTO.getPrice().doubleValue()).sum());
        model.addAttribute("quantity", quantity);
        model.addAttribute("items", items);
        model.addAttribute("totalPrice", totalPrice);
        return "cart";
    }
    @GetMapping("/address")
    public String getAddressForm(Model model){
        Shippingdetails shippingDetails = new Shippingdetails();

        model.addAttribute("shippingDetails", shippingDetails);
        return "address";
    }

    @GetMapping("/shipment")
    public String getShipmentForm(Model model){
        Shipmentmethod shipmentmethod = new Shipmentmethod();
        model.addAttribute("shipments",shipmentMethodService.getAllShipmentMethods());
        model.addAttribute("shipmentMethod", shipmentmethod);
        return "shipment";
    }

    @GetMapping("/payment")
    public String getPaymentForm(Model model){
        Paymentmethod paymentmethod = new Paymentmethod();
        model.addAttribute("payments", paymentService.getAllPaymentMethods());
        model.addAttribute("paymentM", paymentmethod);
        return "payment";
    }

    @GetMapping("/result")
    public String getResultPage(){
        return "result";
    }

    @GetMapping("payment/failed")
    public String getFailedPage(){
        return "fail";
    }
}
