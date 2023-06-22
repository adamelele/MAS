import java.util.ArrayList;
import java.util.List;

public class Order {
    private static int nextOrderNumber = 0;
    private List<Product> products = new ArrayList<>();
    private Client client;
    private int orderNumber;
    private Employee employee;

    public int getOrderNumber() {
        return orderNumber;
    }

    private Order(Client client){
        this.client = client;
        this.orderNumber = nextOrderNumber;
        nextOrderNumber++;
    }


    public static Order createOrder(Client client) throws Exception {
        if(client == null){
            throw new Exception("Given client does not exist");
        }

        Order order = new Order(client);

        client.addOrder(order);

        return order;
    }

    public void addProduct(Product product){
        products.add(product);
    }

    public void setEmployee(Employee employee){
        this.employee = employee;
        this.employee.addOrder(this);
    }

    public void deleteProduct(Product product){
        products.remove(product);
    }

}
