package pl.dominisz.springintroduction.repository;

import pl.dominisz.springintroduction.model.User;

/**
 * @author Mariusz Kowalczuk
 */
public interface UserRepository {
    User save(User user);

}
