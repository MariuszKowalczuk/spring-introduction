package pl.dominisz.springintroduction.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

/**
 * @author Mariusz Kowalczuk
 */
class OrderTest {

    private Order order = new Order();

    @Test
    public void orderShouldHaveTwoOrderItemsAfterAddingTwoItems() {

        //given

        OrderItem hotDog = new OrderItem("Hot dog", new BigDecimal("3.59"));
        OrderItem coffee = new OrderItem("Coffee", new BigDecimal("4.99"));

        //when
        order.addItem(hotDog);
        order.addItem(coffee);

        //then
        Assertions.assertEquals(2, order.getItems().size());
        Assertions.assertEquals(new BigDecimal("8.58"), order.getAmount());


    }

    @Test
    public void newOrderShouldBeEmpty() {

        Assertions.assertTrue(order.getItems().isEmpty());
        Assertions.assertEquals(BigDecimal.ZERO, order.getAmount());
    }

}