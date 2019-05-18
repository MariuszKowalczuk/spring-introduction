package pl.dominisz.springintroduction.service;

import java.math.BigDecimal;

/**
 * @author Mariusz Kowalczuk
 */
public class PaypalCreditCardProcessor implements CreditCardProcessor {
    public ChargeResult charge(CreditCard creditCard, BigDecimal amount) {
        return null;
    }
}
