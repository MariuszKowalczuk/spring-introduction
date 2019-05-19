package pl.dominisz.springintroduction.service;

import pl.dominisz.springintroduction.model.Receipt;

import java.util.Optional;

/**
 * @author Mariusz Kowalczuk
 */
public interface ReceiptService {
    Optional <Receipt> findById(long id);
}
