package pl.dominisz.springintroduction.service;

import org.springframework.stereotype.Component;
import pl.dominisz.springintroduction.exception.UnreachableException;
import pl.dominisz.springintroduction.model.ChargeResult;

/**
 * @author Mariusz Kowalczuk
 */
@Component
public class DatabaseTransactionLog implements TransactionLog {
    public void logChargeResult(ChargeResult result) {

    }

    public void logConnectException(UnreachableException e) {

    }
}
