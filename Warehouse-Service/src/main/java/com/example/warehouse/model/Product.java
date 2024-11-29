package com.example.warehouse.model;

import io.quarkus.hibernate.orm.panache.PanacheEntity ;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;

@Entity
public class Product extends PanacheEntity  {

    @GeneratedValue
    public Long id;
    public String name;
    public int quantity;
    public double price;

    // Геттеры и сеттеры
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
