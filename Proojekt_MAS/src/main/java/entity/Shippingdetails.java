package entity;

import jakarta.persistence.*;
import lombok.Getter;

import java.util.Objects;

@Getter
@Entity
public class Shippingdetails {
    @Id
    @jakarta.persistence.Column(name = "id")
    private int id;

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name")
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "surname")
    private String surname;

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Basic
    @Column(name = "phonenumber")
    private String phonenumber;

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    @Basic
    @Column(name = "street")
    private String street;

    public void setStreet(String street) {
        this.street = street;
    }

    @Basic
    @Column(name = "housenumber")
    private Integer housenumber;

    public void setHousenumber(Integer housenumber) {
        this.housenumber = housenumber;
    }

    @Basic
    @Column(name = "zipcode")
    private String zipcode;

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    @Basic
    @Column(name = "country")
    private String country;

    public void setCountry(String country) {
        this.country = country;
    }

    @Basic
    @Column(name = "email")
    private String email;

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "customer_id")
    private Integer customerId;

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shippingdetails that = (Shippingdetails) o;
        return id == that.id && Objects.equals(name, that.name) && Objects.equals(surname, that.surname) && Objects.equals(phonenumber, that.phonenumber) && Objects.equals(street, that.street) && Objects.equals(housenumber, that.housenumber) && Objects.equals(zipcode, that.zipcode) && Objects.equals(country, that.country) && Objects.equals(email, that.email) && Objects.equals(customerId, that.customerId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, surname, phonenumber, street, housenumber, zipcode, country, email, customerId);
    }
}
