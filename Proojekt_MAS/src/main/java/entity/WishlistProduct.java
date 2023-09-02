package entity;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "wishlist_product", schema = "public", catalog = "postgres")
@IdClass(WishlistProductPK.class)
public class WishlistProduct {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "product_id")
    private int productId;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "customer_id")
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
        WishlistProduct that = (WishlistProduct) o;
        return productId == that.productId && customerId == that.customerId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId, customerId);
    }
}
