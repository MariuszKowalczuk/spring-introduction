package pl.dominisz.springintroduction.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.math.BigDecimal;

/**
 * @author Mariusz Kowalczuk
 */
@AllArgsConstructor
@Getter
public class OrderItem {
    private String description;
    private BigDecimal price;
    private int quantity;

    public OrderItem(String description, BigDecimal price) {
       this(description, price, 1);

    }


}
