package pl.dominisz.springintroduction.repository;

import org.springframework.stereotype.Repository;
import pl.dominisz.springintroduction.model.Order;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Mariusz Kowalczuk
 */
@Repository
public class ListOrderRepository implements OrderRepository {
    private List<Order> orders = new ArrayList<>();
    private long lastId = 0;


    @Override
    public Order save(Order order) {
        lastId++;
        order.setId(lastId);
        orders.add(order);

        return order;


    }

    @Override
    public List<Order> findAll() {
        return orders;
    }
}
