import java.util.ArrayList;
import java.util.List;

public class Client {

    private static int nextId = 0;
    private int id;
    private String name;
    private List<Order> orders = new ArrayList<>();

    public Client(String name){
        this.id = nextId;
        this.name = name;
        nextId++;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void addOrder(Order order) {
        if (!orders.contains(order)) {
            orders.add(order);
        }
    }

    public boolean deleteClient(){
        for (Order order:orders) {
         deleteOrder(order);
        }
        return true;

    }

    public void deleteOrder(Order order){
        orders.remove(order);
    }
}
