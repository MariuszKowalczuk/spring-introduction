package pl.dominisz.springintroduction.service;

import pl.dominisz.springintroduction.model.Order;

/**
 * @author Mariusz Kowalczuk
 */
public interface OrderService {
    Order create(long userId, Order order);
}
