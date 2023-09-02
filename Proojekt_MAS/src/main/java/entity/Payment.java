package entity;

import jakarta.persistence.*;
import lombok.Getter;

import java.math.BigDecimal;
import java.util.Objects;

@Getter
@Entity
public class Payment {
    @Id
    @jakarta.persistence.Column(name = "id")
    private int id;

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "amount")
    private BigDecimal amount;

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    @Basic
    @Column(name = "status")
    private String status;

    public void setStatus(String status) {
        this.status = status;
    }

    @Basic
    @Column(name = "ordernumber")
    private int ordernumber;

    public void setOrdernumber(int ordernumber) {
        this.ordernumber = ordernumber;
    }

    @Basic
    @Column(name = "paymentmethod_id")
    private int paymentmethodId;

    public void setPaymentmethodId(int paymentmethodId) {
        this.paymentmethodId = paymentmethodId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Payment payment = (Payment) o;
        return id == payment.id && ordernumber == payment.ordernumber && paymentmethodId == payment.paymentmethodId && Objects.equals(amount, payment.amount) && Objects.equals(status, payment.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, amount, status, ordernumber, paymentmethodId);
    }

}
