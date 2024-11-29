package com.example.warehouse.repository;

import com.example.warehouse.model.Product;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ProductRepository implements PanacheRepositoryBase<Product, Long> {
    // Репозиторий уже имеет все CRUD методы благодаря Panache
}
