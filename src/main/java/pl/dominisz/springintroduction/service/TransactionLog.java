package pl.dominisz.springintroduction.service;

/**
 * @author Mariusz Kowalczuk
 */
public interface TransactionLog {


    void logChargeResult(ChargeResult result);

    void logConnectException(UnreachableException e);
}
