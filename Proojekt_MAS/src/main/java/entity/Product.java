package entity;

import jakarta.persistence.*;
import lombok.Getter;

import java.math.BigDecimal;
import java.util.Objects;

@Getter
@Entity
public class Product {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
    @Column(name = "price")
    private BigDecimal price;

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Basic
    @Column(name = "quantityinstock")
    private int quantityinstock;

    public void setQuantityinstock(int quantityinstock) {
        this.quantityinstock = quantityinstock;
    }

    @Basic
    @Column(name = "discount")
    private BigDecimal discount;

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    @Basic
    @Column(name = "averagerating")
    private BigDecimal averagerating;

    public void setAveragerating(BigDecimal averagerating) {
        this.averagerating = averagerating;
    }

    @Basic
    @Column(name = "description")
    private String description;

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "category_id")
    private int categoryId;

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return id == product.id && quantityinstock == product.quantityinstock && categoryId == product.categoryId && Objects.equals(name, product.name) && Objects.equals(price, product.price) && Objects.equals(discount, product.discount) && Objects.equals(averagerating, product.averagerating) && Objects.equals(description, product.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, price, quantityinstock, discount, averagerating, description, categoryId);
    }
}
