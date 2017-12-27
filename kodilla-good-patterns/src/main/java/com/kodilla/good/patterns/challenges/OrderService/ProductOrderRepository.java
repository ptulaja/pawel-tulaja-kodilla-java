package com.kodilla.good.patterns.challenges.OrderService;

import java.time.LocalDateTime;

public class ProductOrderRepository implements OrderRepository {

    public void createOrder(User user, LocalDateTime from) {
        System.out.println("Zamowienie zostalo pomyslnie utworzone i przekazane do systemu.");
    }
}
