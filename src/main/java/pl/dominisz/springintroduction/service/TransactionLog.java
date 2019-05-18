package pl.dominisz.springintroduction.service;

import org.springframework.stereotype.Component;
import pl.dominisz.springintroduction.exception.UnreachableException;
import pl.dominisz.springintroduction.model.ChargeResult;

/**
 * @author Mariusz Kowalczuk
 */
public interface TransactionLog {


    void logChargeResult(ChargeResult result);

    void logConnectException(UnreachableException e);
}
