package pl.dominisz.springintroduction.service;

import pl.dominisz.springintroduction.model.Order;

import java.util.List;

/**
 * @author Mariusz Kowalczuk
 */
public interface OrderService {
    Order create(long userId, Order order);
    List<Order> findAll();
}
