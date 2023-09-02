package entity;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.io.Serializable;
import java.util.Objects;

public class WishlistProductPK implements Serializable {
    @Column(name = "product_id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int productId;
    @Column(name = "customer_id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int customerId;

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WishlistProductPK that = (WishlistProductPK) o;
        return productId == that.productId && customerId == that.customerId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId, customerId);
    }
}
