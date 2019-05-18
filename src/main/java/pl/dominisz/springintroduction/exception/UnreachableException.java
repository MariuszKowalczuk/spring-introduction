package pl.dominisz.springintroduction.exception;

/**
 * @author Mariusz Kowalczuk
 */
public class UnreachableException extends RuntimeException{
    public UnreachableException(String message) {
        super(message);

    }
}
