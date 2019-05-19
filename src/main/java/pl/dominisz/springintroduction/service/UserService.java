package pl.dominisz.springintroduction.service;

import pl.dominisz.springintroduction.model.User;

import java.util.List;
import java.util.Optional;

/**
 * @author Mariusz Kowalczuk
 */
public interface UserService {
    public List<User> findAll();

    Optional<User> findById(long id);

    void deleteById(long id);

    User create(User user);

    Optional<User> findByEmail(String email);



}
