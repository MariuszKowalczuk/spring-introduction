package pl.dominisz.springintroduction.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import pl.dominisz.springintroduction.exception.UnreachableException;
import pl.dominisz.springintroduction.model.*;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Mariusz Kowalczuk
 */
class CreditCardBillingServiceTest {
    @Test
    public void shouldSuccefullyChargeCard(){
        CreditCard creditCard = new CreditCard("Jan", "Kowalski", "123", LocalDate.of(2022, 5, 1));
        Order order = new Order();
        OrderItem hotDog = new OrderItem("Hot dog", new BigDecimal("3.59"));
        OrderItem coffee = new OrderItem("Coffee", new BigDecimal("4.99"));
        order.addItem(hotDog);
        order.addItem(coffee);
        CreditCardProcessor processor = Mockito.mock(CreditCardProcessor.class);
        TransactionLog transactionLog = Mockito.mock(TransactionLog.class);
        CreditCardBillingService creditCardBillingService = new CreditCardBillingService(processor, transactionLog);

        Mockito.when(processor.charge(creditCard, order.getAmount())).thenReturn(new ChargeResult("successful", true));
        Receipt receipt = creditCardBillingService.chargeOrder(order, creditCard);

        Assertions.assertTrue(receipt.isSuccessful());
        Assertions.assertEquals(new BigDecimal("8.58"), receipt.getAmount());
    }

    @Test
    public void shouldDeclinedCharge(){
        CreditCard creditCard = new CreditCard("Jan", "Kowalski", "123", LocalDate.of(2022, 5, 1));
        Order order = new Order();
        OrderItem hotDog = new OrderItem("Hot dog", new BigDecimal("3.59"));
        OrderItem coffee = new OrderItem("Coffee", new BigDecimal("4.99"));
        order.addItem(hotDog);
        order.addItem(coffee);
        CreditCardProcessor processor = Mockito.mock(CreditCardProcessor.class);
        TransactionLog transactionLog = Mockito.mock(TransactionLog.class);
        CreditCardBillingService creditCardBillingService = new CreditCardBillingService(processor, transactionLog);

        Mockito.when(processor.charge(creditCard, order.getAmount())).thenReturn(new ChargeResult("unsuccesful", false));
        Receipt receipt = creditCardBillingService.chargeOrder(order, creditCard);

        Assertions.assertFalse(receipt.isSuccessful());
        Assertions.assertEquals("unsuccesful", receipt.getMessage());
        Mockito.verify(transactionLog);

    }

    @Test
    public void shouldFailureCharge(){
        CreditCard creditCard = new CreditCard("Jan", "Kowalski", "123", LocalDate.of(2022, 5, 1));
        Order order = new Order();
        OrderItem hotDog = new OrderItem("Hot dog", new BigDecimal("3.59"));
        OrderItem coffee = new OrderItem("Coffee", new BigDecimal("4.99"));
        order.addItem(hotDog);
        order.addItem(coffee);
        CreditCardProcessor processor = Mockito.mock(CreditCardProcessor.class);
        TransactionLog transactionLog = Mockito.mock(TransactionLog.class);
        CreditCardBillingService creditCardBillingService = new CreditCardBillingService(processor, transactionLog);

        Mockito.when(processor.charge(creditCard, order.getAmount())).thenThrow(new UnreachableException("connection lost"));
        Receipt receipt = creditCardBillingService.chargeOrder(order, creditCard);

        Assertions.assertFalse(receipt.isSuccessful());
        Assertions.assertEquals("connection lost", receipt.getMessage());

    }



}