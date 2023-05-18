package Overlapping;

import java.util.HashMap;
import java.util.Map;

public class Order {

    private int OrderId;
    private Map<String,Integer> products = new HashMap<>();

    public Order(int orderId) {
        OrderId = orderId;
    }

    public int getOrderId() {
        return OrderId;
    }

    public Map<String, Integer> getProducts() {
        return products;
    }


}
