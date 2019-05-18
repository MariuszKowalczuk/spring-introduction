package pl.dominisz.springintroduction;

import pl.dominisz.springintroduction.model.CreditCard;
import pl.dominisz.springintroduction.model.Order;
import pl.dominisz.springintroduction.model.OrderItem;
import pl.dominisz.springintroduction.model.Receipt;
import pl.dominisz.springintroduction.service.*;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Application {

    public static void main(String[] args) {

        PaypalCreditCardProcessor processor = new PaypalCreditCardProcessor();
        DatabaseTransactionLog transactionLog = new DatabaseTransactionLog();
        BillingService billingService = new CreditCardBillingService(processor, transactionLog);
        CreditCard creditCard = new CreditCard("Jan", "Kowalski", "123", LocalDate.of(2022, 5, 1));

        Order order = new Order();
        OrderItem hotDog = new OrderItem("Hot dog", new BigDecimal("3.59"));
        OrderItem coffee = new OrderItem("Coffee", new BigDecimal("4.99"));
        order.addItem(hotDog);
        order.addItem(coffee);

        Receipt receipt = billingService.chargeOrder(order, creditCard);

        System.out.println(receipt);
    }

}
