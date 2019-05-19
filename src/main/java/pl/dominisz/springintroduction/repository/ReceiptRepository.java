package pl.dominisz.springintroduction.repository;

import pl.dominisz.springintroduction.model.Receipt;

import java.util.Optional;

/**
 * @author Mariusz Kowalczuk
 */
public interface ReceiptRepository {
    Optional<Receipt> findById(long id);
}
