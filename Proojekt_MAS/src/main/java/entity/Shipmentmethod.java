package entity;

import jakarta.persistence.*;
import lombok.Getter;

import java.math.BigDecimal;
import java.util.Objects;

@Getter
@Entity
public class Shipmentmethod {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @jakarta.persistence.Column(name = "id")
    private int id;

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "method")
    private String method;

    public void setMethod(String method) {
        this.method = method;
    }

    @Basic
    @Column(name = "price")
    private BigDecimal price;

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Basic
    @Column(name = "etimatedtime")
    private int etimatedtime;

    public void setEtimatedtime(int etimatedtime) {
        this.etimatedtime = etimatedtime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shipmentmethod that = (Shipmentmethod) o;
        return id == that.id && etimatedtime == that.etimatedtime && Objects.equals(method, that.method) && Objects.equals(price, that.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, method, price, etimatedtime);
    }
}
