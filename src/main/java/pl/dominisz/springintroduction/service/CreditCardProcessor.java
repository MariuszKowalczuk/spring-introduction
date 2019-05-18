package pl.dominisz.springintroduction.service;

import java.math.BigDecimal;

/**
 * @author Mariusz Kowalczuk
 */
public interface CreditCardProcessor {

    ChargeResult charge(CreditCard creditCard, BigDecimal amount);
}
