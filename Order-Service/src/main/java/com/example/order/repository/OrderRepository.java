package com.example.order.repository;

import com.example.order.model.Order;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class OrderRepository implements PanacheRepositoryBase<Order, Long> {
    // Репозиторий уже имеет все CRUD методы благодаря Panache
}
