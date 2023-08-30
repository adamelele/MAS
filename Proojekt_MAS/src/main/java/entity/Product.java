package entity;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
public class Product {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "name")
    private String name;
    @Basic
    @Column(name = "price")
    private Object price;
    @Basic
    @Column(name = "quantityinstock")
    private int quantityinstock;
    @Basic
    @Column(name = "discount")
    private BigDecimal discount;
    @Basic
    @Column(name = "averagerating")
    private BigDecimal averagerating;
    @Basic
    @Column(name = "description")
    private String description;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getPrice() {
        return price;
    }

    public void setPrice(Object price) {
        this.price = price;
    }

    public int getQuantityinstock() {
        return quantityinstock;
    }

    public void setQuantityinstock(int quantityinstock) {
        this.quantityinstock = quantityinstock;
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    public BigDecimal getAveragerating() {
        return averagerating;
    }

    public void setAveragerating(BigDecimal averagerating) {
        this.averagerating = averagerating;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        if (id != product.id) return false;
        if (quantityinstock != product.quantityinstock) return false;
        if (name != null ? !name.equals(product.name) : product.name != null) return false;
        if (price != null ? !price.equals(product.price) : product.price != null) return false;
        if (discount != null ? !discount.equals(product.discount) : product.discount != null) return false;
        if (averagerating != null ? !averagerating.equals(product.averagerating) : product.averagerating != null)
            return false;
        if (description != null ? !description.equals(product.description) : product.description != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (price != null ? price.hashCode() : 0);
        result = 31 * result + quantityinstock;
        result = 31 * result + (discount != null ? discount.hashCode() : 0);
        result = 31 * result + (averagerating != null ? averagerating.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        return result;
    }
}
