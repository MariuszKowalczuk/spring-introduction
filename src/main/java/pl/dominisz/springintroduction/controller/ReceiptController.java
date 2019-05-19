package pl.dominisz.springintroduction.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import pl.dominisz.springintroduction.model.Receipt;


/**
 * @author Mariusz Kowalczuk
 */
public class ReceiptController {
    public ResponseEntity<Receipt> findById(long id){
        return new ResponseEntity(HttpStatus.BAD_REQUEST);

    }
}
