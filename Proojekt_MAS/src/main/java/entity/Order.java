package entity;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class Order {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ordernumber")
    private int ordernumber;
    @Basic
    @Column(name = "shipment_id")
    private int shipmentId;
    @Basic
    @Column(name = "customer_id")
    private int customerId;

    public int getOrdernumber() {
        return ordernumber;
    }

    public void setOrdernumber(int ordernumber) {
        this.ordernumber = ordernumber;
    }

    public int getShipmentId() {
        return shipmentId;
    }

    public void setShipmentId(int shipmentId) {
        this.shipmentId = shipmentId;
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
        Order order = (Order) o;
        return ordernumber == order.ordernumber && shipmentId == order.shipmentId && customerId == order.customerId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(ordernumber, shipmentId, customerId);
    }
}
