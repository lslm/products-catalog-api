package com.ls.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false, name = "description")
    private String description;

    @Column(nullable = false, name = "supplier")
    private String supplier;

    @Column(nullable = false, name = "price")
    private double price;

    @Column(nullable = false, name = "max_discount")
    private double maxDiscount;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSupplier() {
        return supplier;
    }

    public double getMaxDiscount() {
        return maxDiscount;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setMaxDiscount(double maxDiscount) {
        this.maxDiscount = maxDiscount;
    }

    public double getPriceWithDiscount(double discount) {
        if (discount > maxDiscount)
            return price - (price * maxDiscount);
        else
            return price - (price * discount);
    }
}
