package pl.dominisz.springintroduction.model;

import java.math.BigDecimal;

/**
 * @author Mariusz Kowalczuk
 */
public class Receipt {
    public static Receipt forSuccessfulCharge(BigDecimal amount) {
        return null;
    }

    public static Receipt forSystemFailure(String message) {
        return null;
    }

    public static Receipt forDeclinedCharge(Object declineMessage) {
        return null;
    }
}
