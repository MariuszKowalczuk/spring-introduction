package pl.dominisz.springintroduction.repository;

import pl.dominisz.springintroduction.model.User;

import java.util.List;
import java.util.Optional;

/**
 * @author Mariusz Kowalczuk
 */
public interface UserRepository {
    User save(User user);
    List<User> findAll();
    Optional<User> findById(long id);
    void deleteById(long id);
    Optional<User> findByEmail(String email);
    boolean existsById(long userId);



}
