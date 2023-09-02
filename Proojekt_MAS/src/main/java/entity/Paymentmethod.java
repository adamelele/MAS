package entity;

import jakarta.persistence.*;
import lombok.Getter;

import java.util.Objects;

@Getter
@Entity
public class Paymentmethod {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @jakarta.persistence.Column(name = "id")
    private int id;

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "method")
    private String method;

    public void setMethod(String method) {
        this.method = method;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Paymentmethod that = (Paymentmethod) o;
        return id == that.id && Objects.equals(method, that.method);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, method);
    }
}
