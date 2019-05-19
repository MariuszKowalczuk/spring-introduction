package pl.dominisz.springintroduction.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.dominisz.springintroduction.model.User;
import pl.dominisz.springintroduction.service.UserService;

import java.util.List;
import java.util.Optional;

/**
 * @author Mariusz Kowalczuk
 */
@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

//    @Autowired tak robimy, gdy zależność jest opcjonalna
//    private UserService userService;

    @GetMapping("/{id}")
    public ResponseEntity<User> getUser(@PathVariable("id") long id) {
        Optional<User> optionalUser = userService.findById(id);
        if(optionalUser.isPresent()){
            return ResponseEntity.ok(optionalUser.get());
        }
        else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

    }
    @GetMapping
    public List<User> findAll() {
        return userService.findAll();

    }
    @PostMapping
    public User createUser(@RequestBody User user){
        return userService.create(user);
    }


}
