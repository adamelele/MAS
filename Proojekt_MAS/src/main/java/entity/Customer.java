package entity;

import jakarta.persistence.*;
import lombok.Getter;

import java.util.Objects;

@Getter
@Entity
public class Customer {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @jakarta.persistence.Column(name = "id")
    private int id;

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "username")
    private String username;

    public void setUsername(String username) {
        this.username = username;
    }

    @Basic
    @Column(name = "password")
    private String password;

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "email")
    private String email;

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return id == customer.id && Objects.equals(username, customer.username) && Objects.equals(password, customer.password) && Objects.equals(email, customer.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, username, password, email);
    }
}
