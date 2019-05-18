package pl.dominisz.springintroduction.model;


import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDate;

/**
 * @author Mariusz Kowalczuk
 */
@Getter
@AllArgsConstructor
public class CreditCard {
    private String firstName;
    private String lastName;
    private String number;
    private LocalDate expireDate;


}
