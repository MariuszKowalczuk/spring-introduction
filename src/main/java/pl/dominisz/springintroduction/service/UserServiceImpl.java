package pl.dominisz.springintroduction.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.dominisz.springintroduction.model.User;
import pl.dominisz.springintroduction.repository.UserRepository;

import java.util.List;
import java.util.Optional;

/**
 * @author Mariusz Kowalczuk
 */
@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {

        this.userRepository = userRepository;
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public Optional<User> findById(long id) {
        return userRepository.findById(id);
    }

    @Override
    public void deleteById(long id) {

    }

    @Override
    public User create(User user) {
        return userRepository.save(user);

    }

    @Override
    public Optional<User> findByEmail(String email) {
        return Optional.empty();
    }
}
