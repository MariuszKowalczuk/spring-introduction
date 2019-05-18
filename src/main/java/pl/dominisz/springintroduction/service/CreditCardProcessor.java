package pl.dominisz.springintroduction.service;

import pl.dominisz.springintroduction.model.ChargeResult;
import pl.dominisz.springintroduction.model.CreditCard;

import java.math.BigDecimal;

/**
 * @author Mariusz Kowalczuk
 */
public interface CreditCardProcessor {

    ChargeResult charge(CreditCard creditCard, BigDecimal amount);
}
