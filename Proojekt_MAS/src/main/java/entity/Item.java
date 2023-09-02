package entity;

import jakarta.persistence.*;
import lombok.Getter;

import java.util.Objects;

@Getter
@Entity
public class Item {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @jakarta.persistence.Column(name = "id")
    private int id;

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "quantity")
    private int quantity;

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Basic
    @Column(name = "product_id")
    private int productId;

    public void setProductId(int productId) {
        this.productId = productId;
    }

    @Basic
    @Column(name = "cart_id")
    private Integer cartId;

    public void setCartId(Integer cartId) {
        this.cartId = cartId;
    }

    @Basic
    @Column(name = "order_number")
    private Integer orderNumber;

    public void setOrderNumber(Integer orderNumber) {
        this.orderNumber = orderNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return id == item.id && quantity == item.quantity && productId == item.productId && Objects.equals(cartId, item.cartId) && Objects.equals(orderNumber, item.orderNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, quantity, productId, cartId, orderNumber);
    }
}
