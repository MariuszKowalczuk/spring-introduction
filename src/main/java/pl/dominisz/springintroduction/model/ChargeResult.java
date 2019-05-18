package pl.dominisz.springintroduction.model;

import lombok.AllArgsConstructor;

/**
 * @author Mariusz Kowalczuk
 */

@AllArgsConstructor
public class ChargeResult {
    private String message;
    private boolean successful;


    public boolean isSuccessful() {
        return successful;
    }

    public String getDeclineMessage() {
        return message;
    }
}
