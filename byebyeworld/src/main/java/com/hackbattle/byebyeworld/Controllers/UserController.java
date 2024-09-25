package com.hackbattle.byebyeworld.Controllers;

import com.hackbattle.byebyeworld.Entity.AppUser;
import com.hackbattle.byebyeworld.Repository.UserRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @PostMapping
    public AppUser createUser(@RequestBody AppUser user) {
        return userRepository.save(user);
    }

    @GetMapping
    public List<AppUser> getAllUsers() {
        return userRepository.findAll();
    }
}
