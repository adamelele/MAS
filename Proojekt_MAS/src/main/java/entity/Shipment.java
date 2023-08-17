package entity;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class Shipment {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "method")
    private String method;
    @Basic
    @Column(name = "price")
    private Object price;
    @Basic
    @Column(name = "etimatedtime")
    private int etimatedtime;
    @Basic
    @Column(name = "shippingdetails_id")
    private int shippingdetailsId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public Object getPrice() {
        return price;
    }

    public void setPrice(Object price) {
        this.price = price;
    }

    public int getEtimatedtime() {
        return etimatedtime;
    }

    public void setEtimatedtime(int etimatedtime) {
        this.etimatedtime = etimatedtime;
    }

    public int getShippingdetailsId() {
        return shippingdetailsId;
    }

    public void setShippingdetailsId(int shippingdetailsId) {
        this.shippingdetailsId = shippingdetailsId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shipment shipment = (Shipment) o;
        return id == shipment.id && etimatedtime == shipment.etimatedtime && shippingdetailsId == shipment.shippingdetailsId && Objects.equals(method, shipment.method) && Objects.equals(price, shipment.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, method, price, etimatedtime, shippingdetailsId);
    }
}
