package entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.Objects;

@Entity
public class Refund {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @jakarta.persistence.Column(name = "id")
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "reason")
    private String reason;

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    @Basic
    @Column(name = "refundamount")
    private BigDecimal refundamount;

    public BigDecimal getRefundamount() {
        return refundamount;
    }

    public void setRefundamount(BigDecimal refundamount) {
        this.refundamount = refundamount;
    }

    @Basic
    @Column(name = "status")
    private String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Basic
    @Column(name = "ordernumber")
    private int ordernumber;

    public int getOrdernumber() {
        return ordernumber;
    }

    public void setOrdernumber(int ordernumber) {
        this.ordernumber = ordernumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Refund refund = (Refund) o;
        return id == refund.id && ordernumber == refund.ordernumber && Objects.equals(reason, refund.reason) && Objects.equals(refundamount, refund.refundamount) && Objects.equals(status, refund.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, reason, refundamount, status, ordernumber);
    }
}
