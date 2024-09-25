package com.hackbattle.byebyeworld.Controllers;

import com.hackbattle.byebyeworld.Entity.Users;
import com.hackbattle.byebyeworld.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public ResponseEntity<List<Users>> getAllUsers() {
        List<Users> users = userRepository.findAll();
        return ResponseEntity.ok(users);
    }
    @GetMapping("/{email}")
    public Users getUserByEmail(@PathVariable String email) {
        return userRepository.findByEmail(email);
    }
    @PostMapping
    public Users createUser(@RequestBody Users user) {
        return userRepository.save(user);
    }
    @PutMapping("/{email}")
    public Users updateUser(@PathVariable String email, @RequestBody Users user) {
        Users existingUser = userRepository.findByEmail(email);
        existingUser.setUsername(user.getUsername());
        return userRepository.save(existingUser);
    }
}
