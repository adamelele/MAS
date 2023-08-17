package entity;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class Payment {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "amount")
    private Object amount;
    @Basic
    @Column(name = "method")
    private String method;
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

    public Object getAmount() {
        return amount;
    }

    public void setAmount(Object amount) {
        this.amount = amount;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
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
        Payment payment = (Payment) o;
        return id == payment.id && orderOrdernumber == payment.orderOrdernumber && Objects.equals(amount, payment.amount) && Objects.equals(method, payment.method) && Objects.equals(status, payment.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, amount, method, status, orderOrdernumber);
    }
}
