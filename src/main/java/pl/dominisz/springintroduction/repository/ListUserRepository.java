package pl.dominisz.springintroduction.repository;

import org.springframework.stereotype.Repository;
import pl.dominisz.springintroduction.model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @author Mariusz Kowalczuk
 */
@Repository
public class ListUserRepository implements UserRepository {
    private List<User> users = new ArrayList<>();
    private long lastId = 0;

    @Override
    public List<User> findAll() {
        return users;
    }

    @Override
    public Optional<User> findById(long id) {
        return users.stream().filter(user -> user.getId() == id).findFirst();

    }

    @Override
    public void deleteById(long id) {

    }

    @Override
    public User save(User user) {
        lastId++;
        user.setId(lastId);
        users.add(user);

        return user;
    }

    @Override
    public Optional<User> findByEmail(String email) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(long userId) {
        return users.stream().anyMatch(user -> user.getId() == userId );
    }
}
