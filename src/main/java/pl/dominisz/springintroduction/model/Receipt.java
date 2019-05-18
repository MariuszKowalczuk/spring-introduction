package pl.dominisz.springintroduction.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.math.BigDecimal;

/**
 * @author Mariusz Kowalczuk
 */
@AllArgsConstructor
@ToString
@Getter
public class Receipt {
    private String message;
    private BigDecimal amount;
    private boolean successful;



    public static Receipt forSuccessfulCharge(BigDecimal amount) {
        return new Receipt(null, amount, true);
    }

    public static Receipt forSystemFailure(String message) {
        return new Receipt(message, null, false);
    }

    public static Receipt forDeclinedCharge(String declineMessage) {
        return new Receipt(declineMessage, null, false);
    }

}
