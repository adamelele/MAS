package entity;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.Objects;

@Entity
@Table(name = "wishlist_product", schema = "public", catalog = "postgres")
public class WishlistProduct {
    @Basic
    @Column(name = "product_id")
    private int productId;
    @Basic
    @Column(name = "wishlist_customer_id")
    private int wishlistCustomerId;

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getWishlistCustomerId() {
        return wishlistCustomerId;
    }

    public void setWishlistCustomerId(int wishlistCustomerId) {
        this.wishlistCustomerId = wishlistCustomerId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WishlistProduct that = (WishlistProduct) o;
        return productId == that.productId && wishlistCustomerId == that.wishlistCustomerId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId, wishlistCustomerId);
    }
}
