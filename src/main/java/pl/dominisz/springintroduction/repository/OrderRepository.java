package pl.dominisz.springintroduction.repository;

import pl.dominisz.springintroduction.model.Order;

/**
 * @author Mariusz Kowalczuk
 */
public interface OrderRepository {
    Order save(Order order);

}
