package pl.dominisz.springintroduction.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.dominisz.springintroduction.model.Order;
import pl.dominisz.springintroduction.service.OrderService;

/**
 * @author Mariusz Kowalczuk
 */
@RestController
@RequestMapping("/users/{userId}/orders")
public class OrderController {
    private final OrderService orderService;

    @Autowired
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }


    @PostMapping()
    public Order create(@PathVariable long userId, @RequestBody Order order) {
        return orderService.create(userId, order);
    }
}
