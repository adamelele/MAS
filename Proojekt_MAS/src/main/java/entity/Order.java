package entity;

import jakarta.persistence.*;

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

        if (ordernumber != order.ordernumber) return false;
        if (shipmentId != order.shipmentId) return false;
        if (customerId != order.customerId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = ordernumber;
        result = 31 * result + shipmentId;
        result = 31 * result + customerId;
        return result;
    }
}
