package entity;

import jakarta.persistence.*;

import java.math.BigDecimal;

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
    @Column(name = "ordernumber")
    private int ordernumber;

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

    public void setRefundamount(BigDecimal refundamount) {
        this.refundamount = refundamount;
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

        if (id != refund.id) return false;
        if (ordernumber != refund.ordernumber) return false;
        if (reason != null ? !reason.equals(refund.reason) : refund.reason != null) return false;
        if (refundamount != null ? !refundamount.equals(refund.refundamount) : refund.refundamount != null)
            return false;
        if (status != null ? !status.equals(refund.status) : refund.status != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (reason != null ? reason.hashCode() : 0);
        result = 31 * result + (refundamount != null ? refundamount.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + ordernumber;
        return result;
    }
}
