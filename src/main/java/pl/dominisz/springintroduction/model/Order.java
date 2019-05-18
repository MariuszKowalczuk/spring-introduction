package pl.dominisz.springintroduction.model;

import lombok.Getter;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Mariusz Kowalczuk
 */
@Getter
public class Order {

    private List<OrderItem> items;

    public Order() {
        items = new ArrayList<>();

    }

    public void addItem(OrderItem orderItem) {
        items.add(orderItem);
    }

    public BigDecimal getAmount() {
        BigDecimal sum = BigDecimal.ZERO;
        for (OrderItem item : items) {
            sum = sum.add(item.getPrice().multiply(BigDecimal.valueOf(item.getQuantity())));
        }
        return sum;
    }

}
