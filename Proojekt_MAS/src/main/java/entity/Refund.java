package entity;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class Refund {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "reason")
    private String reason;
    @Basic
    @Column(name = "refundamount")
    private Object refundamount;
    @Basic
    @Column(name = "status")
    private String status;
    @Basic
    @Column(name = "order_ordernumber")
    private int orderOrdernumber;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public Object getRefundamount() {
        return refundamount;
    }

    public void setRefundamount(Object refundamount) {
        this.refundamount = refundamount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getOrderOrdernumber() {
        return orderOrdernumber;
    }

    public void setOrderOrdernumber(int orderOrdernumber) {
        this.orderOrdernumber = orderOrdernumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Refund refund = (Refund) o;
        return id == refund.id && orderOrdernumber == refund.orderOrdernumber && Objects.equals(reason, refund.reason) && Objects.equals(refundamount, refund.refundamount) && Objects.equals(status, refund.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, reason, refundamount, status, orderOrdernumber);
    }
}
