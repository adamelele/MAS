package entity;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import java.util.Objects;

@Entity
public class Item {
    @Basic
    @Column(name = "quantity")
    private int quantity;
    @Basic
    @Column(name = "product_id")
    private int productId;
    @Basic
    @Column(name = "cart_customer_id")
    private int cartCustomerId;
    @Basic
    @Column(name = "order_ordernumber")
    private Integer orderOrdernumber;

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getCartCustomerId() {
        return cartCustomerId;
    }

    public void setCartCustomerId(int cartCustomerId) {
        this.cartCustomerId = cartCustomerId;
    }

    public Integer getOrderOrdernumber() {
        return orderOrdernumber;
    }

    public void setOrderOrdernumber(Integer orderOrdernumber) {
        this.orderOrdernumber = orderOrdernumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return quantity == item.quantity && productId == item.productId && cartCustomerId == item.cartCustomerId && Objects.equals(orderOrdernumber, item.orderOrdernumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(quantity, productId, cartCustomerId, orderOrdernumber);
    }
}
