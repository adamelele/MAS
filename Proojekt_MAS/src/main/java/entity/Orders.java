package entity;

import jakarta.persistence.*;
import lombok.Getter;

import java.util.Objects;

@Getter
@Entity
public class Orders {
    @Id
    @Column(name = "ordernumber")
    private int ordernumber;

    public void setOrdernumber(int ordernumber) {
        this.ordernumber = ordernumber;
    }

    @Basic
    @Column(name = "customer_id")
    private int customerId;

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    @Basic
    @Column(name = "shipment_id")
    private int shipmentId;

    public void setShipmentId(int shipmentId) {
        this.shipmentId = shipmentId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Orders orders = (Orders) o;
        return ordernumber == orders.ordernumber && customerId == orders.customerId && shipmentId == orders.shipmentId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(ordernumber, customerId, shipmentId);
    }
}
