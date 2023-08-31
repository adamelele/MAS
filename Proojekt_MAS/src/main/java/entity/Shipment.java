package entity;

import jakarta.persistence.*;

import java.math.BigDecimal;

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

    public void setPrice(BigDecimal price) {
        this.price = price;
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

        if (id != shipment.id) return false;
        if (etimatedtime != shipment.etimatedtime) return false;
        if (shippingdetailsId != shipment.shippingdetailsId) return false;
        if (method != null ? !method.equals(shipment.method) : shipment.method != null) return false;
        if (price != null ? !price.equals(shipment.price) : shipment.price != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (method != null ? method.hashCode() : 0);
        result = 31 * result + (price != null ? price.hashCode() : 0);
        result = 31 * result + etimatedtime;
        result = 31 * result + shippingdetailsId;
        return result;
    }
}
