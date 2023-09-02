package entity;

import jakarta.persistence.*;
import lombok.Getter;

import java.util.Objects;

@Getter
@Entity
public class Shipment {
    @Id
    @jakarta.persistence.Column(name = "id")
    private int id;

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "shipmentmethod_id")
    private int shipmentmethodId;

    public void setShipmentmethodId(int shipmentmethodId) {
        this.shipmentmethodId = shipmentmethodId;
    }

    @Basic
    @Column(name = "shippingdetails_id")
    private int shippingdetailsId;

    public void setShippingdetailsId(int shippingdetailsId) {
        this.shippingdetailsId = shippingdetailsId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shipment shipment = (Shipment) o;
        return id == shipment.id && shipmentmethodId == shipment.shipmentmethodId && shippingdetailsId == shipment.shippingdetailsId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, shipmentmethodId, shippingdetailsId);
    }
}
