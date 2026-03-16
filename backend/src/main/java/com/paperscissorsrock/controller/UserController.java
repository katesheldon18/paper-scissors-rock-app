package com.paperscissorsrock.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable;
import java.util.List;
import java.util.Optional;
import com.paperscissorsrock.service.UserService;
import com.paperscissorsrock.entity.User;

@RestController
RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService UserService;

    @GetMapping("{id}")
    public Optional<User> getUserById(@PathVariable Long id) {
        return userService.getUserById(id);
    }

    @GetMapping()
    public List<User> getUsers() {
        return userService.getUsers();
    }

    @PostMapping()
    public User createUser(User user) {
        return userService.createUser(user);
    }
}