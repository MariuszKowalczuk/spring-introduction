package pl.dominisz.springintroduction.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Mariusz Kowalczuk
 */
@Getter
@Setter
@AllArgsConstructor
public class User {
    private long id;
    private String name;
    private String email;
    private CreditCard creditCard;


}
