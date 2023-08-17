package entity;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class Wishlist {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "customer_id")
    private int customerId;

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
        Wishlist wishlist = (Wishlist) o;
        return customerId == wishlist.customerId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerId);
    }
}
