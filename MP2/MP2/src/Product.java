public class Product {

    private Order order;
    private String name;
    private double price;
    private int amount;
    private double sum;

    public Product(Order order, String name, double price, int amount) {
        this.order = order;
        this.name = name;
        this.price = price;
        this.amount = amount;
        this.sum = countSum();
        order.addProduct(this);
    }

    public Product(String name, double price, int amount) {
        this.name = name;
        this.price = price;
        this.amount = amount;
        this.sum = countSum();
    }

    private double countSum(){
        return price * amount;
    }
}
